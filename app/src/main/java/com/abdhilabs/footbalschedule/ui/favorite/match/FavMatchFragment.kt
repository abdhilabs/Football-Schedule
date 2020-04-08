package com.abdhilabs.footbalschedule.ui.favorite.match


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdhilabs.footbalschedule.R
import com.abdhilabs.footbalschedule.db.database
import com.abdhilabs.footbalschedule.model.item.Favorite
import kotlinx.android.synthetic.main.fragment_fav_match.*
import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.select

class FavMatchFragment : Fragment() {

    private lateinit var adapterFavorite: FavMatchAdapter
    private var favorites: MutableList<Favorite> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fav_match, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterFavorite =
            FavMatchAdapter(
                favorites
            )
        showFavorite()
        rv_list_favorite_match.apply {
            adapter = adapterFavorite
            layoutManager = LinearLayoutManager(context)
        }
    }

    private fun showFavorite() {
        favorites.clear()
        context?.database?.use {
            val result = select(Favorite.TABLE_FAVORITE)
            val favorite = result.parseList(classParser<Favorite>())
            favorites.addAll(favorite)
            adapterFavorite.notifyDataSetChanged()
        }
    }

    override fun onResume() {
        super.onResume()
        showFavorite()
    }
}
