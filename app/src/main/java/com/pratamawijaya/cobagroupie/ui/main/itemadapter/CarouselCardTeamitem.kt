package com.pratamawijaya.cobagroupie.ui.main.itemadapter

import com.pratamawijaya.cobagroupie.R
import com.pratamawijaya.cobagroupie.entity.Team
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.layout_item_team.view.imgTeam
import kotlinx.android.synthetic.main.layout_item_team.view.tvTeamName

/**
 * Created by pratama on 13/04/18.
 */
class CarouselCardTeamitem(private val team: Team) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.layout_item_team

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvTeamName.text = team.name
        Picasso.get().load(team.image).into(viewHolder.itemView.imgTeam)
    }

}