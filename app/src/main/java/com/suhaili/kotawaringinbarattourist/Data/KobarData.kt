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
        R.drawable.suwayapwaterfall,
            R.drawable.kyaigedemosque
    )

    private val destination = arrayOf(
        "Tanjung Puting Nature Park",
        "Tanjung Keluang Nature Park",
        "Kubu Beach",
        "Arut River",
        "Kampung Sega/Kampung Pelangi",
        "Kuning Castle",
        "Pangeran Mangkubumi Castle",
        "Betang Traditional House",
        "Al-Nursari Castle",
        "Suwayap Waterfall",
            "Kyai Gede Mosque"
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
        "Runtu, Kec. Arut Selatan, Kab. Kotawaringin Barat",
        "Kotawaringin Hulu,Kec. Kotawaringin lama,Kab.Kotawaringin Barat"
    )

    private val detail = arrayOf(

            """    Tanjung Puting National Park was originally a nature reserve and wildlife reserve established by the Dutch East Indies Government in 1937.
               Then on October 25, 1996, Tanjung Puting was designated as a National Park with a total area of ​​415,040 ha.
               Geographically, Tanjung Puting National Park is located in Kumai District, Kotawaringin Barat Regency and in Hanau, Danau Sembuluh, and Seruyan Hilir Districts in Seruyan Regency, Central Kalimantan Province.
               This tourist spot is almost similar to a national park in general. It's just that the population of various monkey species is more dominant than other animals in this tourist location. For example, proboscis monkeys, long-tailed monkeys, Kalimantan gibbons, and
               orangutans are very numerous and varied. There are also various rare birds and various types of crocodiles in this tourist location.
               If you want to go to the location, please just come to Kumai District, then take a tour boat down the Sekonyer River for about 4 hours.
               Usually, one boat can accommodate 25-50 people, so if a group arrives, it will be cheaper because one rental is only Rp. 165,000.""".trimIndent().toString(),
            """     Tanjung Keluang is a turtle conservation area that was opened in 2000 and is managed by the Kotawaringin Barat Tourism Office. Here, tourists can get direct experience releasing turtle hatchlings to the beach.
               This activity is actually the main attraction of this place. Tourists who visit are not only from within the country, but from abroad as well.
               Tanjung Keluang Beach is located in Kubu, Kuma District, Kotawaringin Barat Regency, Central Kalimantan. In addition, the photo spots here are perfect for those of you who like to upload on social media,
               because the place is good especially when crossing from the Kubu Panti using Kelotok.
               The rental price is around IDR 125,000-IDR 1,50000 going home and away. Tanjung Keluang beach has white sand with calm waves that make visitors feel at home for a long time here.
               If you are interested in visiting this place, it is advisable to bring your own supplies or food and drinks, because there are no stalls selling nearby. But don't forget to keep it clean.""".trimIndent().toString(),
            """     As the name implies, Kubu Beach is located in Kubu Village, Kumai District, Pangkalan Bun City, Kotawaringin Regency, and is one of the main gates to Tanjung Keluang.
               So, before going, or after going to Tanjung Keluang, there's nothing wrong with stopping at Kubu Beach first. There are several interesting things that can be found in this tourist spot besides the "quite" beautiful beach views.
               The view of this beach is also not much different from various beaches in Kalimantan. It's just that on this beach there are many rocks that are very suitable for taking pictures. Its location close to fishermen makes a variety of seafood dishes very diverse.
               Not only fish, various other seafood such as shrimp, squid and shellfish are also very delicious and delicious because they process it in a hygienic and clean way. The main ingredients used are still fresh and fresh.
               And one of the interesting things that can be found on this beach is that there are many processed seafood menus. Besides that, the view of the sunset on this beach is also very beautiful.
               If you want to go to Kubu Beach, please come to Kubu Village using public or private transportation. Its easy-to-reach location makes this tour never empty of visitors. Especially on the weekends.""".trimIndent().toString(),
            """     When visiting the Arut River, visitors will meet with a getek (small boat) driver who can take them along the river which is about 2 kilometers long. Usually the getek can be boarded by 3-7 people at a time.
               Actually the experience of riding a getek is one of the most extraordinary experiences, because we can enjoy how beautiful the nature around the river, take pictures of unique scenery that we rarely find, play with water, and much more.
               The first tourist spot in Pangkalanbun, Kotawaringin Barat district is a tour in the Arut river area, which is a river that flows in the Kotawaringin Barat Regency, Central Kalimantan, Indonesia.
               But there is something interesting about this one tourist spot. In fact, the view before the night is a sight that tourists are eagerly awaiting. 
               Because around the riverbanks there are village lights that start to light up, plus the color of the lights is colorful so that residents call it Kampung Pelangi.
                    Not only that, it turns out that there are also decorative pieces that are specially designed with flickering lights. With this getek, many tourists are interested in riding it.
               When walking along the river using getek, tourists can capture the rare moment above getek on condition that they have to be calm and don't get in a mess so they don't fall into the river with a depth of 10 meters. 
               Wow, all in all, guys, so be careful and stay calm when taking photos.
               To be able to ride the getek, visitors only need to pay IDR 10 thousand per person. With a price that is arguably quite cheap, visitors can enjoy the beauty of nature to their heart's content and capture the moment while walking along the river,
               and also in alleys filled with colorful lights like a rainbow.
               This is suitable for those of you who like to show off on social media, especially Instagram, hehe. The best time to visit here is around 19.30-22.00 local time.""".trimIndent().toString(),
            """     One of the tourist attractions in Pangkalanbun that in my opinion is very feasible and that you can easily visit is Pelangi Mendawai Village and Sega Village which are right on the coast of the Arut river. 
                Administratively, Kampung Pelangi Mendawai is located on Jl. Barame, Mendawai, Arut Selatan District, Kotawaringin Barat Regency, Central Kalimantan.
                What's interesting about Kampung Pelangi Mendawai or Kampung Sega is of course the colors and patterns or pictures in this small village. Many bright and quite striking colors adorn the roof, walls to glass or fences along the banks of the Arut river, especially in Kampung Pelangi Mendawai.
                Not only the beautiful scenery of colorful villages, we can also try a variety of culinary delights that are sold or sold by residents along the Arut River or along Kampung Pelangi Mendawai. One of them is trying processed fish and tasting Kotawaringin's special food, namely Soto Manggala which is quite distinctive and delicious.""".trimIndent().toString(),
            """     Of course, you don't miss one of the tourist attractions that are in the city center of Pangkalnbun and you must visit Instana Kuning. This historical tourist spot is one proof that the power of the Banjar kingdom in South Kalimantan also extends to the Kotawaringin area.
                This tourist spot which is called the yellow palace does not emit a yellow color which is quite striking. It's just that, it is said that this palace used to have a room called Dalam Kuning. According to history, during the reign of the Kutaringin sultanate, the wood used to make the palace was of this color. 
                Almost the entire palace is yellow, so the palace is called the Yellow Palace.
                    History tells us that the Yellow Palace was a Royal Palace during the Kutaringin Sultanate. The Yellow Palace itself is one of the palaces in the Kalimantan region, especially the City of Waringin Regency, Central Kalimantan. 
                This yellow palace is in the middle of Pangkalanbun city and next to the monument field or Tugu Adipura.
                Entering this tourist location, you will be presented with various historical relics of the Kutaringin sultanate. Various cannons, jars, spears for hunting and keris also color this palace. Do not forget that there are 14 paintings of sultans who have ruled the Kutaringin sultanate in the past.
                    There are several rooms in the Yellow Palace such as Bangsal which is used as a reception for royal guests, Rumbang as a place for the king to meditate, Dalem Kuning which functions as the center of government, and the residence of the king and Pedahiran as a royal dining room""".trimIndent().toString(),
            """     Tourist attractions in Pangkalanbun, Kotawaringin Barat district, next is a historical palace called Pangeran Mangkubumi Palace which is located at Jalan Pakunegara, Arut Selatan, Raja, Arut Selatan District, Pangkalanbun, Central Kalimantan. One of the uniqueness of the Pangeran Mangkubumi Palace is that it is different from the general building, 
                namely made of ironwood planks and wood shingle roof.This palace was once the residence of Pangeran Adipati Mangkubumi.
                Currently the house is handed over to the Central Kalimantan Provincial Education and Culture Office and used as a cultural heritage and rehabilitation has been carried out. That is why Mangkubumi Palace is one of the historical tourist attractions visited by many tourists.
                In the Mangkubumi palace, there are several historical items such as keris, ornate mirrors, jars, baths for the bride and groom, petromax-like lamps, and many more.""".trimIndent().toString(),
            """     West Kotawaringin area is one of the areas inhabited by many Dayak tribes. Not surprisingly, in the city of Pangkalanbun there is also a cultural tourist spot in the form of a traditional house called the Betang Pasir Panjang traditional house. Named Pasir Panjang because of its location on a long sand road to Kumai port, 
                this Betang traditional house is often called the traditional long sand house.
                The traditional village of Pasir Panjang itself is located on the outskirts of the city of Pangkalan Bun, 
                West Kotawaringin Regency, Central Kalimantan. This village has always been used as a leading tourist destination in addition to the Tanjung Puting National Park and the Arut River. 
                The Dayak Pasir Panjang Traditional Village was originally inhabited by the Dayak Pasir Panjang community who until now still maintain their cultural traditions, such as building this traditional house and often holding cultural performances.
                To enter the yard around the Betang Pasir Panjang Traditional House is free, aka free of charge. Tourists can take pictures around the grassy lawn. Even when we open it, we can see the inside and take pictures or see the contents. Next to the Betang Pasir Panjang Traditional House, 
                there is a kind of pavilion which is quite wide and we can also relax under it.""".trimIndent().toString(),
            """     This time we will shift to tourist attractions in the Kotawaringin Lama area. A tourist spot that you must also visit is the historical area in Kotawaringin Lama which is still included in the West Kotawaringin Regency, namely Astana Alnursari.
                Astana Al Nursari or Alnursari Palace is a palace or arguably the Palace of the Kotawaringin Sultanate located in West Kotawaringin Regency, Central Kalimantan province. Astana Al-Nursari is administratively located on Jl. Merdeka Kotawaringin Hulu Village, Kotawaringin Lama District, West Kotawaringin Regency, 
                Central Kalimantan Province, is ± 150 m on the west bank of the Lamandau River.
                The function of Astana Al-Nursari is as a residence for aristocratic descendants of the King / Sultan of Kotawaringin who still live in Kotawaringin Lama after the transfer of the royal center to Pangkalan Bun.""".trimIndent().toString(),
            """     Tourist attractions in Pangkalan Bun (Kotawaringin Barat - Central Kalimantan) that are interesting to visit are Suayap Waterfall. This waterfall is still natural and has not been visited by many tourists.
                This tourist destination is located in the palm oil company. To be able to enter this tourist spot you must first ask permission from the officer. Then you will be given a visitor card so you can freely enter tourist sites. 
                This waterfall is so beautiful and enchanting that you will feel at home for a long time there. Cool waterfalls and clean air make your holiday atmosphere even more enjoyable.
                The facilities at Suayap Waterfall are very complete. There are clean and well-maintained toilets, a changing room and a prayer room at the edge of the waterfall. By vacationing with your family to this location, 
                you can increase your enthusiasm when you return to work later.
                The location is in an oil palm plantation area, or more precisely in Runtu Village, Arut Selatan District, Kotawaringin Barat Regency. 
                Usually, this waterfall is open every day, from 06:30 to 17:00.
                To enjoy the beauty of this waterfall, visitors must first ask permission from the security personnel who are on duty at the company that manages the oil palm plantation.""".trimIndent().toString(),
            """     The most historic mosque is the Kyai Gede Mosque. The Jami Kiyai Gede Mosque in Kotawaringin is one of the religious and historical tourist attractions in Kotawaringin Barat, Central Kalimantan. The Jami Kiyai Gede Mosque is one of the oldest mosques in the province of Central Kalimantan and is one of the legacies of the Kotawaringin sultanate. 
                The old Jami Kiyai Gede mosque is made of ironwood which makes it still standing firm and carrying out its functions well to this day. even the shape and design are still the same as the beginning of the construction even though it is right on the river bank and changing the weather.
                One of the features of the Kiyai Gede Mosque can be seen from the building's raw materials, which are all made of selected wood, namely ironwood. 
                As we know, Ulin wood is known to last for a long time and in all weather. The Kiai Gede Mosque is not too big, only measuring 16 x 16 meters or 256 m².""".trimIndent().toString()
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