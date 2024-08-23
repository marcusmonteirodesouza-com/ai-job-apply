module "api_server" {
  source = "./modules/api_server"

  all_users_ingress_tag_value_id = var.all_users_ingress_tag_value_id
  api_server_min_instance_count  = var.api_server_min_instance_count
  api_server_max_instance_count  = var.api_server_max_instance_count
  api_server_sa_email            = var.api_server_sa_email
  environment                    = var.environment
  network                        = var.network
  network_project_id             = var.network_project_id
  subnetwork_us_central1         = var.subnetwork_us_central1
}