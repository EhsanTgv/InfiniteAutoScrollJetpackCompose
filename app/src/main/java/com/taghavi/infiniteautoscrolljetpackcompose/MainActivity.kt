package com.taghavi.infiniteautoscrolljetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.taghavi.infiniteautoscrolljetpackcompose.ui.theme.InfiniteAutoScrollJetpackComposeTheme
import com.taghavi.infiniteautoscrolljetpackcompose.ui.theme.ThemeColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            InfiniteAutoScrollJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = ThemeColor,
                ) {
                    AutoScrollingLazyRow(list = (1..8).take(4)) {
                        LazyListItem(text = "Item $it")
                    }
                }
            }
        }
    }

    @Composable
    fun LazyListItem(text: String) {
        Box(
            modifier = Modifier
                .padding(12.dp)
                .size(150.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text,
                fontSize = 24.sp,
            )
        }
    }
}