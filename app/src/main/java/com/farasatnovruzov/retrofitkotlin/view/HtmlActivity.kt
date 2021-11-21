package com.farasatnovruzov.retrofitkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.farasatnovruzov.retrofitkotlin.R
import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class HtmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)

        val myWebView: WebView = findViewById(R.id.web)
        myWebView.loadUrl("https://koronavirusinfo.az/az/page/statistika/azerbaycanda-cari-veziyyet")

//        val doc: Document = Jsoup.connect("https://koronavirusinfo.az/az/page/statistika/azerbaycanda-cari-veziyyet").get()
//        doc.select("p").forEach(System.out::println)

//        val blogUrl = "https://spring.io/blog"
//        val doc = Jsoup.connect(blogUrl).get()
//        println(doc)

        //        val okHttpClient = OkHttpClient().newBuilder()
//            .build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://www.instagram.com/elde0596/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(okHttpClient)
//            .build()
//
//        val request: CovidHtml = retrofit.create(CovidHtml::class.java)
//        val call: Call<ResponseBody> = request.getHtml()
//        call.enqueue(object : Callback<ResponseBody?>() {
//            fun onResponse(call: Call<ResponseBody?>?, response: Response<ResponseBody>) {
////                txt.setText(response.body()!!.source().toString())
//                println("getting html: "+response.body()!!.source().toString())
//                Log.i("SDADASDAWEQ", "A " + response.body().toString())
//            }
//
//            override fun onFailure(call: Call<ResponseBody?>?, t: Throwable) {
//                Log.i("SDADASDAWEQ", "B " + t.message)
//            }
//        })


//        val dispatcher = Dispatcher(Executors.newFixedThreadPool(20))
//        dispatcher.setMaxRequests(20)
//        dispatcher.setMaxRequestsPerHost(1)
//        val okHttpClient = OkHttpClient.Builder()
//            .dispatcher(dispatcher)
//            .connectionPool(ConnectionPool(100, 30, TimeUnit.SECONDS))
//            .build()
//        val retrofit = Retrofit.Builder()
//            .baseUrl(HttpUrl.parse("https://www.x.x/x/"))
//            .addConverterFactory(PageAdapter.FACTORY)
//            .build()
//        val requestAddress = retrofit.create(PageService::class.java)
//        val pageCall: Call<Page> = requestAddress[HttpUrl.parse("https://www.x.x/x/")]
//        pageCall.enqueue(object : Callback<Page?>() {
//            fun onResponse(call: Call<Page?>?, response: Response<Page?>) {
//                Log.i("ADASDASDASD", response.body().content)
//            }
//
//            fun onFailure(call: Call<Page?>?, t: Throwable?) {}
//        })
//    }
//
//    internal class Page(var content: String)
//    internal class PageAdapter : Converter<ResponseBody, Page> {
//        @Throws(IOException::class)
//        override fun convert(responseBody: ResponseBody): Page {
//            val document: Document = Jsoup.parse(responseBody.string())
//            val value: Element = document.select("script").get(1)
//            val content: String = value.html()
//            return Page(content)
//        }
//
//        companion object {
//            val FACTORY: Converter.Factory = object : Converter.Factory() {
//                override fun responseBodyConverter(
//                    type: Type,
//                    annotations: Array<Annotation?>?,
//                    retrofit: Retrofit?
//                ): Converter<ResponseBody, *>? {
//                    return if (type === Page::class.java) PageAdapter() else null
//                }
//            }
//        }
//    }
//
//    internal interface PageService {
//        @GET
//        operator fun get(@Url url: HttpUrl?): Call<Page?>?
//    }
    }
}

