package com.farasatnovruzov.retrofitkotlin.model1

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Aze {

    @SerializedName("continent")
    @Expose
    var continent: String? = null

    @SerializedName("location")
    @Expose
    var location: String? = null

    @SerializedName("last_updated_date")
    @Expose
    var lastUpdatedDate: String? = null

    @SerializedName("total_cases")
    @Expose
    var totalCases: Int? = null

    @SerializedName("new_cases")
    @Expose
    var newCases: Int? = null

    @SerializedName("new_cases_smoothed")
    @Expose
    var newCasesSmoothed: Float? = null

    @SerializedName("total_deaths")
    @Expose
    var totalDeaths: Int? = null

    @SerializedName("new_deaths")
    @Expose
    var newDeaths: Int? = null

    @SerializedName("new_deaths_smoothed")
    @Expose
    var newDeathsSmoothed: Float? = null

    @SerializedName("total_cases_per_million")
    @Expose
    var totalCasesPerMillion: Float? = null

    @SerializedName("new_cases_per_million")
    @Expose
    var newCasesPerMillion: Float? = null

    @SerializedName("new_cases_smoothed_per_million")
    @Expose
    var newCasesSmoothedPerMillion: Float? = null

    @SerializedName("total_deaths_per_million")
    @Expose
    var totalDeathsPerMillion: Float? = null

    @SerializedName("new_deaths_per_million")
    @Expose
    var newDeathsPerMillion: Float? = null

    @SerializedName("new_deaths_smoothed_per_million")
    @Expose
    var newDeathsSmoothedPerMillion: Float? = null

    @SerializedName("reproduction_rate")
    @Expose
    var reproductionRate: Float? = null

    @SerializedName("icu_patients")
    @Expose
    var icuPatients: Any? = null

    @SerializedName("icu_patients_per_million")
    @Expose
    var icuPatientsPerMillion: Any? = null

    @SerializedName("hosp_patients")
    @Expose
    var hospPatients: Any? = null

    @SerializedName("hosp_patients_per_million")
    @Expose
    var hospPatientsPerMillion: Any? = null

    @SerializedName("weekly_icu_admissions")
    @Expose
    var weeklyIcuAdmissions: Any? = null

    @SerializedName("weekly_icu_admissions_per_million")
    @Expose
    var weeklyIcuAdmissionsPerMillion: Any? = null

    @SerializedName("weekly_hosp_admissions")
    @Expose
    var weeklyHospAdmissions: Any? = null

    @SerializedName("weekly_hosp_admissions_per_million")
    @Expose
    var weeklyHospAdmissionsPerMillion: Any? = null

    @SerializedName("new_tests")
    @Expose
    var newTests: Int? = null

    @SerializedName("total_tests")
    @Expose
    var totalTests: Int? = null

    @SerializedName("total_tests_per_thousand")
    @Expose
    var totalTestsPerThousand: Float? = null

    @SerializedName("new_tests_per_thousand")
    @Expose
    var newTestsPerThousand: Float? = null

    @SerializedName("new_tests_smoothed")
    @Expose
    var newTestsSmoothed: Int? = null

    @SerializedName("new_tests_smoothed_per_thousand")
    @Expose
    var newTestsSmoothedPerThousand: Float? = null

    @SerializedName("positive_rate")
    @Expose
    var positiveRate: Float? = null

    @SerializedName("tests_per_case")
    @Expose
    var testsPerCase: Float? = null

    @SerializedName("tests_units")
    @Expose
    var testsUnits: String? = null

    @SerializedName("total_vaccinations")
    @Expose
    var totalVaccinations: Int? = null

    @SerializedName("people_vaccinated")
    @Expose
    var peopleVaccinated: Int? = null

    @SerializedName("people_fully_vaccinated")
    @Expose
    var peopleFullyVaccinated: Int? = null

    @SerializedName("total_boosters")
    @Expose
    var totalBoosters: Int? = null

    @SerializedName("new_vaccinations")
    @Expose
    var newVaccinations: Int? = null

    @SerializedName("new_vaccinations_smoothed")
    @Expose
    var newVaccinationsSmoothed: Int? = null

    @SerializedName("total_vaccinations_per_hundred")
    @Expose
    var totalVaccinationsPerHundred: Float? = null

    @SerializedName("people_vaccinated_per_hundred")
    @Expose
    var peopleVaccinatedPerHundred: Float? = null

    @SerializedName("people_fully_vaccinated_per_hundred")
    @Expose
    var peopleFullyVaccinatedPerHundred: Float? = null

    @SerializedName("total_boosters_per_hundred")
    @Expose
    var totalBoostersPerHundred: Float? = null

    @SerializedName("new_vaccinations_smoothed_per_million")
    @Expose
    var newVaccinationsSmoothedPerMillion: Int? = null

    @SerializedName("new_people_vaccinated_smoothed")
    @Expose
    var newPeopleVaccinatedSmoothed: Int? = null

    @SerializedName("new_people_vaccinated_smoothed_per_hundred")
    @Expose
    var newPeopleVaccinatedSmoothedPerHundred: Float? = null

    @SerializedName("stringency_index")
    @Expose
    var stringencyIndex: Float? = null

    @SerializedName("population")
    @Expose
    var population: Int? = null

    @SerializedName("population_density")
    @Expose
    var populationDensity: Float? = null

    @SerializedName("median_age")
    @Expose
    var medianAge: Float? = null

    @SerializedName("aged_65_older")
    @Expose
    var aged65Older: Float? = null

    @SerializedName("aged_70_older")
    @Expose
    var aged70Older: Float? = null

    @SerializedName("gdp_per_capita")
    @Expose
    var gdpPerCapita: Float? = null

    @SerializedName("extreme_poverty")
    @Expose
    var extremePoverty: Any? = null

    @SerializedName("cardiovasc_death_rate")
    @Expose
    var cardiovascDeathRate: Float? = null

    @SerializedName("diabetes_prevalence")
    @Expose
    var diabetesPrevalence: Float? = null

    @SerializedName("female_smokers")
    @Expose
    var femaleSmokers: Float? = null

    @SerializedName("male_smokers")
    @Expose
    var maleSmokers: Float? = null

    @SerializedName("handwashing_facilities")
    @Expose
    var handwashingFacilities: Float? = null

    @SerializedName("hospital_beds_per_thousand")
    @Expose
    var hospitalBedsPerThousand: Float? = null

    @SerializedName("life_expectancy")
    @Expose
    var lifeExpectancy: Int? = null

    @SerializedName("human_development_index")
    @Expose
    var humanDevelopmentIndex: Float? = null

    @SerializedName("excess_mortality_cumulative_absolute")
    @Expose
    var excessMortalityCumulativeAbsolute: Any? = null

    @SerializedName("excess_mortality_cumulative")
    @Expose
    var excessMortalityCumulative: Any? = null

    @SerializedName("excess_mortality")
    @Expose
    var excessMortality: Any? = null

    @SerializedName("excess_mortality_cumulative_per_million")
    @Expose
    var excessMortalityCumulativePerMillion: Any? = null
}