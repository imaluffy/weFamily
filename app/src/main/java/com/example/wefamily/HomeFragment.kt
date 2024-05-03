package com.example.wefamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val membersList= listOf<MemberClass>(
            MemberClass("Akash","Near Sindh Nagar, Across the Bazaar"),
            MemberClass("Poonam", "Across the Kaveri River, Near to the Bag Bagicha Market"),
            MemberClass("Karan","Metro pole of highest feet, opposite to Howrah Colony")
        )

        val adapter=MemberAdapter(membersList)

        val recycler=requireView().findViewById<RecyclerView>(R.id.rec_member_view)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter=adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}