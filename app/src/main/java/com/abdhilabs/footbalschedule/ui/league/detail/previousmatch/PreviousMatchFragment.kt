package com.abdhilabs.footbalschedule.ui.league.detail.previousmatch

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.utils.DATA_ID_DETAIL_LEAGUE
import kotlinx.android.synthetic.main.fragment_previous_match.*

class PreviousMatchFragment : Fragment(), PreviousMatchView {

    private val presenter = PreviousMatchPresenter(ApiRepo())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bindCallBack(this)
        return inflater.inflate(R.layout.fragment_previous_match, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val idLeague = activity?.intent?.getStringExtra(DATA_ID_DETAIL_LEAGUE)

        presenter.getMatch(idLeague!!)

    }

    override fun onDataLoaded(data: List<Events>) {
        val adapterPreviousMatch = PreviousMatchAdapter(data)
        rv_list_previous_match.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterPreviousMatch
        }
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onShowLoading() {
        progress_bar_previous_match.visibility = VISIBLE
    }

    override fun onHideLoading() {
        progress_bar_previous_match.visibility = GONE
    }

    override fun onDestroy() {
        presenter.unBind()
        super.onDestroy()
    }
}
