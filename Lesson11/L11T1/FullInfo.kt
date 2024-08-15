package Task1

fun main(args: Array<String>) {

    /*Rasmdagi obyekt ma'lumotlari orqali class yarating.*/

    val info = Info()
    val address = Info.Address()
    val geo = Info.Address.Geo()
    val company = Info.Company()

    println("""ID ${info.id}
        |Name: ${info.name}
        |Username: ${info.username}
        |Email: ${info.email}
        |
        |Address: 
        |Street: ${address.street}
        |Suite: ${address.suite}
        |City: ${address.city}
        |Zipcode: ${address.zipcode}
        |
        |Geo:
        |Lat: ${geo.lat}
        |Lng: ${geo.lng}
        |
        |Phone: ${info.phone}
        |Website: ${info.website}
        |
        |Company:
        |Name: ${company.name}
        |CatchPhrase: ${company.bs}
        |Bs: ${company.catchPhrase}
    """.trimMargin())
}