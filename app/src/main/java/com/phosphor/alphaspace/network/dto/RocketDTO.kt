package com.phosphor.alphaspace.network.dto

import com.google.gson.annotations.SerializedName

data class RocketDTO(
  val name: String,
  val type: String,
  val active: Boolean,
  val stages: Int,
  val boosters: Int,
  @SerializedName("cost_per_launch")
  val costPerLaunch: Long,
  @SerializedName("success_rate_pct")
  val successRate: Int,
  @SerializedName("first_flight")
  val firstFlightDate: String,
  val country: String,
  val company: String,
  @SerializedName("wikipedia")
  val externalLink: String,
  val description: String,
  @SerializedName("flickr_images")
  val images: List<String>,
  val height: MeasurementDTO,
  val diameter: MeasurementDTO,
  val mass: WeightDTO
)
