fun main(args: Array<String>) {
    //логические операторы
    // операторы сравнения

    //<, >, <=, >=, ==, !=
    // true (истина)
    //false (ложь)

    // ===, !== (операторы ссылочного сравнения)
    // &&. ||, ! (логические операторы)

   // val firstInt = 5
    //val secondInt = 5


    //Сравнение примитивов.В случае примитивных типов данных сравниваются содержащиеся в них значения.
    //println(firstInt == secondInt)  // true
    //println(firstInt === secondInt) // true
    //println(firstInt.equals(secondInt)) // true

    //Сравнение примитивов в обертке
//    val firstInt = Integer(5)
//    val secondInt = Integer(5)
//    println(firstInt == secondInt)  // true
//    println(firstInt === secondInt) // false
//    println(firstInt.equals(secondInt)) // true

    //Сравнение отрицательного и положительного нуля
//    val negativeZero = -0.0f
//    val positiveZero = 0.0f

//    println(negativeZero == positiveZero) // true
//    println(negativeZero.equals("Сравнение отрицательного и положительного нуля:$positiveZero")) // false


    // сравнение возраста пользователя
    val userAge = 44
    //val comparisonReslt = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
    //val comparisonResult = userAge >= (AGE_OF_MAJORITY) && !(userAge <= RETIREMENT_AGE) // конечный результат будет true если возраст пользователя больше или равен совершеннолетию и если возраст пользователя не больше или равен пенсионного возраста
    val comparisonResult = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE // Результат будет true когда userAge будет в промежутке от 18 до 65
    println("Результат проверки возраста пользователя: $comparisonResult")

//    println(0 < -1)
//    println(1 == 1)
//    println(2 == 3)
//    println(7 != 8)

val  a = true
val b = !a
println(b)
}


const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65