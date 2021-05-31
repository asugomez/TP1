package com.ec.tp1.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import com.ec.tp1.R

class ItemAdapter(val items: MutableList<Item>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    val checkStatus: HashMap<Int, Boolean> = HashMap() // store the check status for all checkboxes
    private var mOnItemClickListener: AdapterView.OnItemClickListener? = null
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.textView)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_row_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = items[position].toString()
    }

    fun addData(text: String){
        // add data in the list to display
        items.add(Item(text))
        checkStatus.put(items.size, false)
        notifyItemChanged(itemCount)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mOnItemClickListener = listener
    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = items.size
}