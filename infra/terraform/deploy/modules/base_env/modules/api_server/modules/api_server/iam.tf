resource "google_cloud_run_service_iam_member" "api_server_allow_unauthenticated" {
  location = google_cloud_run_v2_service.api_server.location
  project  = google_cloud_run_v2_service.api_server.project
  service  = google_cloud_run_v2_service.api_server.name
  role     = "roles/run.invoker"
  member   = "allUsers"

  depends_on = [
    time_sleep.wait_location_tag_binding_api_server_all_users_ingress
  ]
}