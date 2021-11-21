package com.farasatnovruzov.retrofitkotlin.view

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farasatnovruzov.retrofitkotlin.R
import android.graphics.BitmapFactory

import android.R.attr.bitmap
import com.farasatnovruzov.retrofitkotlin.databinding.ActivityJsoupHtmlBinding

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import java.io.IOException
import java.io.InputStream
import java.lang.StringBuilder
import java.net.URL


class JsoupHtml : AppCompatActivity() {
    private lateinit var binding: ActivityJsoupHtmlBinding
    private lateinit var first : String
    private lateinit var second : String
    private lateinit var third : String
    private lateinit var fourth : String
    private lateinit var fiveth : String
    private lateinit var sixth : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_jsoup_html)
        binding = ActivityJsoupHtmlBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        val doc: Document = Jsoup.connect("https://koronavirusinfo.az/az/page/statistika/azerbaycanda-cari-veziyyet").get()
//        doc.select("p").forEach(System.out::println)

//        val blogUrl = "https://spring.io/blog"
//        val doc = Jsoup.connect(blogUrl).get()
//        println(doc)




        Thread {
//            val builder = StringBuilder()
            try {
//                val doc = Jsoup.connect("http://www.ssaurel.com/blog").get()
//                val title = doc.title()
//                val links: Elements = doc.select("a[href]")
//                builder.append(title).append("\n")
//                for (link in links) {
//                    builder.append("\n").append("Link : ").append(link.attr("href"))
//                        .append("\n").append("Text : ").append(link.text())
//                }


//                val blogUrl = "https://spring.io/blog"
//                val doc = Jsoup.connect(blogUrl).get()
//                println(doc)



//                doc.select("p").forEach(System.out::println)
//                doc.select("strong").forEach(System.out::println)
//                doc.select("span").forEach(System.out::println)


//                for (item in div){
////                    println(item.select("span")+": "+item.select("strong"))
//                    println(item.allElements)
//                }

//                doc.select("div").forEach(System.out::println)



                val doc: Document =
                    Jsoup.connect("https://koronavirusinfo.az/az/page/statistika/azerbaycanda-cari-veziyyet")
                        .get()


                val div = doc.select("div.gray_little_statistic")
                val a = div[0].select("span").toString()
//                println(a)
                val a1 = a.substring(6,a.length-7)
//                println(a1)
                val b = div[0].select("strong").toString()
//                println(b)
                val b1 = b.substring(8,b.length-9)
//                println(b1)
                val total_cases = a1+":\n"+b1
                println(total_cases)

                second = total_cases



                val c = div[1].select("span").toString()
//                println(c)
                val c1 = c.substring(6,c.length-7)
//                println(c1)
                val d = div[1].select("strong").toString()
//                println(d)
                val d1 = d.substring(8,d.length-9)
//                println(d1)
                val total_recovered = c1+":\n"+d1
                println(total_recovered)

                fiveth = total_recovered


                val e = div[2].select("span").toString()
//                println(e)
                val e1 = e.substring(6,e.length-7)
//                println(e1)
                val f = div[2].select("strong").toString()
//                println(f)
                val f1 = f.substring(8,f.length-9)
//                println(f1)
                val new_case = e1+":\n"+f1
                println(new_case)

                first = new_case


                val g = div[3].select("span").toString()
//                println(g)
                val g1 = g.substring(6,g.length-7)
//                println(g1)
                val h = div[3].select("strong").toString()
//                println(h)
                val h1 = h.substring(8,h.length-9)
//                println(h1)
                val active_passient = g1+":\n"+h1
                println(active_passient)

                fourth = active_passient



                val i = div[4].select("span").toString()
//                println(i)
                val i1 = i.substring(6,i.length-7)
//                println(i1)
                val j = div[4].select("strong").toString()
//                println(j)
                val j1 = j.substring(8,j.length-9)
//                println(j1)
                val total_deaths = i1+":\n"+j1
                println(total_deaths)

                third = total_deaths


                val k = div[5].select("span").toString()
//                println(k)
                val k1 = k.substring(6,k.length-7)
//                println(k1)
                val l = div[5].select("strong").toString()
//                println(l)
                val l1 = l.substring(8,l.length-9)
//                println(l1)
                val total_tested = k1+":\n"+l1
                println(total_tested)

                sixth = total_tested









            } catch (e: IOException) {
//                builder.append("Error : ")
                e.printStackTrace()
            }
            runOnUiThread {
                binding.newCase.setText(first)
                binding.totalCases.setText(second)
                binding.totalDeaths.setText(third)
                binding.activePassients.setText(fourth)
                binding.totalRecoverd.setText(fiveth)
                binding.totalTested.setText(sixth)
                println("Ok!")
            }
        }.start()


//        //This is the Firebase URL where data will be fetched from
//        //This is the Firebase URL where data will be fetched from
//        val url = "https://firebase.google.com/"
////Connect to website
////Connect to website
//        val document: Document = Jsoup.connect(url).get()
//
////Get the logo source of the website
//
////Get the logo source of the website
//        val img: Element = document.select("img").first()
//// Locate the src attribute
//// Locate the src attribute
//        val imgSrc: String = img.absUrl("src")
//// Download image from URL
//// Download image from URL
//        val input: InputStream = URL(imgSrc).openStream()
//// Decode Bitmap
//// Decode Bitmap
////        bitmap = BitmapFactory.decodeStream(input)
//
////Get the title of the website
//
////Get the title of the website
//        title = document.title()

    }
}