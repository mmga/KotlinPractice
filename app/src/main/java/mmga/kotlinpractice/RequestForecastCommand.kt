package mmga.kotlinpractice

import mmga.kotlinpractice.domain.ForecastDataMapper
import mmga.kotlinpractice.domain.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}