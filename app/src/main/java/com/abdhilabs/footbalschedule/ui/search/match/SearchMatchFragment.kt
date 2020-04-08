package com.abdhilabs.footbalschedule.ui.search.match


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.model.item.Events
import com.abdhilabs.footbalschedule.network.ApiRepo
import com.abdhilabs.footbalschedule.ui.search.SearchMatchAdapter
import kotlinx.android.synthetic.main.fragment_search_match.*

/**
 * A simple [Fragment] subclass.
 */
class SearchMatchFragment : Fragment(), SearchMatchView,
    androidx.appcompat.widget.SearchView.OnQueryTextListener {

    private lateinit var adapterSearch: SearchMatchAdapter
    private var strQuery: String = ""
    private val listSearches: List<Events> = mutableListOf()

    private val presenter: SearchMatchPresenter =
        SearchMatchPresenter(
            ApiRepo()
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_match, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.bindCallBack(this)

        adapterSearch = SearchMatchAdapter(listSearches)
        sv_match.setOnQueryTextListener(this)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        strQuery = query
        getSearch(strQuery)
        return false
    }

    private fun getSearch(query: String?) {
        if (query != null) {
            presenter.getSearchMatch(query)
        }
        adapterSearch.notifyDataSetChanged()
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return false
    }

    override fun onDataLoaded(data: List<Events>) {
        adapterSearch = SearchMatchAdapter(data)
        rv_list_search_match.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterSearch
        }
    }

    override fun onDataError(msg: String) {
        Log.e("ERROR", msg)
    }

    override fun onShowLoading() {
        progress_bar_search_match.visibility = View.VISIBLE
    }

    override fun onHideLoading() {
        progress_bar_search_match.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unBind()
    }
}
