package com.abdhilabs.footbalschedule.ui.league.detail.previousmatch

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchActivity
import com.abdhilabs.footbalschedule.utils.*
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_match.*

class PreviousMatchAdapter(private var previousMatches: List<Events>) :
    RecyclerView.Adapter<PreviousMatchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_match))
    }

    override fun getItemCount(): Int = previousMatches.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(previousMatches[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), LayoutContainer {
        override val containerView: View?
            get() = itemView
        private val tvDate = tv_date_match as TextView
        private val tvHomeTeam = tv_home_team_match as TextView
        private val tvAwayTeam = tv_away_team_match as TextView
        private val tvScoreHomeTeam = tv_score_home_team_match as TextView
        private val tvScoreAwayTeam = tv_score_away_team_match as TextView

        fun bindItem(event: Events) {
            tvDate.text = event.dateEvent?.toDate()
            tvAwayTeam.text = event.strAwayTeam
            tvHomeTeam.text = event.strHomeTeam
            tvScoreAwayTeam.text = event.intAwayScore
            tvScoreHomeTeam.text = event.intHomeScore

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailMatchActivity::class.java)
                intent.putExtra("id", "${event.idEvent}")
                intent.putExtra(KEY_DETAIL_SEARCH, MATCH)
                intent.putExtra(DATA_DETAIL_MATCH, event)
                itemView.context.startActivity(intent)
            }
        }
    }
}