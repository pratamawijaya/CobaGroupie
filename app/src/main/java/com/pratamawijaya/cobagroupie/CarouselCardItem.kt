package com.pratamawijaya.cobagroupie

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.layout_item_hero.view.tvName

/**
 * Created by pratama on 13/04/18.
 */
class CarouselCardItem(val name: String) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.layout_item_team
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvName.text = name
    }

}