package com.abdhilabs.footbalschedule.ui.league.detail.overview

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.response.LeagueResponse
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.utils.DATA_ID_DETAIL_LEAGUE
import com.abdhilabs.footbalschedule.utils.glideFragment
import kotlinx.android.synthetic.main.fragment_detail_league.*

class DetailLeagueFragment : Fragment(),
    DetailLeagueView {

    private val presenter =
        DetailLeaguePresenter(
            ApiRepo()
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_league, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val league = activity?.intent?.getStringExtra(DATA_ID_DETAIL_LEAGUE)

        presenter.getDetailLeague(league!!)

        presenter.bindCallBack(this)
    }


    @SuppressLint("SetTextI18n")
    private fun dataDetail(leagueModel: LeagueResponse.LeagueModel) {
        glideFragment(context, leagueModel.strFanart1, img_banner_detail_league)
        tv_title_detail_league.text = leagueModel.strLeague
        tv_date_detail_league.text = getString(R.string.tv_date_detail, leagueModel.dateFirstEvent)
        tv_gender_detail_league.text = getString(R.string.tv_gender_detail, leagueModel.strGender)
        tv_country_detail_league.text =
            getString(R.string.tv_country_detail, leagueModel.strCountry)
        tv_desc_detail_league.text = leagueModel.strDescriptionEN
    }

    override fun onDataLoaded(data: List<LeagueResponse.LeagueModel>) {
        dataDetail(data[0])
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onShowLoading() {
        progressBar.visibility = View.VISIBLE
    }

    override fun onHideLoading() {
        progressBar.visibility = View.GONE
    }

    override fun onDestroy() {
        presenter.unBind()
        super.onDestroy()
    }
}
