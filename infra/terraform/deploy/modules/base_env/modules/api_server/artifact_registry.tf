locals {
  api_server_dir        = "${path.module}/../../../../../../../backend/api-server"
  api_server_repository = "${google_artifact_registry_repository.api_server.location}-docker.pkg.dev/${google_artifact_registry_repository.api_server.project}/${google_artifact_registry_repository.api_server.name}"
  api_server_image      = "${local.api_server_repository}/apiserver"
}

module "api_server_artifact_registry_repository_naming" {
  source = "../../../../../modules/naming"

  description = "apiserver"
  environment = var.environment
  location    = "us-central1"
  resource    = "artifact-registry-repository"
}

resource "google_artifact_registry_repository" "api_server" {
  location      = "us-central1"
  repository_id = module.api_server_artifact_registry_repository_naming.name
  format        = "DOCKER"
}

resource "null_resource" "api_server_image" {
  triggers = {
    always_run = "${timestamp()}"
  }

  provisioner "local-exec" {
    command     = "mvn compile jib:build -Dimage=${local.api_server_image}"
    working_dir = local.api_server_dir
  }
}

