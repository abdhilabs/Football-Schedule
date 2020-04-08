package com.abdhilabs.footbalschedule.ui.league.detail.standing

import com.abdhilabs.footbalschedule.base.BasePresenter
import com.abdhilabs.footbalschedule.network.ApiRepo
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class StandingPresenter(
    private val repo: ApiRepo,
    private val backgroundScheduller: Scheduler = Schedulers.io(),
    private val mainScheduler: Scheduler = AndroidSchedulers.mainThread()
) : BasePresenter<StandingView>() {

    fun getStanding(id: String) {
        disposable.add(
            repo.getStanding(id)
                .subscribeOn(backgroundScheduller)
                .observeOn(mainScheduler)
                .subscribe({
                    callback?.onDataLoaded(it)
                }, {
                    callback?.onDataError(it.message!!)
                })
        )
    }
}