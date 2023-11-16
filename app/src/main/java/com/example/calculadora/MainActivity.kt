package com.example.calculadora

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find all buttons by their IDs
        val buttonDelete = findViewById<Button>(R.id.botonDelete)
        val button7 = findViewById<Button>(R.id.boton7)
        val button8 = findViewById<Button>(R.id.boton8)
        val button9 = findViewById<Button>(R.id.boton9)
        val button4 = findViewById<Button>(R.id.boton4)
        val button5 = findViewById<Button>(R.id.boton5)
        val button6 = findViewById<Button>(R.id.boton6)
        val button1 = findViewById<Button>(R.id.boton1)
        val button2 = findViewById<Button>(R.id.boton2)
        val button3 = findViewById<Button>(R.id.boton3)
        val button0 = findViewById<Button>(R.id.boton0)
        val buttonComma = findViewById<Button>(R.id.botonComa)
        val buttonEquals = findViewById<Button>(R.id.botonIgual)
        val buttonMultiply = findViewById<Button>(R.id.botonMultiply)
        val buttonMinus = findViewById<Button>(R.id.botonMenos)
        val buttonPlus = findViewById<Button>(R.id.botonMas)

        // Set OnClickListener for each button
        setButtonClickListener(buttonDelete, R.drawable.boton_terciario_presionado, R.drawable.boton_terciario)
        setButtonClickListener(button7, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button8, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button9, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button4, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button5, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button6, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button1, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button2, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button3, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(button0, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(buttonComma, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(buttonEquals, R.drawable.boton_principal_presionado, R.drawable.boton_principal_no_presionado)
        setButtonClickListener(buttonMultiply, R.drawable.boton_secundario_presionado, R.drawable.boton_secundario)
        setButtonClickListener(buttonMinus, R.drawable.boton_secundario_presionado, R.drawable.boton_secundario)
        setButtonClickListener(buttonPlus, R.drawable.boton_secundario_presionado, R.drawable.boton_secundario)
    }

    private fun setButtonClickListener(button: Button, pressedBackground: Int, unpressedBackground: Int) {
        button.setOnClickListener {
            changeButtonColor(button, pressedBackground)
            when (button.id) {
                R.id.botonDelete -> onDeleteClick(button)
                R.id.boton7, R.id.boton8, R.id.boton9 -> onDigitClick(button)
                R.id.boton4, R.id.boton5, R.id.boton6, R.id.boton1, R.id.boton2, R.id.boton3, R.id.boton0 -> onDigitClick(
                    button
                )
                R.id.botonComa -> onCommaClick(button)
                R.id.botonIgual -> onEqualsClick(button)
                R.id.botonMultiply, R.id.botonMenos, R.id.botonMas -> onOperatorClick(button)
            }
        }
    }

    private fun changeButtonColor(button: Button, background: Int) {
        // Cambiar el color del botón según su estado
        button.setBackgroundResource(background)

        // Restaurar el fondo original después de 200 milisegundos (ajusta según sea necesario)
        Handler().postDelayed({
            button.setBackgroundResource(R.drawable.boton_principal_no_presionado)
        }, 200)
    }

    private fun onDeleteClick(button: Button) {
        // Manejar clic en el botón de eliminación
    }

    private fun onDigitClick(button: Button) {
        // Manejar clic en el botón de dígito
    }

    private fun onCommaClick(button: Button) {
        // Manejar clic en el botón de coma
    }

    private fun onEqualsClick(button: Button) {
        // Manejar clic en el botón de igual
    }

    private fun onOperatorClick(button: Button) {
        // Manejar clic en el botón de operador
    }
}
