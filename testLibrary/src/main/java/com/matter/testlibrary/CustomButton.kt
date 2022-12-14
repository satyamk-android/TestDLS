package com.matter.testlibrary

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.annotation.Dimension
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat


public class CustomButton : FrameLayout {

    val inflatedView: View
    lateinit var backBtn : AppCompatButton

    public constructor(context: Context) : this(context, null)

    public constructor(context: Context, attrs: AttributeSet?) : super (
        context,
        attrs,
        R.attr.customButtonStyle
    ) {
        inflatedView = LayoutInflater.from(context).inflate(R.layout.layout_custom_button, this, true)
    }

    private var mText: String? = null
        set(value) {
            field = value
            backBtn.text = value
        }

    private var mTextSize: Float = 0F

    val textSize: Float
        get() = backBtn.textSize

    var textBackground: Drawable? = null
        set(value) {
            field = value
//            backBtn.background = value
        }

    var btnBackground : Drawable ? = null
        set(value) {
            field = value
            backBtn.background = value
        }

    var textColor: ColorStateList? = null
        set(value) {
            field = value
            backBtn.setTextColor(value)
        }

    fun setText(text: String) {
        mText = text
    }

    fun setTextSize(@Dimension size: Float) {
        mTextSize = size
    }

    fun setTextColor(@ColorInt color: Int) {
        textColor = ColorStateList.valueOf(color)
    }

    fun setTextBackground(@DrawableRes resId: Int) {
        textBackground = ContextCompat.getDrawable(context, resId)
    }

    fun setTextBackgroundColor(@ColorInt color: Int) {
        textBackground = ColorDrawable(color)
    }

    fun setBtnBackground(@DrawableRes resId: Int) {
        btnBackground = ContextCompat.getDrawable(context, resId)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        backBtn = findViewById(R.id.btnBack)
        configureBtn()
    }

    private fun configureBtn() {
        backBtn.background = ContextCompat.getDrawable(context, R.drawable.bg_grey_curved_stroke)
        backBtn.text = mText
        backBtn.textSize = 22f
        backBtn.setTextColor(ContextCompat.getColor(context, R.color.grey_6E6E6E))
        backBtn.setPadding(40, 14, 40, 14)
        backBtn.setSupportAllCaps(false)

//        backBtn.setTextAppearance(context, R.style.cancelButtonStyle)


    }


}