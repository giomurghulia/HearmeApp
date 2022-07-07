package com.example.hearmeapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.hearmeapp.databinding.LayoutSocialButtonBinding

class SocialButton @JvmOverloads constructor(
    private val context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyle: Int = 0
) : ConstraintLayout(context, attrs, defStyle) {

    private val binding = LayoutSocialButtonBinding.inflate(
        LayoutInflater.from(context), this
    )

    var iconDrawable: Drawable? = null
        set(value) {
            field = value
            binding.iconImage.setImageDrawable(value)
        }
    var title: String = ""
        set(value) {
            field = value
            binding.titleText.text = value
        }

    init {
        setBackgroundResource(R.drawable.shape_stroke_white)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val height = MeasureSpec.makeMeasureSpec(
            context.resources.getDimensionPixelSize(R.dimen.social_button_height),
            MeasureSpec.EXACTLY
        )

        super.onMeasure(widthMeasureSpec, height)
    }

}