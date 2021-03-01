package intro.android.recyclerview.LineAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import intro.android.recyclerview.R
import intro.android.recyclerview.dataclasses.Place
import intro.android.recyclerview.LineAdapter.LineViewHolder
import kotlinx.android.synthetic.main.recyclerline.*
import kotlinx.android.synthetic.main.recyclerline.view.*

class LineAdapter (val list: ArrayList<Place>):RecyclerView.Adapter<LineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerline, parent, false);
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentPlace = list[position]

        holder.name.text = currentPlace.name
        holder.capital.text = currentPlace.capital
        holder.habitants.text = currentPlace.habitants.toString()
    }
}

class LineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name = itemView.name
    val capital = itemView.capital
    var habitants = itemView.habitants
}
