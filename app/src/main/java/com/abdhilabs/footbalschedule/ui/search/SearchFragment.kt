package com.abdhilabs.footbalschedule.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.adapter.PagerSearchAdapter
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentAdapter = PagerSearchAdapter(childFragmentManager)
        view_pager_search.adapter = fragmentAdapter

        tab_layout_search.setupWithViewPager(view_pager_search)
    }

}