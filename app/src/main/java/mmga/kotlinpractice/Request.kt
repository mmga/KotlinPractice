package mmga.kotlinpractice

import java.net.URL

public class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
    }
}