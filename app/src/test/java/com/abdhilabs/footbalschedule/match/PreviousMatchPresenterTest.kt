package com.abdhilabs.footbalschedule.match

import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.league.detail.previousmatch.PreviousMatchPresenter
import com.abdhilabs.footbalschedule.ui.league.detail.previousmatch.PreviousMatchView
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class PreviousMatchPresenterTest {

    @Mock
    lateinit var repository: ApiRepo
    @Mock
    lateinit var callback: PreviousMatchView
    private lateinit var presenter: PreviousMatchPresenter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val testScheduler = TestScheduler()
        presenter = PreviousMatchPresenter(repository, testScheduler, testScheduler)
    }

    @Test
    fun `fetch valid data`() {
        val listMatch = listOf<Events>()
        val leagudId = "4335"

        presenter.bindCallBack(callback)

        Mockito.`when`(repository.getPreviousMatch(leagudId))
            .thenReturn(Observable.just(listMatch))

        presenter.getMatch(leagudId)

        Mockito.verify(repository).getPreviousMatch(leagudId)
    }
}