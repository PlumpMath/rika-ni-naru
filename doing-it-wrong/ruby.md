# 2017

* March
  * With old versions of `CarrierWave`, you can't use `mount_uploaders` methods.
  * Somewhere between version 0.1x and 1.0, there seems to have been some breaking change to `CarrierWave::Uploader::Serialization#as_json`.
  * I can't figure out why, when or where, but the `as_json` method gets broken with multiple files upload.
