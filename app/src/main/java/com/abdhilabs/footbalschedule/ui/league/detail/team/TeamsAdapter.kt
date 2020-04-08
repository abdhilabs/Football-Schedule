package com.abdhilabs.footbalschedule.ui.league.detail.team

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import com.abdhilabs.footbalschedule.ui.league.detail.detailteam.DetailTeamActivity
import com.abdhilabs.footbalschedule.utils.DATA_DETAIL_TEAM
import com.abdhilabs.footbalschedule.utils.glideAdapter
import com.abdhilabs.footbalschedule.utils.inflate
import kotlinx.android.synthetic.main.item_team.view.*

class TeamsAdapter(private val listTeam: List<TeamResponse.Team>) :
    RecyclerView.Adapter<TeamsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_team))
    }

    override fun getItemCount(): Int = listTeam.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTeam[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(team: TeamResponse.Team) {
            itemView.txtTeamName.text = team.strTeam

            glideAdapter(itemView, team.strTeamBadge, itemView.imgTeam)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailTeamActivity::class.java)
//                intent.putExtra(KEY_DETAIL_TEAM, TEAM)
                intent.putExtra(DATA_DETAIL_TEAM, team)
                itemView.context.startActivity(intent)
            }
        }
    }
}