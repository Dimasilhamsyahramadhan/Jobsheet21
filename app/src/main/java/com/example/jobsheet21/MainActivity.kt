package com.example.jobsheet21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Orang>()
    val listorang = arrayOf(
        "ANDREAS ADI MINARSO",
        "ANITA SARI",
        "ARDIAN MUHAMMAD IQBAL",
        "BAGAS SAPUTRA",
        "CHELSEA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN"


    )
    lateinit var orangView: RecyclerView
    lateinit var orangAdapter: orangAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        orangView = findViewById(R.id.orangView)
        orangView.layoutManager = LinearLayoutManager( this)

        for (i in listorang.indices) {
            list.add(Orang(listorang[i]))
        }

        orangAdapter = orangAdapter(list)
        orangAdapter.notifyDataSetChanged()
        orangView.adapter = orangAdapter
    }
}
