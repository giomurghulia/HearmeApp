package com.example.hearmeapp

import android.R
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import com.example.hearmeapp.databinding.ActivityMainBinding
import android.text.Html
import android.widget.TextView

import android.text.style.ForegroundColorSpan

import android.text.SpannableString

import android.text.SpannableStringBuilder
import android.text.Spanned


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        handleWindowInset()
        writeTitle()
        binding.startButton.setOnClickListener {
            LogInActivity.starts(this)
            finish()
        }
    }

    private fun handleWindowInset() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())

            binding.root.updatePadding(bottom = insets.bottom)

            windowInsets

        }
    }

    private fun writeTitle() {
        val text = "Listen to the best music everybody with Hearme now"
        val spannableString = SpannableString(text)

        val green = ForegroundColorSpan(Color.GREEN)
        spannableString.setSpan(
            green,
            40, 46, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        binding.titleText.text = spannableString

    }
}