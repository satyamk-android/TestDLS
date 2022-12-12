package com.matter.testlibrary

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import androidx.annotation.ColorInt
import androidx.annotation.Dimension
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.marginBottom


class ActionDoneButton(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :

    AppCompatButton(context, attrs, defStyleAttr) {

    constructor(context: Context) : this(context, null) {
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        var typesArray = context.obtainStyledAttributes(attrs, R.styleable.ActionDoneButton)
        typesArray.getDimensionPixelSize(R.styleable.ActionDoneButton_sk_size, 10)
        typesArray.recycle()
    }


    init {
        this.background = ContextCompat.getDrawable(context, R.drawable.bg_blue_curved)
        this.setTextColor(ContextCompat.getColor(context, R.color.white))
        this.setPadding(resources.getDimension(R.dimen._32sdp).toInt(),
            resources.getDimension(R.dimen._12sdp).toInt(), resources.getDimension(R.dimen._32sdp).toInt(),
            resources.getDimension(R.dimen._12sdp).toInt())
        this.compoundDrawablePadding = resources.getDimension(R.dimen._10sdp).toInt()
        this.typeface = ResourcesCompat.getFont(context, R.font.muli_regular)
//        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, resources.getDimension(R.dimen._14ssp))
//        this.textSize = 14f
    }


//    fun setMyText(size: Int) {
//        this.textSize = size.toFloat()
//        invalidate()
//    }
}
