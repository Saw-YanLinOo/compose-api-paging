package com.yanyan.beers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.yanyan.beers.presentation.BeerScreen
import com.yanyan.beers.presentation.BeerViewModel
import com.yanyan.beers.ui.theme.BeersTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeersTheme() {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    var viewModel = hiltViewModel<BeerViewModel>();
                    val beers = viewModel.beerPagingFlow.collectAsLazyPagingItems()

                    BeerScreen(beers = beers)
                }
            }
        }
    }
}