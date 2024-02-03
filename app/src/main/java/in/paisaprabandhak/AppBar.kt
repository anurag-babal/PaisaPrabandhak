package `in`.paisaprabandhak

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomBar(modifier: Modifier) {
  Scaffold(
    bottomBar = {
      BottomAppBar(
        actions = {
          IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Edit, contentDescription = null)
          }
        },
        floatingActionButton = {
          FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = null)
          }
        }
      )
    }
  ) { innerPadding ->
    Text(
      modifier = Modifier.padding(innerPadding),
      text = ""
    )
  }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomBar() {
  BottomBar(modifier = Modifier)
}