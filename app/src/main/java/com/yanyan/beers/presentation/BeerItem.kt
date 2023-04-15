package com.yanyan.beers.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.yanyan.beers.domain.Beer

@Composable
fun BeerItem(
    beer: Beer,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier, elevation = 4.dp) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
            .padding(16.dp)
        ) {

            AsyncImage(model = beer.imageUrl, contentDescription = beer.name,
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier
                    .weight(3f),

                verticalArrangement = Arrangement.Center,
            ) {

                Text(text = beer.name,
                style = MaterialTheme.typography.h6,
                    modifier = Modifier.fillMaxWidth()
                    )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = beer.tagline,
                    fontStyle = FontStyle.Italic,
                    color= Color.LightGray,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = beer.description,

                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "First brewed in ${beer.firstBrewed}",
textAlign=TextAlign.End,
                    fontSize=8.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

//@Preview
//@Composable
//fun BeerItemPreview(){
//    ComposePaging3CachingTheme {
//        BeerItem(beer = Beer(
//            id = 1,
//            name = "Beer",
//            tagline = "This is beer",
//            firstBrewed = "07/02/2023",
//            description = "This is a description for a beer. \n This is description",
//            imageUrl = null,
//        ),
//            modifier = Modifier.fillMaxSize()
//        )
//
//    }
//}