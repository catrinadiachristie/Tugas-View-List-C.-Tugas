package com.uty.listviewpresiden.Model

import com.uty.listviewpresiden.R

object DataPresiden {
    private val namapresiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "Bacharuddin Jusuf Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarnoputri",
        "Susilo Bambang Yudhoyono",
        "Ir. H. Joko Widodo")

    private val biodatapresiden = arrayOf(
        "Presiden Pertama Indonesia, mulai menjabat 18 Agustus 1945 - 12 Maret 1967 ....",
        "Presiden Kedua Indonesia, mulai menjabat 12 Maret 1967 - 21 Mei 1998 ...",
        "Presiden Ketiga Indonesia, mulai menjabat 21 Mei 1998 - 20 Oktober 1999 ...",
        "Presiden Keempat Indonesia, mulai Menjabat 20 Oktober 1999 - 23 Juli 2001 ...",
        "Presiden Kelima Indonesia, mulai Menjabat 23 Juli 2001 - 20 Oktober 2004 ...",
        "Presiden Keenam Indonesia, mulai menjabat 20 Oktober 2004 - 20 Oktober 2014 ...",
        "Presiden Ketujuh Indonesia, mulai menjabat 20 Oktober 2014 - sampai sekarang ...")

    private val fotopresiden = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.susilo,
        R.drawable.jokowi)

    val urutanpresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in namapresiden.indices) {
            val presiden = Presiden()
            presiden.nama = namapresiden[position]
            presiden.biodata = biodatapresiden[position]
            presiden.foto = fotopresiden[position]
            list.add(presiden)
        }
        return list
    }
}