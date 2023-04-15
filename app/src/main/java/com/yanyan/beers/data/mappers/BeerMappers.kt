package com.yanyan.beers.data.mappers

import com.yanyan.beers.data.local.BeerEntity
import com.yanyan.beers.data.remote.BeerDto
import com.yanyan.beers.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return  BeerEntity(
      id = id,
      name=name,
       tagline=tagline,
       description=description,
       firstBrewed = first_brewed,
        imageUrl = image_url,
    )
}

fun BeerEntity.toBeer(): Beer {
    return  Beer(
        id = id,
        name=name,
        tagline=tagline,
        description=description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl,
    )
}