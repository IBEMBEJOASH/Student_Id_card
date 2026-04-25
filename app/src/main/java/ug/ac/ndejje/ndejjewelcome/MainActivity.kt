package ug.ac.ndejje.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ug.ac.ndejje.ndejjewelcome.ui.theme.NdejjeWelcomeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {

                }
            }
        }
    }


@Composable
fun StudentInfo() {
    Text(
        text = "Ibembe Joash",
        style = MaterialTheme.typography.headlineSmall,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )
    Text(
        text = "Bachelor of Information Technology",
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp)
    )
    Text(
        text = "REG NO.:",
        style = MaterialTheme.typography.labelLarge,
        fontWeight = FontWeight.ExtraBold
    )
    Text(
        text = "24/2/314/D/335",
        style = MaterialTheme.typography.bodyLarge,
        fontFamily = FontFamily.Monospace
    )
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
NdejjeWelcomeAppTheme {
    StudentInfo()
}
}