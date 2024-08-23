module "api_server_us_central1" {
  source = "./modules/api_server"

  all_users_ingress_tag_value_id = var.all_users_ingress_tag_value_id
  api_server_image               = local.api_server_image
  api_server_min_instance_count  = var.api_server_min_instance_count
  api_server_max_instance_count  = var.api_server_max_instance_count
  api_server_sa_email            = var.api_server_sa_email
  environment                    = var.environment
  network                        = var.network
  network_project_id             = var.network_project_id
  region                         = "us-central1"
  subnetwork                     = var.subnetwork_us_central1

  depends_on = [
    google_artifact_registry_repository_iam_member.api_server_sa_api_server_repository,
    null_resource.api_server_image,
  ]
}