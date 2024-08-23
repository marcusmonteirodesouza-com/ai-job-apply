data "docker_registry_image" "api_server" {
  name = var.api_server_image
}

data "google_compute_network" "network" {
  project = var.network_project_id
  name    = var.network
}

data "google_compute_subnetwork" "subnetwork" {
  project = var.network_project_id
  region  = var.region
  name    = var.subnetwork
}