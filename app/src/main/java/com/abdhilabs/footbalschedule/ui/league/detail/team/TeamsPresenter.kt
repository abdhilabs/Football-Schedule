package com.abdhilabs.footbalschedule.ui.league.detail.team

import com.abdhilabs.footbalschedule.base.BasePresenter
import com.abdhilabs.footbalschedule.network.ApiRepo
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TeamsPresenter(
    private val repo: ApiRepo,
    private val backgroundScheduller: Scheduler = Schedulers.io(),
    private val mainScheduler: Scheduler = AndroidSchedulers.mainThread()
) : BasePresenter<TeamsView>() {

    fun getTeams(id: String) {
        callback?.onShowLoading()
        disposable.add(
            repo.getTeams(id)
                .subscribeOn(backgroundScheduller)
                .observeOn(mainScheduler)
                .doOnComplete {
                    callback?.onHideLoading()
                }
                .subscribe({
                    callback?.onDataLoaded(it)
                }, {
                    callback?.onDataError(it.message!!)
                })
        )
    }
}