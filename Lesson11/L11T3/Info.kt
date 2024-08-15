package Task3

class Worker(
    val surname: String,
    val name: String,
    val age: Int,
    val position: String,
    val workYear: Int
)

fun main(args: Array<String>) {

    /*Quyidagi atributlari bor bo’lgan Worker nomli class yarating: familiya, ismi, yoshi, lavozimi, ishga kirgan yili.
      Yoshi berilgan sondan kata bo’lgan ishchilarni ekranga chiqaring.*/

    val workers = arrayOf(
        Worker("Qurbonov", "Abdulloh", 20, "Android dasturchi", 2024),
        Worker("Kenjaxo'jayev", "Nurulloxon", 20, "Android dasturchi", 2022),
        Worker("Naziraliyev", "Muhammad Amin", 27, "Biznesmen", 2019),
        Worker("Tursunov", "Rustam", 25, "Menejer", 2020)
    )

    val ageLimit = 22

    val olders = workers.filter { it.age > ageLimit }

    if (olders.isNotEmpty()) {
        println("Yoshi $ageLimit dan katta bo'lgan ishchilar: ")
        for (worker in olders) {
            println("${worker.surname}, ${worker.name}, ${worker.age}")
        }
    } else {
        println("Katta yoshdagi ishchilar mavjud emas!")
    }

}