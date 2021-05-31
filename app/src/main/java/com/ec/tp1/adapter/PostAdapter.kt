package com.ec.tp1.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ec.tp1.R

class PostAdapter(val items: List<Item>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        Log.d("PostAdapter", "onCreateViewHolder")
        val inflater = LayoutInflater.from(parent.context)
        val layoutId = if(viewType == BIG_ITEM_VIEW) {
            R.layout.item_big
        }else {
            R.layout.item_small
        }
        return PostViewHolder(itemView = inflater.inflate(layoutId, parent, false))
    }

    override fun getItemViewType(position: Int): Int {
        return   if( position == 0) {
            BIG_ITEM_VIEW
        }else {
            SMALL_ITEM_VIEW
        }
    }
    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        Log.d("PostAdapter", "onBindViewHolder position $position")
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class PostViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val titleTextView = itemView.findViewById<TextView>(R.id.title)

        fun bind(item: Item) {
            titleTextView.text = item.title
        }

    }


    companion object {
        private const val BIG_ITEM_VIEW = 1
        private const val SMALL_ITEM_VIEW = 2

    }

}