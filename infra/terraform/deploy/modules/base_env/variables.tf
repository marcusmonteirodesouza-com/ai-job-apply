variable "all_users_ingress_tag_value_id" {
  type        = string
  description = "Allow allUsers ingress (unauthenticated invocations) tag value ID."
}

variable "api_server_min_instance_count" {
  type        = number
  description = "API server min instance count."
}

variable "api_server_max_instance_count" {
  type        = number
  description = "API server max instance count."
}

variable "api_server_sa_email" {
  type        = string
  description = "API server service account email address."
}

variable "environment" {
  type        = string
  description = "Environment name (development, nonproduction, production)."
}

variable "network" {
  type        = string
  description = "Network to attach resources to."
}

variable "network_project_id" {
  type        = string
  description = "Project in which the network is provisioned."
}

variable "subnetwork_us_central1" {
  type        = string
  description = "Subnetwork to attach resources to, located on the us-central1 region."
}