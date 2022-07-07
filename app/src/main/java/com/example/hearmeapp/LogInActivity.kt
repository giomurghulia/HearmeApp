package com.example.hearmeapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.hearmeapp.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fbButton.apply {
            iconDrawable = ContextCompat.getDrawable(this@LogInActivity, R.drawable.ic_facebook)
            title = "Continue with Facebook"
        }
        binding.googleButton.apply {
            iconDrawable = ContextCompat.getDrawable(this@LogInActivity, R.drawable.ic_google)
            title = "Continue with Google"
        }
        binding.appleButton.apply {
            iconDrawable = ContextCompat.getDrawable(this@LogInActivity, R.drawable.ic_apple)
            title = "Continue with Apple"
        }

    }

    companion object {
        fun starts(context: Context) {
            val intent = Intent(context, LogInActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }
}