package com.example.calcuradora

import android.annotation.SuppressLint
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
import com.example.calcuradora.databinding.ActivityMainBinding
import com.example.calcuradora.ui.theme.CalcuradoraTheme
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultado = binding.resultResultado

        binding.button1.setOnClickListener {
            resultado.text = "${resultado.text}1"
        }

        binding.button2.setOnClickListener {
            resultado.text = "${resultado.text}2"
        }

        binding.button3.setOnClickListener {
            resultado.text = "${resultado.text}3"
        }

        binding.button4.setOnClickListener {
            resultado.text = "${resultado.text}4"
        }

        binding.button5.setOnClickListener {
            resultado.text = "${resultado.text}5"
        }

        binding.button6.setOnClickListener {
            resultado.text = "${resultado.text}6"
        }

        binding.button7.setOnClickListener {
            resultado.text = "${resultado.text}7"
        }

        binding.button8.setOnClickListener {
            resultado.text = "${resultado.text}8"
        }

        binding.button9.setOnClickListener {
            resultado.text = "${resultado.text}9"
        }

        binding.button0.setOnClickListener {
            resultado.text = "${resultado.text}0"
        }

        binding.buttonDivisao.setOnClickListener {
            resultado.text = "${resultado.text}/"
        }

        binding.buttonMultiplicacao.setOnClickListener {
            resultado.text = "${resultado.text}*"
        }

        binding.buttonSubtracao.setOnClickListener {
            resultado.text = "${resultado.text}-"
        }

        binding.buttonPorcentagem.setOnClickListener {
            resultado.text = "${resultado.text}%"
        }

        binding.buttonAdicao.setOnClickListener {
            resultado.text = "${resultado.text}+"
        }

        binding.buttonInverter.setOnClickListener {
            resultado.text = "${resultado.text}%"
        }

        binding.buttonApagar.setOnClickListener {
            resultado.text = resultado.text.dropLast(1)
        }

        binding.buttonIgual.setOnClickListener {
            val res = Expression(resultado.text.toString()).calculate()

            binding.resultResultadoCalculado.text = res.toString()
        }
    }
}

