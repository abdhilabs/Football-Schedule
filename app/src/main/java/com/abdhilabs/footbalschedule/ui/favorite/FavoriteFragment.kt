package com.abdhilabs.footbalschedule.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.adapter.PagerFavAdapter
import kotlinx.android.synthetic.main.fragment_favorite.*

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentAdapter = PagerFavAdapter(childFragmentManager)
        view_pager_favorite.adapter = fragmentAdapter

        tab_layout_favorite.setupWithViewPager(view_pager_favorite)
    }

}
