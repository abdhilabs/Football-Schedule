package com.abdhilabs.footbalschedule.ui.league.detail.detailmatch

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import android.widget.Toast
import com.abdhilabs.footbalschedule.base.BasePresenter
import com.abdhilabs.footbalschedule.db.database
import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.model.item.Favorite
import com.abdhilabs.footbalschedule.network.ApiRepo
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.jetbrains.anko.db.delete
import org.jetbrains.anko.db.insert

class DetailMatchPresenter(
    private val repo: ApiRepo,
    private val backgroundScheduller: Scheduler = Schedulers.io(),
    private val mainScheduler: Scheduler = AndroidSchedulers.mainThread()
) : BasePresenter<DetailMatchView>() {

    fun getDetailMatch(idMatch: String?) {
        callback?.onShowLoading()
        disposable.add(
            repo.getDetailMatch(idMatch)
                .subscribeOn(backgroundScheduller)
                .observeOn(mainScheduler)
                .subscribe({
                    callback?.onDataLoaded(it)
                    callback?.onHideLoading()
                }, {
                    callback?.onDataError(it.message!!)
                    callback?.onHideLoading()
                })
        )
    }

    fun getDetailTeam(idTeamHome: String?, idTeamAway: String?) {
        getTeams(idTeamHome = idTeamHome)
        getTeams(idTeamAway = idTeamAway)
    }

    @SuppressLint("CheckResult")
    private fun getTeams(
        idTeamHome: String? = null,
        idTeamAway: String? = null
    ) {
        val idTeam = idTeamHome ?: idTeamAway
        callback?.onShowLoading()
        disposable.add(
            repo.getDetailTeamMatch(idTeam)
                .subscribeOn(backgroundScheduller)
                .observeOn(mainScheduler)
                .subscribe({ listItem ->
                    if (listItem.isNotEmpty()) {
                        idTeamHome?.let {
                            callback?.showTeamHome(listItem[0])
                        }
                        idTeamAway?.let {
                            callback?.showTeamAway(listItem[0])
                        }
                        callback?.onHideLoading()
                    } else {
                        callback?.onDataError("Data Error")
                        callback?.onHideLoading()
                    }
                }, {
                    callback?.onDataError(it.message!!)
                    callback?.onHideLoading()
                })
        )
    }

    fun addToFavorite(ctx: Context, data: Events) {
        try {
            ctx.database.use {
                insert(
                    Favorite.TABLE_FAVORITE,
                    Favorite.MATCH_ID to data.idEvent,
                    Favorite.MATCH_NAME to data.strEvent,
                    Favorite.MATCH_DATE to data.dateEvent,
                    Favorite.MATCH_ID_HOME to data.idHomeTeam,
                    Favorite.MATCH_ID_AWAY to data.idAwayTeam,
                    Favorite.MATCH_HOME_NAME to data.strHomeTeam,
                    Favorite.MATCH_AWAY_NAME to data.strAwayTeam,
                    Favorite.MATCH_HOME_SCORE to data.intHomeScore,
                    Favorite.MATCH_AWAY_SCORE to data.intAwayScore,
                    Favorite.MATCH_HOME_GOALS to data.strHomeGoalDetails,
                    Favorite.MATCH_AWAY_GOALS to data.strAwayGoalDetails,
                    Favorite.MATCH_HOME_SHOTS to data.intHomeShots,
                    Favorite.MATCH_AWAY_SHOTS to data.intAwayShots,
                    Favorite.MATCH_HOME_GOALKEEPER to data.strHomeLineupGoalkeeper,
                    Favorite.MATCH_AWAY_GOALKEEPER to data.strAwayLineupGoalkeeper,
                    Favorite.MATCH_HOME_DEFENSE to data.strHomeLineupDefense,
                    Favorite.MATCH_AWAY_DEFENSE to data.strAwayLineupDefense,
                    Favorite.MATCH_HOME_MIDFIELD to data.strHomeLineupMidfield,
                    Favorite.MATCH_AWAY_MIDFIELD to data.strAwayLineupMidfield,
                    Favorite.MATCH_HOME_FORWARD to data.strHomeLineupForward,
                    Favorite.MATCH_AWAY_FORWARD to data.strAwayLineupForward
                )
            }
            Toast.makeText(ctx, "You add to Favorite", Toast.LENGTH_SHORT).show()
        } catch (e: SQLiteConstraintException) {
            Toast.makeText(ctx, "${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    fun removeFromFavorite(ctx: Context, id: String) {
        try {
            ctx.database.use {
                delete(
                    Favorite.TABLE_FAVORITE, "(MATCH_ID = {id})",
                    "id" to id
                )
            }
            Toast.makeText(ctx, "You remove from Favorite", Toast.LENGTH_SHORT).show()
        } catch (e: SQLiteConstraintException) {
            Toast.makeText(ctx, e.localizedMessage, Toast.LENGTH_SHORT).show()
        }
    }
}