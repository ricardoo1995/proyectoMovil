package com.example.ricardo_dell.proymov

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    private var editNombre: EditText?= null
    private var editCodigo: EditText?= null
    private var nombre: String?=null
    private var codigo = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editCodigo = findViewById(R.id.editText2_pCodigo)
        editNombre = findViewById(R.id.editText_pNombre)

    }
}
