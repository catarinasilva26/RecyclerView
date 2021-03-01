package intro.android.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import intro.android.recyclerview.LineAdapter.LineAdapter
import intro.android.recyclerview.dataclasses.Place
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var  myList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<Place>()

        for(i in 0 until 500) {
            myList.add(Place("Conuntry $i", i*500, "Capital $i"))
        }


        recycler_view.adapter = LineAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

    fun insert(view: View) {
        myList.add(0, Place("Country XXX", 999, "Capital XXX"))
        recycler_view.adapter?.notifyDataSetChanged()
    }
}