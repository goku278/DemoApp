package com.example.myapplicationdemo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplicationdemo.MainActivity
import com.example.myapplicationdemo.R
import com.example.myapplicationdemo.utils.PersonsListUtils
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        FirebaseApp.initializeApp(this)
        auth = FirebaseAuth.getInstance()
        setClicks()
    }

    private fun setClicks() {
        btnLogin.setOnClickListener {
            if (PersonsListUtils.validatePassword(etPassword.text.toString().trim())) {
                login()
            }
            else {
                val rootView = findViewById<View>(android.R.id.content)
                Snackbar.make(rootView,
                    "Password must contain at least 1 uppercase, 1 special character, 1 numeric and rest others lowercase characters",
                    Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }

    private fun login() {

        val email = etUserName.text.toString()
        val password = etPassword.text.toString()

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign up success
                    val user = auth.currentUser
                    Log.d("LoginActivity","message ${task.isSuccessful}")
                    // You can perform further actions here
                } else {
                    // Sign up failed
                    // Handle the error appropriately
                }
            }

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success
                    val user = auth.currentUser
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                    // You can perform further actions here
                } else {
                    Log.d("LoginActivity","message ${task.exception.toString()}")
                    // Sign in failed
                    // Handle the error appropriately
                    val rootView = findViewById<View>(android.R.id.content)
                    Snackbar.make(rootView,"Firebase Signin not successful",Snackbar.LENGTH_SHORT).show()
                }
            }
    }
}