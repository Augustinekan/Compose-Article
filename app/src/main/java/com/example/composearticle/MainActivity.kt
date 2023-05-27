package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticle(){
Column {
    ComposeImage()
    TextColumn()
}
}

@Composable
fun ComposeImage(){
    val imageResource = painterResource(id =R.drawable.bg_compose_background )
    Image(painter = imageResource, contentDescription = "Compose Image")
}

@Composable
fun TextColumn(modifier: Modifier = Modifier){
    Column (modifier = modifier.padding(horizontal = 16.dp)){
        ArticleTitle()
        PrimaryText()
        SecondaryText()
    }
}

@Composable
fun ArticleTitle(modifier: Modifier = Modifier){
    val title =stringResource(id = R.string.JetpackComposeTutorial)
    Text(text = title, fontSize = 24.sp, modifier = modifier.padding(vertical = 16.dp))
}

@Composable
fun PrimaryText(modifier: Modifier = Modifier){
    Text(text = stringResource(id = R.string.JCIsAModernToolkit), fontSize = 16.sp, modifier = modifier)
}

@Composable
fun SecondaryText(modifier: Modifier = Modifier){
    Text(text = stringResource(id = R.string.InThisTutorialYouBuild), modifier = modifier.padding(vertical = 16.dp), fontSize = 16.sp)
}