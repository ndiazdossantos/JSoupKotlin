import org.jsoup.Jsoup
//importamos lo necesario


object ElTiempo {
    val doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    val titulo = doc.title()
    val miElemento = doc.getElementsByClass("today_nowcard-temp")
    val miTexto = miElemento.text()
    val miElemento1 = doc.getElementsByClass("today_nowcard-phrase")
    val miTexto1 = miElemento1.text()

}