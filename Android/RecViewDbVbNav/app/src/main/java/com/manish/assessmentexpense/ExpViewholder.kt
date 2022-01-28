package com.manish.assessmentexpense

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpViewholder(
    private val infVw: View
) : RecyclerView.ViewHolder(infVw){

    fun expenseName() = infVw.findViewById<TextView>(R.id.exNm)

    fun expenseAmount() = infVw.findViewById<TextView>(R.id.exAmt)

    fun expenseIcon() = infVw.findViewById<ImageView>(R.id.iconExp)
}