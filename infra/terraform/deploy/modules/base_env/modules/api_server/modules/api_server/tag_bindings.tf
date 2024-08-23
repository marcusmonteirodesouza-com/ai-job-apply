resource "google_tags_location_tag_binding" "api_server_all_users_ingress" {
  parent    = "//run.googleapis.com/${google_cloud_run_v2_service.api_server.id}"
  tag_value = var.all_users_ingress_tag_value_id
  location  = google_cloud_run_v2_service.api_server.location
}

resource "time_sleep" "wait_location_tag_binding_api_server_all_users_ingress" {
  create_duration = "60s"

  depends_on = [
    google_tags_location_tag_binding.api_server_all_users_ingress
  ]
}
