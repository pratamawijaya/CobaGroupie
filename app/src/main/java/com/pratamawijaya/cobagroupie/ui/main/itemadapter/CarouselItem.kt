package com.pratamawijaya.cobagroupie.ui.main.itemadapter

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import com.pratamawijaya.cobagroupie.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.layout_item_carousel.view.rvCarousel

/**
 * Created by pratama on 13/04/18.
 */
class CarouselItem(private val carouselDecoration: RecyclerView.ItemDecoration,
                   private val carouselAdapter: GroupAdapter<ViewHolder>
) : Item() {

    override fun bind(viewHolder: com.xwray.groupie.kotlinandroidextensions.ViewHolder, position: Int) {
        viewHolder.itemView.rvCarousel.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = carouselAdapter

            removeItemDecoration(carouselDecoration)
            addItemDecoration(carouselDecoration)
        }
        val linearSnapHelper = LinearSnapHelper()
        linearSnapHelper.attachToRecyclerView(viewHolder.itemView.rvCarousel)
    }

    override fun getLayout(): Int = R.layout.layout_item_carousel
}