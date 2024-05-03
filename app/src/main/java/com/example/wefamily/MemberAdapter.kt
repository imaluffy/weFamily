package com.example.wefamily

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val membersList: List<MemberClass>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val item=inflater.inflate(R.layout.member_view,parent,false)
        return ViewHolder(item)
    }

    override fun getItemCount(): Int {
        return membersList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=membersList[position]

        holder.userName.text=item.name
        holder.userAddress.text=item.address
    }

    class ViewHolder(private val item:View): RecyclerView.ViewHolder(item) {
        val userImage=item.findViewById<ImageView>(R.id.iv_member_icon)
        val userName= item.findViewById<TextView>(R.id.tv_member_name)
        val userAddress = item.findViewById<TextView>(R.id.tv_member_address)
    }
}