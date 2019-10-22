package com.example.tugas_presiden

import GetSetArray
import ListOutput
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listdat:suspend fun
    private var list: ArrayList<GetSetArray> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listdat = findViewById(R.id.data_layout)
        listdat.setHasFixedSize(true)

        list.addAll(DataArray.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        listdat.layoutManager = listdat(this)
        val listOut = ListOutput(list)
        listdat.adapter = listOut

        listOut.setOnItemClickCallback(object : ListOutput.OnItemClickCallback {
            override fun onItemClicked(data: GetSetArray) {
                showData(data)
            }
        })
    }

    private fun showData(det : GetSetArray) {
        Toast.makeText(this, "Kamu memilih " + det.name + " : " + det.detail, Toast.LENGTH_SHORT).show()
    }
}
