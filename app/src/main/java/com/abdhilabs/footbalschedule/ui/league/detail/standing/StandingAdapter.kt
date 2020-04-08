package com.abdhilabs.footbalschedule.ui.league.detail.standing

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.item.Standing
import com.abdhilabs.footbalschedule.utils.inflate
import kotlinx.android.synthetic.main.item_standing.view.*

class StandingAdapter(private val listTable: List<Standing>) :
    RecyclerView.Adapter<StandingAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_standing))
    }

    override fun getItemCount(): Int = listTable.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTable[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(standing: Standing) {
            itemView.tv_standing_name.text = standing.name
            itemView.tv_standing_draw.text = standing.draw.toString()
            itemView.tv_standing_goalsagainst.text = standing.goalsagainst.toString()
            itemView.tv_standing_goalsdifferent.text = standing.goalsdifference.toString()
            itemView.tv_standing_goalsfor.text = standing.goalsfor.toString()
            itemView.tv_standing_loss.text = standing.loss.toString()
            itemView.tv_standing_played.text = standing.played.toString()
            itemView.tv_standing_win.text = standing.win.toString()
            itemView.tv_standing_total.text = standing.total.toString()

        }
    }
}