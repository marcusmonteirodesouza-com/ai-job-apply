locals {
  max_instance_request_concurrency = 80
}

module "cloud_run_service_api_naming" {
  source = "../../../../../../../modules/naming"

  description = "apiserver"
  environment = var.environment
  location    = var.region
  resource    = "cloud-run-service"
}

resource "google_cloud_run_v2_service" "api_server" {
  name     = module.cloud_run_service_api_naming.name
  location = var.region
  ingress  = "INGRESS_TRAFFIC_ALL"
  # TODO(Marcus): Uncomment when ready to use a load balancer. Also revert bypassing of 'constraints/run.allowedIngress' organization policy.
  # ingress  = "INGRESS_TRAFFIC_INTERNAL_LOAD_BALANCER"

  template {
    service_account = var.api_server_sa_email

    scaling {
      min_instance_count = var.api_server_min_instance_count
      max_instance_count = var.api_server_max_instance_count
    }

    max_instance_request_concurrency = local.max_instance_request_concurrency

    containers {
      image = "${data.docker_registry_image.api_server.name}@${data.docker_registry_image.api_server.sha256_digest}"

      startup_probe {
        http_get {
          path = "/actuator/health"
        }
      }

      liveness_probe {
        http_get {
          path = "/actuator/health"
        }
      }

      # TODO(Marcus): Uncomment when going live
      # resources {
      #   startup_cpu_boost = true
      # }

      # See https://cloud.google.com/run/docs/tips/java#container
      env {
        name  = "JAVA_TOOL_OPTIONS"
        value = "-XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Xss256k"
      }

      env {
        name  = "SERVER_MAX_THREADS"
        value = local.max_instance_request_concurrency
      }
    }

    vpc_access {
      network_interfaces {
        network    = data.google_compute_network.network.id
        subnetwork = data.google_compute_subnetwork.subnetwork.id
      }
      egress = "ALL_TRAFFIC"
    }
  }
}
