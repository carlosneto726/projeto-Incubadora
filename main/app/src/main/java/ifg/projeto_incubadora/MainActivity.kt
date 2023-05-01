package ifg.projeto_incubadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ifg.projeto_incubadora.ui.theme.Projeto_IncubadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_IncubadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Incubadora - Criação de uma lista de tarefas.")
                    Text(
                        text = "Projeto Incubadora - Criação de uma lista de tarefas."
                    )

                }
            }
        }
    }
}


// Função que veio padrão junto com o Android Studio.
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Projeto: $name",
        modifier = modifier
    )
}


// Função destinada apenas para o preview.
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Projeto_IncubadoraTheme {
        Greeting("Esse é apenas o preview.")
    }
}