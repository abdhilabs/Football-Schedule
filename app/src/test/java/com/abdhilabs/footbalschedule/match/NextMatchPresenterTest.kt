package com.abdhilabs.footbalschedule.match

import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.league.detail.nextmatch.NextMatchPresenter
import com.abdhilabs.footbalschedule.ui.league.detail.nextmatch.NextMatchView
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class NextMatchPresenterTest {

    @Mock
    lateinit var repository: ApiRepo
    @Mock
    lateinit var callback: NextMatchView
    private lateinit var presenter: NextMatchPresenter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val testScheduler = TestScheduler()
        presenter = NextMatchPresenter(repository, testScheduler, testScheduler)
    }

    @Test
    fun `fetch valid data`() {
        val listMatch = listOf<Events>()
        val leagudId = "4335"

        presenter.bindCallBack(callback)

        Mockito.`when`(repository.getNextMatch(leagudId))
            .thenReturn(Observable.just(listMatch))

        presenter.getMatch(leagudId)

        Mockito.verify(repository).getNextMatch(leagudId)
    }
}