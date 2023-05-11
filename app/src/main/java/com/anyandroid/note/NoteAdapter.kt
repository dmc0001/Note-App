package com.anyandroid.note


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class NoteAdapter(
    private val kindergartenList: ArrayList<Note>
  //  , private val fragmentManager: FragmentManager
) :
    RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {



    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val noteTitle: TextView = itemView.findViewById(R.id.titleTextView)
        val noteContent: TextView = itemView.findViewById(R.id.contentTextView)

       // private var itemClickListener: OnItemClickListener? = null

       /* init {
            itemView.setOnClickListener {
                itemClickListener?.onItemClick(adapterPosition)
            }
        }*/

       /* fun setItemClickListener(itemClickListener: OnItemClickListener?) {
            this.itemClickListener = itemClickListener
        }*/
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        Log.d("NoteAdapter", "Creating ViewHolder")

        return NoteViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.noteTitle.text = kindergartenList[position].title
        holder.noteContent.text = kindergartenList[position].content

        /*holder.setItemClickListener(object : OnItemClickListener {
            override fun onItemClick(position: Int) {
                // Launch the new fragment here and pass the uid as an argument
                val uid =  kindergartenList[position].uid
                val kindergartenName = kindergartenList[position].name
                val newFragment = KindergartenFragment.newInstance(uid,kindergartenName)
                fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, newFragment)
                    .addToBackStack(null)
                    .commit()
            }
        })*/
    }

    override fun getItemCount(): Int {
        return kindergartenList.size
    }
}
