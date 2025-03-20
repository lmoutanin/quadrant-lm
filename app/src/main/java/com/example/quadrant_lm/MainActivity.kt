package com.example.quadrant_lm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant_lm.ui.theme.QuadrantlmTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantlmTheme {
               Surface(modifier  = Modifier.fillMaxSize()) {
                   Greeting()
               }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (modifier){
            GreetingRow(
                titleOne = stringResource(R.string.text_composable),
                textOne = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                titleTwo = stringResource(R.string.image_composable),
                textTwo = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                colorOne = 0xFFEADDFF,
                colorTwo = 0xFFD0BCFF,
                sizeOne = 16.0,
                sizeTwo = 15.5,
                modifier = Modifier.weight(1f)
                )

            GreetingRow(
                titleOne = stringResource(R.string.row_composable),
                textOne = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                titleTwo = stringResource(R.string.column_composable),
                textTwo = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                colorOne = 0xFFB69DF8,
                colorTwo =0xFFF6EDFF,
                sizeOne = 15.0,
                sizeTwo = 15.5,
                modifier = Modifier.weight(1f)
            )
    }
}

@Composable
fun GreetingColum (textOne : String ,textTwo : String,color :Long , size :Double ,modifier: Modifier = Modifier){
    Column(
          modifier
              .fillMaxSize()
              .background(Color(color))
              .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = textOne ,
            fontWeight = FontWeight.Bold,
            modifier=Modifier.padding( bottom = 16.dp)
            )

        Text(
            text = textTwo,
            fontSize = size.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingRow(titleOne : String , textOne: String , titleTwo : String , textTwo : String,
                colorOne : Long, colorTwo : Long , sizeOne :Double ,sizeTwo :Double , modifier: Modifier = Modifier
){
    Row(modifier) {
        GreetingColum(titleOne,textOne,colorOne,sizeOne,modifier)
        GreetingColum(titleTwo,textTwo,colorTwo,sizeTwo,modifier)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuadrantlmTheme {
        Greeting()
    }
}