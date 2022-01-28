package com.manish.assessmentexpense

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ExpAdapter(
    private val context: Context,
    private val dataSource : List<Expense>
) : RecyclerView.Adapter<ExpViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpViewholder {
        val vw = LayoutInflater.from(context).inflate(R.layout.rec_item,parent,false)
        return ExpViewholder(vw)

    }

    override fun onBindViewHolder(holder: ExpViewholder, position: Int) {
        val exp = dataSource[position]

        holder.expenseName().text = exp.expense
        holder.expenseAmount().text = "${exp.amount}"
        holder.expenseIcon().setImageResource(exp.ic)

    }

    override fun getItemCount(): Int  = dataSource.size

}