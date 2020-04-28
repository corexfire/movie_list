package com.zubair.assesment.model

import com.google.gson.annotations.SerializedName

data class TMDBThumb(
    val id: Int,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    val title: String,
    @SerializedName("vote_average")
    val rating: Double
)