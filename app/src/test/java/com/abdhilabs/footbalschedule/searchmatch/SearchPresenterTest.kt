package com.abdhilabs.footbalschedule.searchmatch

import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.search.match.SearchMatchPresenter
import com.abdhilabs.footbalschedule.ui.search.match.SearchMatchView
import com.nhaarman.mockito_kotlin.verify
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class SearchPresenterTest {

    @Mock
    lateinit var repository: ApiRepo
    @Mock
    lateinit var callback: SearchMatchView
    private lateinit var presenter: SearchMatchPresenter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val testScheduler = TestScheduler()
        presenter =
            SearchMatchPresenter(
                repository,
                testScheduler,
                testScheduler
            )
    }

    @Test
    fun `fetch valid data`() {
        val listMatch = listOf<Events>()
        val query = ""

        presenter.bindCallBack(callback)

        Mockito.`when`(repository.getSearchMatch(query))
            .thenReturn(Observable.just(listMatch))

        presenter.getSearchMatch(query)

        verify(repository).getSearchMatch(query)
    }

}