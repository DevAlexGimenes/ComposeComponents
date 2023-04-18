package com.alex.gimenes.apps.composecomponents

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    val scrollState = rememberLazyListState()
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home",
            fontSize = 50.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
                .weight(1f)
        )
        LazyColumn(
            state = scrollState,
            modifier = Modifier.weight(2f)
        ) {
            itemsIndexed(items) { _, item ->
                ItemRow(item, onItemClick = {
                    Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()
                })
            }
        }
    }
}

data class Item(val name: String)

val items = listOf(
    Item("Item 1"),
    Item("Item 2"),
    Item("Item 3"),
    Item("Item 4"),
    Item("Item 5"),
)

@Composable
fun ItemRow(item: Item, onItemClick:() -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 30.dp),
        onClick = { onItemClick() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Gray
        )
    ) {
        Text(
            text = item.name,
            color = Color.Black,
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(3.dp))
        )
    }
}