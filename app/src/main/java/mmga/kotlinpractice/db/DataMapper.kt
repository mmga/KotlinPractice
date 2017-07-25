package mmga.kotlinpractice.db

import mmga.kotlinpractice.domain.ForecastList

class DataMapper {
    fun convertToDomain(forecast: CityForecast) = with(forecast) {
        val daily = dailyForecast.map { convertDayToDomain(it) }
        CityForecast(_id, city, country, daily)
    }

    private fun convertDayToDomain(dayForecast: DayForecast) = with(dayForecast) {
        DayForecast(date, description, high, low, iconUrl, cityId)
    }

    fun convertFromDomain(forecast: ForecastList) = with(forecast) {
        val daily = dailyForecast.map { convertDayFromDomain(id, it) }
        CityForecast(id, city, country, daily)
    }

    private fun convertDayFromDomain(cityId: Long, forecast: DayForecast) =
            with(forecast) {
                DayForecast(date, description, high, low, iconUrl, cityId)
            }
}