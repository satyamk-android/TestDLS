package com.matter.testlibrary

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat


class CustomCheckbox @JvmOverloads constructor (context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    AppCompatCheckBox(context, attrs, defStyleAttr) {

    constructor(context: Context) : this(context, null) {
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
    }

    init {
        this.typeface = ResourcesCompat.getFont(context, R.font.muli_regular)
//        this.text = "abcd"
        this.buttonDrawable = ContextCompat.getDrawable(context, R.drawable.bg_check)
//        this.buttonTintList = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.red_E44F4D))
    }
//
//    override fun setChecked(checked: Boolean) {
//        if (checked) {
//
//        } else
//        super.setChecked(checked)
//    }
}
