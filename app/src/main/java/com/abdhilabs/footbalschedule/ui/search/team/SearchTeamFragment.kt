package com.abdhilabs.footbalschedule.ui.search.team


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.response.TeamResponse
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.league.detail.team.TeamsAdapter
import kotlinx.android.synthetic.main.fragment_search_team.*

/**
 * A simple [Fragment] subclass.
 */
class SearchTeamFragment : Fragment(), SearchTeamView, SearchView.OnQueryTextListener {

    private lateinit var adapterSearch: TeamsAdapter
    private var strQuery: String = ""
    private val listSearches: List<TeamResponse.Team> = mutableListOf()

    private val presenter: SearchTeamPresenter =
        SearchTeamPresenter(
            ApiRepo()
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bindCallBack(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapterSearch = TeamsAdapter(listSearches)
        sv_team.setOnQueryTextListener(this)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        strQuery = query
        getSearch(strQuery)
        return false
    }

    private fun getSearch(query: String?) {
        if (query != null) {
            presenter.getSearchTeam(query)
        }
        adapterSearch.notifyDataSetChanged()
    }

    override fun onQueryTextChange(newText: String?): Boolean = false

    override fun onDataLoaded(data: List<TeamResponse.Team>) {
        adapterSearch = TeamsAdapter(data)
        rv_list_search_team.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterSearch
        }
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onShowLoading() {
        progress_bar_search_team.visibility = VISIBLE
    }

    override fun onHideLoading() {
        progress_bar_search_team.visibility = GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unBind()
    }

}
