package com.example.tugasku

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val gambar1 = painterResource(id = R.drawable.gambar1)
    val gambar2 = painterResource(id = R.drawable.gambar2)
    val gambar3 = painterResource(id = R.drawable.gambar3)

    // Warna teks biar kebaca di atas poster gelap
    val emas = Color(0xFFFFD54F)
    val putih = Color.White
    val bayangan = Shadow(
        color = Color.Black,
        offset = Offset(3f, 3f),
        blurRadius = 8f
    )

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = gambar1,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = emas,
                style = TextStyle(shadow = bayangan)
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = putih,
                style = TextStyle(shadow = bayangan)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = gambar2,
                contentDescription = null,
                modifier = Modifier.size(150.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = emas,
                style = TextStyle(shadow = bayangan)
            )
            Text(
                text = "Andhika Rizky Saputra",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = putih,
                style = TextStyle(shadow = bayangan)
            )
            Text(
                text = "20240140070",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = putih,
                style = TextStyle(shadow = bayangan)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Image(
                painter = gambar3,
                contentDescription = null,
                modifier = Modifier
                    .size(290.dp)
                    .clip(CircleShape)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
                    .background(Color.Black),
                contentScale = ContentScale.Crop
            )
        }
    }
}