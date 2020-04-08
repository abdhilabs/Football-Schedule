package com.abdhilabs.footbalschedule.detailmatch

import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchPresenter
import com.abdhilabs.footbalschedule.ui.league.detail.detailmatch.DetailMatchView
import com.nhaarman.mockito_kotlin.verify
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DetailMatchPresenterTest {

    @Mock
    lateinit var repository: ApiRepo

    @Mock
    lateinit var callBack: DetailMatchView

    private lateinit var presenter: DetailMatchPresenter


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val testScheduler = TestScheduler()
        presenter = DetailMatchPresenter(repository, testScheduler, testScheduler)
    }

    @Test
    fun `fetch valid data`() {
        val listMatch = emptyList<Events>()
        val idMatch = "584435"

        presenter.bindCallBack(callBack)

        Mockito.`when`(repository.getDetailMatch(idMatch))
            .thenReturn(Observable.just(listMatch))
        presenter.getDetailMatch(idMatch)
        verify(repository).getDetailMatch(idMatch)
    }
}