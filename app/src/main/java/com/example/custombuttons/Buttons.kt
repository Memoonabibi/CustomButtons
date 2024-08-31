package com.project.custombutton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true,
    showSystemUi = true)
@Composable
fun MyButton() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "Cute Buttons",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009688)
            ),
            modifier = Modifier
                .padding(top = 50.dp)
                .height(70.dp)
                .width(200.dp)
        ) {
            Text(text = "Sign in",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold)
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFF6F61)
            ),
            modifier = Modifier
                .padding(top = 20.dp)
                .height(70.dp)
                .width(200.dp)
        ) {
            Text(text = "Sign up",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold)
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF00B2A9)
            ),
            modifier = Modifier
                .padding(top = 20.dp)
                .height(70.dp)
                .width(200.dp)
        ) {
            Text(text = "Cancel",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
                    modifier = Modifier
                    .padding(top = 20.dp)
                .height(70.dp)
                .width(200.dp)

        )
        {
            Text(
                text = "Outlined",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}