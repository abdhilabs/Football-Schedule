package com.abdhilabs.footbalschedule.detailleague

import com.abdhilabs.footbalschedule.model.response.LeagueResponse
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.league.detail.overview.DetailLeaguePresenter
import com.abdhilabs.footbalschedule.ui.league.detail.overview.DetailLeagueView
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class DetailLeaguePresenterTest {

    @Mock
    lateinit var repository: ApiRepo
    @Mock
    lateinit var callBack: DetailLeagueView

    private lateinit var presenter: DetailLeaguePresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        val testScheduler = TestScheduler()
        presenter =
            DetailLeaguePresenter(
                repository,
                testScheduler,
                testScheduler
            )

    }

    @Test
    fun `fetch valid data`() {
        val listLeague = emptyList<LeagueResponse.LeagueModel>()
        val idLeague = "4328"

        presenter.bindCallBack(callBack)

        `when`(repository.getLeagueDetail(idLeague)).thenReturn(Observable.just(listLeague))
        presenter.getDetailLeague(idLeague)
        verify(repository).getLeagueDetail(idLeague)
    }

}