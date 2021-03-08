package com.suhaili.kotawaringinbarattourist.Data

import com.suhaili.kotawaringinbarattourist.Model.KobarModel
import com.suhaili.kotawaringinbarattourist.R

object KobarData {

    private val gbr:IntArray = intArrayOf(
        R.drawable.tanjungputingnaturepark,
        R.drawable.tanjungkeluangnaturepark,
        R.drawable.kububeach,
        R.drawable.arutriver,
        R.drawable.segavillage,
        R.drawable.yellowcastle,
        R.drawable.princemangkubumicastle,
        R.drawable.betangtraditionalhouse,
        R.drawable.alnursaricastle,
        R.drawable.suwayapwaterfall
    )

    private val destination = arrayOf(
        "Tanjung Puting Nature Park",
        "Tanjung Keluang Nature Park",
        "Kubu Beach",
        "Arut River",
        "Kampung Sega/Kampung Pelangi",
        "Istana Kuning",
        "Istana Pangeran Mangkubumi",
        "Rumah Adat Tradisional Betang",
        "Istana AlNurSari",
        "Suwayap Waterfall"
    )

    private val location = arrayOf(
        "Sungai Cabang, Kec. Kumai, Kab. Kotawaringin Barat",
        "Kubu, Kec. Kumai, Kab. Kotawaringin Barat",
        "Kubu, Kec. Kumai, Kab. Kotawaringin Barat",
        "Raja Seberang, Kec. Arut Selatan, Kab. Kotawaringin Barat",
        "Mendawai, Kec. Arut Selatan, Kab. Kotawaringin Barat",
        "Raja, Kec. Arut Selatan, Kab. Kotawaringin Barat",
        "Raja, Kec. Arut Selatan, Kab. Kotawaringin Barat",
        "Desa Pasir Panjang, Pangkalanbun, Kotawaringin Barat",
        "Kotawaringin Hulu, Kec. Kotawaringin Lama, Kab. Kotawaringin Barat",
        "Runtu, Kec. Arut Selatan, Kab. Kotawaringin Barat"
    )

    private val detail = arrayOf(

            """     Taman Nasional Tanjung Puting pada awalnya merupakan cagar alam dan suaka margasatwa yang ditetapkan oleh Pemerintah Hindia Belanda pada tahun 1937. 
               Kemudian tanggal 25 Oktober 1996, Tanjung Puting ditunjuk sebagai Taman Nasional dengan luas seluruhnya 415.040 ha.
               Secara geografis Taman Nasional Tanjung Puting terletak di Kecamatan Kumai Kabupaten Kotawaringin Barat serta di Kecamatan Hanau, Danau Sembuluh, dan Seruyan Hilir di Kabupaten Seruyan Provinsi Kalimantan Tengah.
               Tempat wisata ini hampir mirip dengan taman nasional pada umumnya. Hanya saja, populasi berbagai spesies monyet lebih mendominasi dibanding hewan lain yang ada di lokasi wisata ini. Sebut saja bekantan, monyet ekor panjang, owa kalimantan, dan 
               orang utan sangat banyak dan beragam. Ada juga berbagai burung langka dan berbagai jenis buaya turut ada di lokasi wisata ini.
               Jika ingin ke lokasi silakan saja datang ke Kecamatan Kumai, kemudian naik kapal wisata menyusuri Sungai Sekonyer selama kurang lebih 4 jam. 
               Biasanya, satu kapal bisa mudat 25-50 orang jadi jika datang rombongan akan lebih murah karena sekali sewa hanya dibandrol dengan harga Rp 165.000,- saja.""".trimIndent(),
            """     Tanjung Keluang merpakan tempat konservasi penyu yang mulai dibuka pada tahun 2000 dan dikelola oleh Dinas Pariwisata Kotawaringin Barat. Disini wisatawan bisa mendapatkan pengalaman langsung melepaskan tukik penyu ke pantai.
               Kegiatan inilah sebenarnya yang menjadi daya tarik dari tempat ini. Wisatawan yang berkunjung pun bukan hanya dari dalam negeri saja, melainkan dari luar negeri juga.
               Pantai Tanjung Keluang berada di Kubu, Kecamatan Kuma, Kabupaten Kotawaringin Barat, Kalimantan Tengah. Selain itu, spot foto disini sangatlah cocok untuk kamu yang suka upload di media social, 
               karena tempatnya bagus apalagi ketika menyebrang dari Panti Kubu menggunakan Kelotok. 
               Harga sewanya sekitar Rp 125000-Rp 150000 pulang dan pergi.Pantai Tanjung Keluang ini memiliki pasir putih dengan ombak yang tenang menjadikan pengunjung betah berlama-lama berada disini. 
               Jika kamu berminat untuk mengunjungi tempat ini, disarankan membawa bekal atau makanan dan minuman sendiri, karena belum ada yang warung yang berjualan disekitarnya. Namun jangan lupa untuk tetap jaga kebersihan ya.""".trimIndent(),
            """     Sesuai dengan namanya, Pantai Kubu ini berada di Desa Kubu, Kecamatan Kumai, Kota Pangkalan Bun, Kabupaten Kotawaringin, dan merupakan salah satu pintu gerbang utama menuju ke Tanjung Keluang.
               Jadi, sebelum pergi, atau sesudah pergi ke Tanjung Keluang, tidak ada salahnya singgah dulu ke Pantai Kubu ini. Ada beberapa hal menarik yang bisa ditemukan di tempat wisata ini selain pemandangan pantainya yang " cukup " indah.
               Pemandangan pantai ini juga tidak jauh berbeda dengan berbagai pantai yang ada di kalimantan. Hanya saja di pantai ini banyak batu karang yang sangat cocok untuk berfoto. Letaknya yang dekat dengan para nelayan membuat berbagai kuliner laut sangat beragam. 
               Tidak hanya ikan, berbagai seafood lain seperti udang, cumi dan kerang juga sangat lezat dan nikmat karena mereka mengolahnya dengan cara yang higienis dan bersih. Bahan utama yang digunakan juga masih segar dan fresh.
               Dan salah satu hal menarik yang bisa ditemukan di pantai ini yaitu banyak terdapat olahan-olahan menu seafood. Disamping itu, pemandangan sunset (matahari terbenam) di pantai ini juga sangat indah.
               Jika Anda hendak ke Pantai Kubu silakan saja datang ke Desa Kubu menggunakan kendaraan umum atau pribadi. Lokasinya yang mudah dijangkau membuat wisata ini tidak pernah sepi pengunjung. Terutama pada saat akhir pekan.""".trimIndent(),
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                )

    val getDataKobar : ArrayList<KobarModel>
        get() {
            var datadata : ArrayList<KobarModel> = ArrayList()
            val batas = 0.rangeTo(destination.size-1)
            for (i in batas){
                val indata = KobarModel(gbr[i],destination[i],location[i], detail[i])
                datadata.add(indata)
            }
            return datadata
        }
}