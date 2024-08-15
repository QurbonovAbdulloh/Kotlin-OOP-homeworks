package Task5

/*Quyidagi atributlarga ega bo’lgan Metro nomli class yarating: jo’nash bekati; oxirgi bekat; yo’lda yurish vaqti; liniya raqami.
  5 ta Metro toifasidagi elementdan iborat massiv tuzing.
  Yo’lda yurish vaqti berilgan vaqtdan katta bo’lmagan elementlarni ekranga chiqaring.*/

class Metro(
    val jonashBekati: String,
    val oxirgiBekat: String,
    val yurishVaqti: Int,  //daqiqada
    val liniyaRaqami: Int
)

fun main() {

    val metros = arrayOf(
        Metro("Marg'ilon", "Farg'ona", 50, 303),
        Metro("Kombinat", "Farg'ona", 35, 9),
        Metro("Yozyovon", "Farg'ona", 90, 314),
        Metro("Farg'ona", "Oxunboboyev Massiv", 25, 7)
    )

    val berilganVaqt = 45

    val qisqaVaqt = metros.filter { it.yurishVaqti < berilganVaqt }

    if (qisqaVaqt.isNotEmpty()) {
        println("Yo'lda yurish vaqti $berilganVaqt daqiqadandan katta bo'lmagan avtobuslar ro'yxati:")
        for (metros in qisqaVaqt) {
            println("Jo'nash bekati: ${metros.jonashBekati}, oxirgi bekat: ${metros.oxirgiBekat}, " +
                    "yurish vaqti: ${metros.yurishVaqti} daqiqa, liniya raqami: ${metros.liniyaRaqami}")
        }
    } else println("Mavjud emas!")
}