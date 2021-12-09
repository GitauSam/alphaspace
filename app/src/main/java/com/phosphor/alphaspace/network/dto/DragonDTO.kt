package com.phosphor.alphaspace.network.dto

import com.google.gson.annotations.SerializedName

data class DragonDTO(
  val name: String,
  val type: String,
  val active: Boolean,
  @SerializedName("flickr_images")
  val images: List<String>,
  @SerializedName("first_flight")
  val firstFlightDate: String,
  @SerializedName("height_w_trunk")
  val trunkHeight: MeasurementDTO,
  @SerializedName("diameter")
  val diameter: MeasurementDTO,
  @SerializedName("wikipedia")
  val externalLink: String,
  val description: String
)
