locals {
  environment_code_map = {
    "development"   = "d"
    "nonproduction" = "n"
    "production"    = "p"
  }

  environment_code = lookup(local.environment_code_map, var.environment, "d")

  location_map = {
    "global"      = "glbl"
    "us"          = "us"
    "us-central1" = "us-ctl1"
  }

  location_abbreviation = lookup(local.location_map, var.location, null)

  prefix = "mms"

  project = "aijobapply"

  resource_abbreviation_map = {
    "artifact-registry-repository" = "artfctrepo"
    "cloudbuild-trigger"           = "cbt"
    "cloud-function"               = "cf"
    "cloud-run-job"                = "runjob"
    "cloud-run-service"            = "run"
    "cloud-scheduler-job"          = "schedjob"
    "compute-disk"                 = "disk"
    "compute-instance"             = "vm"
    "dataflow-job"                 = "dataflwjob"
    "firewall"                     = "fw"
    "gcs-bucket"                   = "bkt"
    "gke-cluster"                  = "gke"
    "gke-node-pool"                = "pool"
    "global-address"               = "ipaddr"
    "pubsub-topic"                 = "pubsubtopic"
    "pubsub-subscription"          = "pubsubsubscr"
    "network"                      = "vpc"
    "network-endpoint-group"       = "neg"
    "redis-cluster"                = "redisclstr"
    "secret-manager-secret"        = "secret"
    "subnetwork"                   = "sb"
  }

  resource_abbreviation = lookup(local.resource_abbreviation_map, var.resource, null)

  suffix = random_id.naming_suffix.hex
}

resource "random_id" "naming_suffix" {
  byte_length = 2
}