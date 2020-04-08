package com.abdhilabs.footbalschedule.ui.league.detail.nextmatch

import com.abdhilabs.footbalschedule.base.BasePresenter
import com.abdhilabs.footbalschedule.network.ApiRepo
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class NextMatchPresenter(
    private val repo: ApiRepo,
    private val backgroundScheduller: Scheduler = Schedulers.io(),
    private val mainScheduler: Scheduler = AndroidSchedulers.mainThread()
) : BasePresenter<NextMatchView>() {

    fun getMatch(id: String) {
        callback?.onShowLoading()
        disposable.add(
            repo.getNextMatch(id)
                .subscribeOn(backgroundScheduller)
                .observeOn(mainScheduler)
                .subscribe({
                    callback?.onDataLoaded(it)
                    callback?.onHideLoading()
                }, {
                    callback?.onDataError("${it.fillInStackTrace()}")
                    callback?.onHideLoading()
                })
        )
    }
}