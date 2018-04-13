package com.pratamawijaya.cobagroupie

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.layout_item_carousel.view.rvCarousel

/**
 * Created by pratama on 13/04/18.
 */
class CarouselItem(val carouselDecoration: RecyclerView.ItemDecoration, val carouselAdapter: GroupAdapter<ViewHolder>
) : Item() {

    override fun bind(viewHolder: com.xwray.groupie.kotlinandroidextensions.ViewHolder, position: Int) {
        viewHolder.itemView.rvCarousel.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = carouselAdapter

            removeItemDecoration(carouselDecoration)
            addItemDecoration(carouselDecoration)
        }
    }

    override fun getLayout(): Int = R.layout.layout_item_carousel
}