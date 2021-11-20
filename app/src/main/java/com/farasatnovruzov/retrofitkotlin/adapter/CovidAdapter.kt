package com.farasatnovruzov.retrofitkotlin.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farasatnovruzov.retrofitkotlin.R
import com.farasatnovruzov.retrofitkotlin.model1.Covid
import com.farasatnovruzov.retrofitkotlin.view.MainActivity
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.row_layout.view.*



class CovidAdapter(/*private val covidList: ArrayList<String>*/private val covidData: ArrayList<String>,mainActivity: MainActivity) : RecyclerView.Adapter<CovidAdapter.RowHolder>() {


    private val colors: Array<String> = arrayOf("#FFC300","#c545ff","#e71e28","#008080","#ff6666","#4ca3dd","#bada55","#ccdfff","#D35400","#F5B041","#A9CCE3","#ABEBC6")


    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {


        fun bind(covidData: ArrayList<String>, colors: Array<String>, position: Int){
            itemView.setBackgroundColor(Color.parseColor(colors[position%8]))
            itemView.rowItem.text = covidData[position]

        }

//        private var binding: RecyclerRowBinding? = null
//        fun RecyclerViewHolder(binding: RecyclerRowBinding) {
//            super(binding.getRoot())
//            this.binding = binding
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(covidData,colors,position)
//        val covid = Covid()

//        holder.itemView.textView2.text = "covid.aze?.newCases.toString()"

    }



    override fun getItemCount(): Int {

        return covidData.count()
    }
}