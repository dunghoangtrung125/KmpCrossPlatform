import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.HomeRoute

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun App() {
    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("App name")
                    }
                )
            }
        ) { innerPadding ->
            HomeRoute(modifier = Modifier.padding(innerPadding))
        }
    }
}