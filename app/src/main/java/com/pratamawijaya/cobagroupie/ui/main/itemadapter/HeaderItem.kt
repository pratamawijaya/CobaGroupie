package com.pratamawijaya.cobagroupie.ui.main.itemadapter

import com.pratamawijaya.cobagroupie.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.layout_item_header.view.tvHeaderTitle


/**
 * Created by pratama on 13/04/18.
 */
class HeaderItem(private val txtTitle: String) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvHeaderTitle.text = txtTitle
    }

    override fun getLayout(): Int = R.layout.layout_item_header

}