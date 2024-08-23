resource "google_artifact_registry_repository_iam_member" "api_server_sa_api_server_repository" {
  location   = google_artifact_registry_repository.api_server.location
  repository = google_artifact_registry_repository.api_server.name
  role       = "roles/artifactregistry.reader"
  member     = "serviceAccount:${var.api_server_sa_email}"
}