package com.abdhilabs.footbalschedule.ui.league.detail.standing

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.item.Standing
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.utils.DATA_ID_DETAIL_LEAGUE
import kotlinx.android.synthetic.main.fragment_standing.*

class StandingFragment : Fragment(), StandingView {

    private val presenter = StandingPresenter(ApiRepo())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bindCallBack(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_standing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val idLeague = activity?.intent?.getStringExtra(DATA_ID_DETAIL_LEAGUE)
        presenter.getStanding(idLeague!!)

    }

    override fun onDataLoaded(data: List<Standing>) {
        val adapterStanding = StandingAdapter(data)
        rv_standing.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterStanding
        }
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unBind()
    }

}
