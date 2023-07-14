fun main(args: Array<String>) {
   // конкатенация строк
    val greetings = "Здравствуйте"
    val space = ' '
    val userName = "Звездный лорд"
        // println(greetings + "," + userName + "!" + space + " Какой" + space + "будет ваш главный вопрос?")

    // интерполяция строк
  //  println("$greetings, $userName! Какой будет ваш главный вопрос?")
   // println("На который можно ответить ${40+2}")

    //многострочная запись
    val multiString = """
        |строка 1
            |строка 2
               |строка 3
    """.trimMargin() //форматируем по левому краю
    println(multiString)
}