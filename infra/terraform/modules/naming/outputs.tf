output "name" {
  value = replace("${local.prefix}-${local.project}-${local.environment_code}-${local.resource_abbreviation}-${local.location_abbreviation}-${var.description}-${local.suffix}", "/-+/", "-")
}