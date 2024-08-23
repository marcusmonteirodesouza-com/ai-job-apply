locals {
  project_id = "mms-aijobapply-p-prj-61fe"
}

provider "google" {
  project               = local.project_id
  user_project_override = true
  billing_project       = local.project_id
}

provider "google-beta" {
  project               = local.project_id
  user_project_override = true
  billing_project       = local.project_id
}

provider "docker" {
  registry_auth {
    address  = "us-central1-docker.pkg.dev"
    username = "oauth2accesstoken"
    password = data.google_client_config.default.access_token
  }
}

data "google_client_config" "default" {
}

module "base_env" {
  source = "../../modules/base_env"

  all_users_ingress_tag_value_id = "tagValues/281479098252412"
  api_server_min_instance_count  = 0
  api_server_max_instance_count  = 1
  api_server_sa_email            = "api-server-sa@mms-aijobapply-p-prj-61fe.iam.gserviceaccount.com"
  environment                    = "production"
  network                        = "mms-networking-p-vpc-shared-cbb5"
  network_project_id             = "mms-sharedvpchost-p-prj-ea49"
  subnetwork_us_central1         = "mms-networking-p-subnet-us-ctl1-default-2cf3"
}