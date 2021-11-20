import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class DOM (

	@SerializedName("continent") val continent : String,
	@SerializedName("location") val location : String,
	@SerializedName("last_updated_date") val last_updated_date : String,
	@SerializedName("total_cases") val total_cases : Int,
	@SerializedName("new_cases") val new_cases : Int,
	@SerializedName("new_cases_smoothed") val new_cases_smoothed : Double,
	@SerializedName("total_deaths") val total_deaths : Int,
	@SerializedName("new_deaths") val new_deaths : Int,
	@SerializedName("new_deaths_smoothed") val new_deaths_smoothed : Double,
	@SerializedName("total_cases_per_million") val total_cases_per_million : Double,
	@SerializedName("new_cases_per_million") val new_cases_per_million : Double,
	@SerializedName("new_cases_smoothed_per_million") val new_cases_smoothed_per_million : Double,
	@SerializedName("total_deaths_per_million") val total_deaths_per_million : Double,
	@SerializedName("new_deaths_per_million") val new_deaths_per_million : Int,
	@SerializedName("new_deaths_smoothed_per_million") val new_deaths_smoothed_per_million : Double,
	@SerializedName("reproduction_rate") val reproduction_rate : Double,
	@SerializedName("icu_patients") val icu_patients : String,
	@SerializedName("icu_patients_per_million") val icu_patients_per_million : String,
	@SerializedName("hosp_patients") val hosp_patients : String,
	@SerializedName("hosp_patients_per_million") val hosp_patients_per_million : String,
	@SerializedName("weekly_icu_admissions") val weekly_icu_admissions : String,
	@SerializedName("weekly_icu_admissions_per_million") val weekly_icu_admissions_per_million : String,
	@SerializedName("weekly_hosp_admissions") val weekly_hosp_admissions : String,
	@SerializedName("weekly_hosp_admissions_per_million") val weekly_hosp_admissions_per_million : String,
	@SerializedName("new_tests") val new_tests : String,
	@SerializedName("total_tests") val total_tests : String,
	@SerializedName("total_tests_per_thousand") val total_tests_per_thousand : String,
	@SerializedName("new_tests_per_thousand") val new_tests_per_thousand : String,
	@SerializedName("new_tests_smoothed") val new_tests_smoothed : String,
	@SerializedName("new_tests_smoothed_per_thousand") val new_tests_smoothed_per_thousand : String,
	@SerializedName("positive_rate") val positive_rate : String,
	@SerializedName("tests_per_case") val tests_per_case : String,
	@SerializedName("tests_units") val tests_units : String,
	@SerializedName("total_vaccinations") val total_vaccinations : Int,
	@SerializedName("people_vaccinated") val people_vaccinated : Int,
	@SerializedName("people_fully_vaccinated") val people_fully_vaccinated : Int,
	@SerializedName("total_boosters") val total_boosters : Int,
	@SerializedName("new_vaccinations") val new_vaccinations : Int,
	@SerializedName("new_vaccinations_smoothed") val new_vaccinations_smoothed : Int,
	@SerializedName("total_vaccinations_per_hundred") val total_vaccinations_per_hundred : Double,
	@SerializedName("people_vaccinated_per_hundred") val people_vaccinated_per_hundred : Double,
	@SerializedName("people_fully_vaccinated_per_hundred") val people_fully_vaccinated_per_hundred : Double,
	@SerializedName("total_boosters_per_hundred") val total_boosters_per_hundred : Double,
	@SerializedName("new_vaccinations_smoothed_per_million") val new_vaccinations_smoothed_per_million : Int,
	@SerializedName("new_people_vaccinated_smoothed") val new_people_vaccinated_smoothed : Int,
	@SerializedName("new_people_vaccinated_smoothed_per_hundred") val new_people_vaccinated_smoothed_per_hundred : Double,
	@SerializedName("stringency_index") val stringency_index : Double,
	@SerializedName("population") val population : Int,
	@SerializedName("population_density") val population_density : Double,
	@SerializedName("median_age") val median_age : Double,
	@SerializedName("aged_65_older") val aged_65_older : Double,
	@SerializedName("aged_70_older") val aged_70_older : Double,
	@SerializedName("gdp_per_capita") val gdp_per_capita : Double,
	@SerializedName("extreme_poverty") val extreme_poverty : Double,
	@SerializedName("cardiovasc_death_rate") val cardiovasc_death_rate : Double,
	@SerializedName("diabetes_prevalence") val diabetes_prevalence : Double,
	@SerializedName("female_smokers") val female_smokers : Double,
	@SerializedName("male_smokers") val male_smokers : Double,
	@SerializedName("handwashing_facilities") val handwashing_facilities : Double,
	@SerializedName("hospital_beds_per_thousand") val hospital_beds_per_thousand : Double,
	@SerializedName("life_expectancy") val life_expectancy : Double,
	@SerializedName("human_development_index") val human_development_index : Double,
	@SerializedName("excess_mortality_cumulative_absolute") val excess_mortality_cumulative_absolute : String,
	@SerializedName("excess_mortality_cumulative") val excess_mortality_cumulative : String,
	@SerializedName("excess_mortality") val excess_mortality : String,
	@SerializedName("excess_mortality_cumulative_per_million") val excess_mortality_cumulative_per_million : String
)