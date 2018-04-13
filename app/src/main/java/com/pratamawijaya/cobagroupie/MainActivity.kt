package com.pratamawijaya.cobagroupie

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.rvMain

class MainActivity : AppCompatActivity() {

    private val gray: Int by lazy { ContextCompat.getColor(this, R.color.background) }
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

        Section().apply {
            add(makeCarouselItem())
            groupAdapter.add(this)
        }

        Section().apply {
            for (i in 1..10) {
                add(HeroItem("hero $i"))
            }

            groupAdapter.add(this)
        }
    }

    private fun makeCarouselItem(): CarouselItem {
        val carouselDecoration = CarouselItemDecoration(gray, betweenPadding)
        val carouselAdapter = GroupAdapter<ViewHolder>()
        for (i in 1..10) {
            carouselAdapter.add(CarouselCardItem("Team $i"))
        }
        return CarouselItem(carouselDecoration, carouselAdapter)
    }
}
