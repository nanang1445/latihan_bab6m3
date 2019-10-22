import com.example.tugas_presiden.R

object DataArray {

    private val languages = listOf("Ir. Soekarno", "Soeharto", "B.J Habbie", "Abdurrahman Wahid", "Megwati Soekarno P",
        "Susilo Bambang Yudhoyono", "Jokowi Dodo")

    val desk = listOf(
        "Ir. Soekarno adalah presiden Republik Indonesia ke-1",
        "Soeharto adalah presiden Republik Indonesia ke-2",
        "B.J Habibie adalah presiden Republik Indonesia ke-3",
        "Abdurrahman Wahid adalah presiden Republik Indonesia ke-4",
        "Megwati Soekarno P adalah presiden Republik Indonesia ke-5",
        "Susilo Bambang Yudhiyono adalah presiden Republik Indonesia ke-6",
        "Jokowi Widodo adalah presiden Republik Indonesia ke-7"
    )

    private val pictDat = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listData: ArrayList<GetSetArray>
        get() {
            val list = arrayListOf<GetSetArray>()
            for (position in languages.indices) {
                val listDat = GetSetArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}