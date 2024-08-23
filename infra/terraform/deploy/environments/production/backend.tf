terraform {
  backend "gcs" {
    bucket = "mms-aijobapply-p-bkt-na-ne1-tfstate-22d4"
    prefix = "deploy"
  }
}