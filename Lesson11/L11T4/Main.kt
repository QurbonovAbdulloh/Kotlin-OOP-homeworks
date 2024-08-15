package Task4

fun main() {

    val prices = arrayOf(
        Price("Telefon", "Elektronika do'koni", 1500.0),
        Price("Kompyuter", "Texnika do'koni", 2500.0),
        Price("Mebel", "Mebellar do'koni", 1000.0),
        Price("Ko'ylak", "Ko'ylak do'koni", 500.0),
        Price("Qimmatbaho soat", "Soatlar do'koni", 1200.0)
    )

    val engQimmatMahsulot = prices.maxByOrNull { it.mahsulotNarxi }

    if (engQimmatMahsulot != null) {
        println("""Eng qimmat mahsulot: ${engQimmatMahsulot.mahsulotNomi}
            |Do'kon nomi: ${engQimmatMahsulot.dokonNomi}
            |Narxi: ${engQimmatMahsulot.mahsulotNarxi}
        """.trimMargin())
    } else println("Mahsulotlar ro'yxati bo'sh!")

    /*Quyidagi atributlarga ega bo’lgan Price nomli class yarating:
      mahsulot nomi, mahsulot sotiladigan do'kon nomi, mahsulot narxi.
      Price toifasidagi 5 elementdan iborat massiv yarating.
      Elementlarni narxi bo’yicha eng qimmat mahsulot haqidagi ma’lumotni ekranga chiqaring.*/

   /* val price1 = Price()
    price1.name = "Shakar"
    price1.store = "Sum"
    price1.price = 15000

    val price2 = Price()
    price2.name = "Novvot"
    price2.store = "Kombinat"
    price2.price = 17000

    val price3 = Price()
    price3.name = "Oq qand"
    price3.store = "Trz"
    price3.price = 18000

    val price4 = Price()
    price4.name = ""
    price4.store = ""
    price4.price = 14000*/
}