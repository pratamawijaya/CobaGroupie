package com.pratamawijaya.cobagroupie.ui.main

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.pratamawijaya.cobagroupie.R
import com.pratamawijaya.cobagroupie.entity.Hero
import com.pratamawijaya.cobagroupie.entity.Team
import com.pratamawijaya.cobagroupie.ui.main.itemadapter.CarouselCardTeamitem
import com.pratamawijaya.cobagroupie.ui.main.itemadapter.CarouselItem
import com.pratamawijaya.cobagroupie.ui.main.itemadapter.HeaderItem
import com.pratamawijaya.cobagroupie.ui.main.itemadapter.HeroItem
import com.pratamawijaya.cobagroupie.utility.CarouselItemDecoration
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity() {

    private val gray: Int by lazy { ContextCompat.getColor(this, R.color.background) }
    private val white: Int by lazy { ContextCompat.getColor(this, R.color.white) }
    private val betweenPadding: Int by lazy { resources.getDimensionPixelSize(R.dimen.padding_small) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val groupAdapter = GroupAdapter<ViewHolder>()
        val linearLayoutManager = LinearLayoutManager(this)

        rvMain.apply {
            layoutManager = linearLayoutManager
            adapter = groupAdapter
        }

        Section(HeaderItem("Team List")).apply {
            add(makeCarouselItem())
            groupAdapter.add(this)
        }

        Section(HeaderItem("Hero List")).apply {
            val listHero = generateDataHero()
            listHero.map {
                add(HeroItem(it))
            }
            groupAdapter.add(this)
        }
    }

    private fun makeCarouselItem(): CarouselItem {
        val carouselDecoration = CarouselItemDecoration(white, betweenPadding)
        val carouselAdapter = GroupAdapter<ViewHolder>()

        val listOfTeam = generateDataTeam()

        listOfTeam.map {
            carouselAdapter.add(CarouselCardTeamitem(it))
        }

        return CarouselItem(carouselDecoration, carouselAdapter)
    }

    private fun generateDataHero(): List<Hero> {
        return listOf(
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png"),
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png"),
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png"),
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png"),
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png"),
                Hero("Anti Mage", "https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/8/8e/Anti-Mage_icon.png")
        )
    }

    /**
     * generate data team
     */
    private fun generateDataTeam(): List<Team> {
        return listOf(
                Team("Virtus.pro", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/1883502.png"),
                Team("Mineski.亿鼎博", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/543897.png"),
                Team("LGD-GAMING", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/15.png"),
                Team("LGD-GAMING", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/15.png"),
                Team("LGD-GAMING", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/15.png"),
                Team("LGD-GAMING", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/15.png"),
                Team("LGD-GAMING", "https://steamcdn-a.akamaihd.net/apps/dota2/images/team_logos/15.png")
        )
    }
}
