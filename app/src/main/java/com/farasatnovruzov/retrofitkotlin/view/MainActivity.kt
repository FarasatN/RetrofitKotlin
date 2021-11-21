package com.farasatnovruzov.retrofitkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farasatnovruzov.retrofitkotlin.R
import com.farasatnovruzov.retrofitkotlin.adapter.CovidAdapter
import com.farasatnovruzov.retrofitkotlin.databinding.ActivityMainBinding
import com.farasatnovruzov.retrofitkotlin.model1.Covid
import com.farasatnovruzov.retrofitkotlin.service.CovidHtml
import com.farasatnovruzov.retrofitkotlin.service.ServiceAPI
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.*
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.ResponseBody

import retrofit2.Retrofit

import okhttp3.OkHttpClient
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


class MainActivity : AppCompatActivity() {


//    var retrofit = Retrofit.Builder()
//        .baseUrl("https://api.example.com")
//        .addConverterFactory(CsvConverterFactory.create())
//        .build()

//    https://coronavirus-tracker-api.herokuapp.com/v2/locations?country_code=AZ
//    https://covid.ourworldindata.org/data/owid-covid-data.json
//    https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/latest/owid-covid-latest.json

//    private val BASE_URL = "https://raw.githubusercontent.com/"

    private lateinit var binding: ActivityMainBinding

    //    val covidList = ArrayList<String>()
//    val dataName = ArrayList<String>()
    val covidData = ArrayList<String>()

    var base: Covid? = null

    private val BASE_URL = "https://raw.githubusercontent.com/"

    private var covidAdapter: CovidAdapter? = null

    //Disposable
    private var compositeDisposable: CompositeDisposable? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        compositeDisposable = CompositeDisposable()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        loadData()

//        val doc: Document = Jsoup.connect("https://koronavirusinfo.az/az/page/statistika/azerbaycanda-cari-veziyyet").get()
//        doc.select("p").forEach(System.out::println)

//        val blogUrl = "https://spring.io/blog"
//        val doc = Jsoup.connect(blogUrl).get()
//        println(doc)

        val doc = Jsoup.connect("https://en.wikipedia.org/").get()
        println(doc.title())
        val newsHeadlines: Elements = doc.select("#mp-itn b a")
        for (headline in newsHeadlines) {
            println(
                "%s\n\t%s"+""+
                headline.attr("title")+""+ headline.absUrl("href")
            )
        }


    }

    private fun loadData() {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build().create(ServiceAPI::class.java)

        compositeDisposable?.add(
            retrofit.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResponse)
        )


        /*

//        val service = retrofit.create(ServiceAPI::class.java)
//        val call = service.getData()

        call.enqueue(object : Callback<Covid> {
            override fun onResponse(
                call: Call<Covid>,
                response: Response<Covid>
            ) {

                if (response.isSuccessful) {
                    response.body()?.let {
                        base = it



//                        println(base!!.aze?.location)
//                        println(base!!.aze?.lastUpdatedDate)
//                        println(base!!.aze?.newCases)
//                        println(base!!.aze?.femaleSmokers)
//                        println(base!!.aze?.continent)

                        covidData.add("Son yenilənmə tarixi:\n${base!!.aze?.lastUpdatedDate.toString()}")
                        covidData.add("Ölkə:\n${base!!.aze?.location.toString()}")
//                        dataName.add(base!!.aze?.continent.toString())
                        covidData.add("Pozitivlik(%):\n${base!!.aze?.positiveRate.toString()}")
//                        covidData.add("Pozitiv(Say ilə):\n${base!!.aze?.newCasesPerMillion.toString()}")
//                        dataName.add(base!!.aze?.newCasesSmoothed.toString())
//                        dataName.add(base!!.aze?.newCasesSmoothedPerMillion.toString())
                        covidData.add("Ümumi Yoluxma Sayı:\n${base!!.aze?.totalCases.toString()}")
//                        dataName.add(base!!.aze?.totalCasesPerMillion.toString())
                        covidData.add("Yeni Ölüm Sayı:\n${base!!.aze?.newDeaths.toString()}")
//                        dataName.add(base!!.aze?.newDeathsPerMillion.toString())
//                        dataName.add(base!!.aze?.newDeathsSmoothed.toString())
//                        dataName.add(base!!.aze?.newDeathsSmoothedPerMillion.toString())
//                        dataName.add(base!!.aze?.newPeopleVaccinatedSmoothed.toString())
//                        dataName.add(base!!.aze?.newPeopleVaccinatedSmoothedPerHundred.toString())
                        covidData.add("Yeni Test Sayı:\n${base!!.aze?.newTests.toString()}")
//                        dataName.add(base!!.aze?.newTestsPerThousand.toString())
//                        dataName.add(base!!.aze?.newTestsSmoothed.toString())
//                        dataName.add(base!!.aze?.newTestsSmoothedPerThousand.toString())
                        covidData.add("Yeni Vaksinasiya Sayı:\n${base!!.aze?.newVaccinations.toString()}")
//                        dataName.add(base!!.aze?.newVaccinationsSmoothed.toString())
//                        dataName.add(base!!.aze?.newVaccinationsSmoothedPerMillion.toString())
                        covidData.add("Tam Vaksinasiya Sayı:\n${base!!.aze?.peopleFullyVaccinated.toString()}")
//                        dataName.add(base!!.aze?.peopleFullyVaccinatedPerHundred.toString())
                        covidData.add("Vaksinasiya Sayı:\n${base!!.aze?.peopleVaccinated.toString()}")
//                        dataName.add(base!!.aze?.peopleVaccinatedPerHundred.toString())
//                        dataName.add(base!!.aze?.testsPerCase.toString())
//                        dataName.add(base!!.aze?.totalBoosters.toString())
//                        dataName.add(base!!.aze?.totalBoostersPerHundred.toString())
                        covidData.add("Ümumi Ölüm Sayı:\n${base!!.aze?.totalDeaths.toString()}")
//                        dataName.add(base!!.aze?.totalDeathsPerMillion.toString())
                        covidData.add("Ümumi Test Sayı:\n${base!!.aze?.totalTests.toString()}")
//                        dataName.add(base!!.aze?.totalTestsPerThousand.toString())
                        covidData.add("Ümumi Vaksinasiya Sayı:\n${base!!.aze?.totalVaccinations.toString()}")
//                        dataName.add(base!!.aze?.totalVaccinationsPerHundred.toString())
//                        covidData.add("Həftəlik Xəstəxana müraciəti:\n${base!!.aze?.weeklyHospAdmissions.toString()}")
//                        dataName.add(base!!.aze?.weeklyHospAdmissionsPerMillion.toString())
//                        dataName.add(base!!.aze?.weeklyIcuAdmissions.toString())
//                        dataName.add(base!!.aze?.weeklyIcuAdmissionsPerMillion.toString())
//                        dataName.add(base!!.aze?.testsUnits.toString())
//                        covidData.add("Ümumi Xəstəxanada Yatanlar:\n${base!!.aze?.hospPatients.toString()}")
//                        dataName.add(base!!.aze?.hospPatientsPerMillion.toString())
//                        dataName.add(base!!.aze?.hospitalBedsPerThousand.toString())
//                        covidData.add("Vəziyyəti Ağır Olanlar:\n${base!!.aze?.icuPatients.toString()}")
//                        dataName.add(base!!.aze?.icuPatientsPerMillion.toString())
//                        dataName.add(base!!.aze?.excessMortality.toString())
//                        dataName.add(base!!.aze?.excessMortalityCumulativeAbsolute.toString())
//                        dataName.add(base!!.aze?.excessMortalityCumulative.toString())
//                        dataName.add(base!!.aze?.handwashingFacilities.toString())
                        covidData.add("65 yaşdan yuxarı əhali(%):\n${base!!.aze?.aged65Older.toString()}")
                        covidData.add("70 yaşdan yuxarı əhali(%):\n${base!!.aze?.aged70Older.toString()}")
                        covidData.add("Ürək xəstəliklərinə bağlı ölüm sayı:\n${base!!.aze?.cardiovascDeathRate.toString()}")
                        covidData.add("Ümumi Şəkər Xəstəsi(%):\n${base!!.aze?.diabetesPrevalence.toString()}")
                        covidData.add("Siqaret çəkənlər(kişi)(%):\n${base!!.aze?.maleSmokers.toString()}")
                        covidData.add("Siqaret çəkənlər(qadın)(%):\n${base!!.aze?.femaleSmokers.toString()}")
                        covidData.add("Ümumi Əhali Sayı:\n${base!!.aze?.population.toString()}")
                        covidData.add("Ümumi Əhali Sıxlığı(per square km):\n${base!!.aze?.populationDensity.toString()}")
                        covidData.add("Orta Yaş(Median Age):\n${base!!.aze?.medianAge.toString()}")
                        covidData.add("Adambaşına düşən illik gəlir(gdp per capita):\n${base!!.aze?.gdpPerCapita.toString()}")
                        covidData.add("İnsan İnkişaf İndeksi(hdi):\n${base!!.aze?.humanDevelopmentIndex.toString()}")
                        covidData.add("Əhali artımı(%):\n${base!!.aze?.reproductionRate.toString()}")
                        covidData.add("Orta Yaş Gözləntisi:\n${base!!.aze?.lifeExpectancy.toString()}")
//                        covidData.add("Ciddi Yoxsulluq:\n${base!!.aze?.extremePoverty.toString()}")
                        covidData.add("Yoxsulluq:\n${base!!.aze?.stringencyIndex.toString()}")



                        binding.textView.setText("Yeni Yoluxma Sayı:")
                        binding.textView2.setText(base?.aze?.newCases.toString())

                        covidAdapter = covidData.let { it1 -> CovidAdapter(it1,this@MainActivity) }
                        recyclerView.adapter = covidAdapter



                        /*
                                               covidList.add(base!!.aze?.lastUpdatedDate.toString())
                                               covidList.add(base!!.aze?.location.toString())
                       //                        covidList.add(base!!.aze?.continent.toString())
                                               covidList.add(base!!.aze?.positiveRate.toString())
                                               covidList.add(base!!.aze?.newCasesPerMillion.toString())
                       //                        covidList.add(base!!.aze?.newCasesSmoothed.toString())
                       //                        covidList.add(base!!.aze?.newCasesSmoothedPerMillion.toString())
                                               covidList.add(base!!.aze?.totalCases.toString())
                       //                        covidList.add(base!!.aze?.totalCasesPerMillion.toString())
                                               covidList.add(base!!.aze?.newDeaths.toString())
                       //                        covidList.add(base!!.aze?.newDeathsPerMillion.toString())
                       //                        covidList.add(base!!.aze?.newDeathsSmoothed.toString())
                       //                        covidList.add(base!!.aze?.newDeathsSmoothedPerMillion.toString())
                       //                        covidList.add(base!!.aze?.newPeopleVaccinatedSmoothed.toString())
                       //                        covidList.add(base!!.aze?.newPeopleVaccinatedSmoothedPerHundred.toString())
                                               covidList.add(base!!.aze?.newTests.toString())
                       //                        covidList.add(base!!.aze?.newTestsPerThousand.toString())
                       //                        covidList.add(base!!.aze?.newTestsSmoothed.toString())
                       //                        covidList.add(base!!.aze?.newTestsSmoothedPerThousand.toString())
                                               covidList.add(base!!.aze?.newVaccinations.toString())
                       //                        covidList.add(base!!.aze?.newVaccinationsSmoothed.toString())
                       //                        covidList.add(base!!.aze?.newVaccinationsSmoothedPerMillion.toString())
                                               covidList.add(base!!.aze?.peopleFullyVaccinated.toString())
                       //                        covidList.add(base!!.aze?.peopleFullyVaccinatedPerHundred.toString())
                                               covidList.add(base!!.aze?.peopleVaccinated.toString())
                       //                        covidList.add(base!!.aze?.peopleVaccinatedPerHundred.toString())
                       //                        covidList.add(base!!.aze?.testsPerCase.toString())
                       //                        covidList.add(base!!.aze?.totalBoosters.toString())
                       //                        covidList.add(base!!.aze?.totalBoostersPerHundred.toString())
                                               covidList.add(base!!.aze?.totalDeaths.toString())
                       //                        covidList.add(base!!.aze?.totalDeathsPerMillion.toString())
                                               covidList.add(base!!.aze?.totalTests.toString())
                       //                        covidList.add(base!!.aze?.totalTestsPerThousand.toString())
                                               covidList.add(base!!.aze?.totalVaccinations.toString())
                       //                        covidList.add(base!!.aze?.totalVaccinationsPerHundred.toString())
                                               covidList.add(base!!.aze?.weeklyHospAdmissions.toString())
                       //                        covidList.add(base!!.aze?.weeklyHospAdmissionsPerMillion.toString())
                       //                        covidList.add(base!!.aze?.weeklyIcuAdmissions.toString())
                       //                        covidList.add(base!!.aze?.weeklyIcuAdmissionsPerMillion.toString())
                       //                        covidList.add(base!!.aze?.testsUnits.toString())
                                               covidList.add(base!!.aze?.hospPatients.toString())
                       //                        covidList.add(base!!.aze?.hospPatientsPerMillion.toString())
                       //                        covidList.add(base!!.aze?.hospitalBedsPerThousand.toString())
                                               covidList.add(base!!.aze?.icuPatients.toString())
                       //                        covidList.add(base!!.aze?.icuPatientsPerMillion.toString())
                       //                        covidList.add(base!!.aze?.excessMortality.toString())
                       //                        covidList.add(base!!.aze?.excessMortalityCumulativeAbsolute.toString())
                       //                        covidList.add(base!!.aze?.excessMortalityCumulative.toString())
                       //                        covidList.add(base!!.aze?.handwashingFacilities.toString())
                                               covidList.add(base!!.aze?.aged65Older.toString())
                                               covidList.add(base!!.aze?.aged70Older.toString())
                                               covidList.add(base!!.aze?.cardiovascDeathRate.toString())
                                               covidList.add(base!!.aze?.diabetesPrevalence.toString())
                                               covidList.add(base!!.aze?.maleSmokers.toString())
                                               covidList.add(base!!.aze?.femaleSmokers.toString())
                                               covidList.add(base!!.aze?.population.toString())
                                               covidList.add(base!!.aze?.populationDensity.toString())
                                               covidList.add(base!!.aze?.medianAge.toString())
                                               covidList.add(base!!.aze?.gdpPerCapita.toString())
                                               covidList.add(base!!.aze?.humanDevelopmentIndex.toString())
                                               covidList.add(base!!.aze?.reproductionRate.toString())
                                               covidList.add(base!!.aze?.lifeExpectancy.toString())
                                               covidList.add(base!!.aze?.extremePoverty.toString())
                                               covidList.add(base!!.aze?.stringencyIndex.toString())


                                               println(covidList?.count())

                                               for (item in covidList!!){
                                                   println(covidList)
                                               }
                       */
                    }
                }
            }

            override fun onFailure(call: Call<Covid>, t: Throwable) {
                println("error!")
                t.printStackTrace()
            }

        })
    }
*/
    }



        private fun handleResponse(covid: Covid) {
            base = covid


//                        println(base!!.aze?.location)
//                        println(base!!.aze?.lastUpdatedDate)
//                        println(base!!.aze?.newCases)
//                        println(base!!.aze?.femaleSmokers)
//                        println(base!!.aze?.continent)

            covidData.add("Son yenilənmə tarixi:\n${base!!.aze?.lastUpdatedDate.toString()}")
            covidData.add("Ölkə:\n${base!!.aze?.location.toString()}")
//                        dataName.add(base!!.aze?.continent.toString())
            covidData.add("Pozitivlik(%):\n${base!!.aze?.positiveRate.toString()}")
//                        covidData.add("Pozitiv(Say ilə):\n${base!!.aze?.newCasesPerMillion.toString()}")
//                        dataName.add(base!!.aze?.newCasesSmoothed.toString())
//                        dataName.add(base!!.aze?.newCasesSmoothedPerMillion.toString())
            covidData.add("Ümumi Yoluxma Sayı:\n${base!!.aze?.totalCases.toString()}")
//                        dataName.add(base!!.aze?.totalCasesPerMillion.toString())
            covidData.add("Yeni Ölüm Sayı:\n${base!!.aze?.newDeaths.toString()}")
//                        dataName.add(base!!.aze?.newDeathsPerMillion.toString())
//                        dataName.add(base!!.aze?.newDeathsSmoothed.toString())
//                        dataName.add(base!!.aze?.newDeathsSmoothedPerMillion.toString())
//                        dataName.add(base!!.aze?.newPeopleVaccinatedSmoothed.toString())
//                        dataName.add(base!!.aze?.newPeopleVaccinatedSmoothedPerHundred.toString())
            covidData.add("Yeni Test Sayı:\n${base!!.aze?.newTests.toString()}")
//                        dataName.add(base!!.aze?.newTestsPerThousand.toString())
//                        dataName.add(base!!.aze?.newTestsSmoothed.toString())
//                        dataName.add(base!!.aze?.newTestsSmoothedPerThousand.toString())
            covidData.add("Yeni Vaksinasiya Sayı:\n${base!!.aze?.newVaccinations.toString()}")
//                        dataName.add(base!!.aze?.newVaccinationsSmoothed.toString())
//                        dataName.add(base!!.aze?.newVaccinationsSmoothedPerMillion.toString())
            covidData.add("Tam Vaksinasiya Sayı:\n${base!!.aze?.peopleFullyVaccinated.toString()}")
//                        dataName.add(base!!.aze?.peopleFullyVaccinatedPerHundred.toString())
            covidData.add("Vaksinasiya Sayı:\n${base!!.aze?.peopleVaccinated.toString()}")
//                        dataName.add(base!!.aze?.peopleVaccinatedPerHundred.toString())
//                        dataName.add(base!!.aze?.testsPerCase.toString())
//                        dataName.add(base!!.aze?.totalBoosters.toString())
//                        dataName.add(base!!.aze?.totalBoostersPerHundred.toString())
            covidData.add("Ümumi Ölüm Sayı:\n${base!!.aze?.totalDeaths.toString()}")
//                        dataName.add(base!!.aze?.totalDeathsPerMillion.toString())
            covidData.add("Ümumi Test Sayı:\n${base!!.aze?.totalTests.toString()}")
//                        dataName.add(base!!.aze?.totalTestsPerThousand.toString())
            covidData.add("Ümumi Vaksinasiya Sayı:\n${base!!.aze?.totalVaccinations.toString()}")
//                        dataName.add(base!!.aze?.totalVaccinationsPerHundred.toString())
//                        covidData.add("Həftəlik Xəstəxana müraciəti:\n${base!!.aze?.weeklyHospAdmissions.toString()}")
//                        dataName.add(base!!.aze?.weeklyHospAdmissionsPerMillion.toString())
//                        dataName.add(base!!.aze?.weeklyIcuAdmissions.toString())
//                        dataName.add(base!!.aze?.weeklyIcuAdmissionsPerMillion.toString())
//                        dataName.add(base!!.aze?.testsUnits.toString())
//                        covidData.add("Ümumi Xəstəxanada Yatanlar:\n${base!!.aze?.hospPatients.toString()}")
//                        dataName.add(base!!.aze?.hospPatientsPerMillion.toString())
//                        dataName.add(base!!.aze?.hospitalBedsPerThousand.toString())
//                        covidData.add("Vəziyyəti Ağır Olanlar:\n${base!!.aze?.icuPatients.toString()}")
//                        dataName.add(base!!.aze?.icuPatientsPerMillion.toString())
//                        dataName.add(base!!.aze?.excessMortality.toString())
//                        dataName.add(base!!.aze?.excessMortalityCumulativeAbsolute.toString())
//                        dataName.add(base!!.aze?.excessMortalityCumulative.toString())
//                        dataName.add(base!!.aze?.handwashingFacilities.toString())
            covidData.add("65 yaşdan yuxarı əhali(%):\n${base!!.aze?.aged65Older.toString()}")
            covidData.add("70 yaşdan yuxarı əhali(%):\n${base!!.aze?.aged70Older.toString()}")
            covidData.add("Ürək xəstəliklərinə bağlı ölüm sayı:\n${base!!.aze?.cardiovascDeathRate.toString()}")
            covidData.add("Ümumi Şəkər Xəstəsi(%):\n${base!!.aze?.diabetesPrevalence.toString()}")
            covidData.add("Siqaret çəkənlər(kişi)(%):\n${base!!.aze?.maleSmokers.toString()}")
            covidData.add("Siqaret çəkənlər(qadın)(%):\n${base!!.aze?.femaleSmokers.toString()}")
            covidData.add("Ümumi Əhali Sayı:\n${base!!.aze?.population.toString()}")
            covidData.add("Ümumi Əhali Sıxlığı(per square km):\n${base!!.aze?.populationDensity.toString()}")
            covidData.add("Orta Yaş(Median Age):\n${base!!.aze?.medianAge.toString()}")
            covidData.add("Adambaşına düşən illik gəlir(gdp per capita):\n${base!!.aze?.gdpPerCapita.toString()}")
            covidData.add("İnsan İnkişaf İndeksi(hdi):\n${base!!.aze?.humanDevelopmentIndex.toString()}")
            covidData.add("Əhali artımı(%):\n${base!!.aze?.reproductionRate.toString()}")
            covidData.add("Orta Yaş Gözləntisi:\n${base!!.aze?.lifeExpectancy.toString()}")
//                        covidData.add("Ciddi Yoxsulluq:\n${base!!.aze?.extremePoverty.toString()}")
            covidData.add("Yoxsulluq:\n${base!!.aze?.stringencyIndex.toString()}")



            binding.textView.setText("Yeni Yoluxma Sayı:")
            binding.textView2.setText(base?.aze?.newCases.toString())

            covidAdapter = covidData.let { it1 -> CovidAdapter(it1, this@MainActivity) }
            recyclerView.adapter = covidAdapter
        }


    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable?.clear()
    }

    }
