package br.com.uninter.movies

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var userEdt: EditText
    private lateinit var passEdt: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }

    private fun initView() {
        userEdt = findViewById(R.id.editTextText)
        passEdt = findViewById(R.id.editTextPassword)
        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            if (userEdt.text.toString().isEmpty() || passEdt.text.toString().isEmpty()) {
                Toast.makeText(this, "Please fill your user and password", Toast.LENGTH_SHORT).show()
            } else if (userEdt.text.toString() == "test" && passEdt.text.toString() == "test") {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Your user and password is not correct", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
