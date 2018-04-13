package com.pratamawijaya.cobagroupie

import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.layout_item_hero.view.tvName


/**
 * Created by pratama on 13/04/18.
 */
open class HeroItem(val name: String) : Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvName.text = name
    }

    override fun getLayout(): Int = R.layout.layout_item_hero


}