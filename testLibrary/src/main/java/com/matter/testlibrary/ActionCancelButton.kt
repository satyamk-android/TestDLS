package com.matter.testlibrary

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class ActionCancelButton(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :

    AppCompatButton(context, attrs, defStyleAttr) {

    constructor(context: Context) : this(context, null) {
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
    }


    init {
        this.background = ContextCompat.getDrawable(context, R.drawable.bg_grey_curved_stroke)
        this.setTextColor(ContextCompat.getColor(context, R.color.black_2C2C2C))
//        this.setPadding(R.dimen._10sdp, R.dimen._6sdp, R.dimen._6sdp, R.dimen._10sdp)
        this.setPadding(resources.getDimension(R.dimen._32sdp).toInt(),
            resources.getDimension(R.dimen._12sdp).toInt(), resources.getDimension(R.dimen._32sdp).toInt(),
            resources.getDimension(R.dimen._12sdp).toInt())
        this.compoundDrawablePadding = resources.getDimension(R.dimen._10sdp).toInt()
        this.typeface = ResourcesCompat.getFont(context, R.font.muli_regular)
//        this.textSize = resources.getDimension(R.dimen._14ssp)
    }
}