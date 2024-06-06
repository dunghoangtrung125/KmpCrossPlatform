package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeRoute(
    viewModel: HomeViewModel = viewModel { HomeViewModel() },
    modifier: Modifier = Modifier
) {
    val count by viewModel.count.collectAsState()
    HomeScreen(
        onIncrease = viewModel::increase,
        count = count,
        modifier = modifier
    )
}

@Composable
fun HomeScreen(
    onIncrease: () -> Unit,
    count: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = onIncrease) {
            Text("Click me!")
        }
        Text(text = count.toString())
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(
            onIncrease = {},
            count = 1
        )
    }
}