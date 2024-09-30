package com.example.happybirthdayrisky

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdayrisky.ui.theme.HappyBirthdayRiskyTheme // Pastikan impor tema benar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent digunakan untuk mendefinisikan tampilan UI berbasis Compose
        setContent {
            HappyBirthdayRiskyTheme {
                // Menggunakan tema HappyBirthdayRiskyTheme untuk menerapkan skema warna dan gaya
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Menampilkan komponen GreetingText yang memuat pesan ulang tahun
                    GreetingText(
                        message = "Happy Birthday Risky!",
                        from = "From Nadilla",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

// Fungsi GreetingText adalah composable function yang digunakan untuk menampilkan teks pesan ulang tahun
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = message,//pesan yang akan ditampilkan
            fontSize = 100.sp,//ukuran teks
            lineHeight = 116.sp,//jarak antar baris teks
            textAlign = TextAlign.Center,//mengatur teks agar berada ditengah
            modifier = Modifier.align(Alignment.CenterHorizontally) // Mengatur agar teks berada di tengah secara horizontal
        )
        Text(
            text = from, //nama pengirim yang akan ditampilkan
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)//memberikan padding sekitar teks
                .align(Alignment.End)//menempatkan teks disudut kanan bawah
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayRiskyTheme {
        GreetingText(message = "Happy Birthday Risky", from = "From Nadilla")
    }
}
