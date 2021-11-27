package com.aprillian.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragmen_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Aprillian Putra Pratama",  "Laki-laki","aprillian_20510001@stimata.ac.id",
            "088217784280", "Malang, Jawa Timur")
        )
        listTeman.add(MyFriend("Abdullah Arwani Masduqi","Laki-laki","abdullah_20520001@stimata.ac.id",
            "085815151264","Blora, Jawa Tengah")
        )
        listTeman.add(MyFriend("Muhammad Mudzakir Ma'ruf","Laki-laki","mudzakir_20520008@stimata.ac.id",
            "081256236754","Tulungagung, Jawa Timur")
        )
        listTeman.add(MyFriend("Airindia Dwi Putri","Perempuan","airindia_2051020@stimata.ac.id",
            "081999016442","Malang, Jawa Timur")
        )
        listTeman.add(MyFriend("Muhammad Nur Azis","Laki-laki","muhammad_20510021@stimata.ac.id",
            "085233229729","Nganjuk, Jawa Timur")
        )
        listTeman.add(MyFriend("Salsabila Arini Minataka","Perempuan","salsabila_20510031@stimata.ac.id",
            "081913337233","Alas")
        )
        listTeman.add(MyFriend("Abubakar Bin Salim","Laki-laki","salim_20510041@stimata.ac.id",
            "0774421204","Mukalla, Hadramaut")
        )
        listTeman.add(MyFriend("Muhammad Luthfil Hadi","Laki-laki","luthfi_20510051@stimata.ac.id",
            "0142104549","Trengganu, Malaysia")
        )
        listTeman.add(MyFriend("Muhammad Adib Adzim","Laki-laki","adib_20510053@stimata.ac.id",
            "011722995697","Kuala Lumpur, Malaysia")
        )
        listTeman.add(MyFriend("Siti Khadijah","Perempuan","siti_20520044@stimata.ac.id",
            "085718332568","Tangerang, Banten")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmen_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}