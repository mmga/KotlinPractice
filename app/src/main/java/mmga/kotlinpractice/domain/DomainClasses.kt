package mmga.kotlinpractice.domain

/**
 * Created by Think on 2017/7/24.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)