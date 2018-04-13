package com.pratamawijaya.cobagroupie.ui.main.itemadapter

import com.pratamawijaya.cobagroupie.R
import com.pratamawijaya.cobagroupie.entity.Hero
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.layout_item_hero.view.imgHero
import kotlinx.android.synthetic.main.layout_item_hero.view.tvHeroName


/**
 * Created by pratama on 13/04/18.
 */
open class HeroItem(private val hero: Hero) : Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvHeroName.text = hero.name
        Picasso.get().load(hero.image).into(viewHolder.itemView.imgHero)
    }

    override fun getLayout(): Int = R.layout.layout_item_hero
}