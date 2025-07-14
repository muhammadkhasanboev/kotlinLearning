//fun main(){
//    val numbers: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
//    println(numbers.count())
//    println(numbers.keys)
//    println(numbers.values)
//    numbers["three"] = 3
//    println(numbers)
//    numbers.remove("three")
//    println(numbers)
//
//}

//fun main(){
//    var customer = 10
//    customer -= 2
//
//    when(customer){
//        8->println("8 customers")
//        7->println("$customer customers")
//        else-> println("not worked")
//    }
//
//}

//fun main(){
//    val weekday = "Monday"
//
//    val workOrHoliday = when{
//        weekday == "Monday"->"work"
//        weekday == "Tuesday"->"work"
//        weekday == "Wednesday"->"work"
//        weekday == "Thursday"->"work"
//        weekday == "Friday"->"work"
//        else->"Holiday!!!"
//    }
//    println(workOrHoliday)
//}
//import kotlin.random.Random
//
//fun main(){
//    val a = Random.nextInt(6)
//    val b = Random.nextInt(6)
//
//    if(a==b){
//        println("draw")
//    }else{
//        println("b wins")
//    }
//}
//
//
//

fun main(){
    val Button = "B"

    val answer = when(Button){
        "A" -> "yes"
        "B"->"no"
        "X"->"menu"
        "Y"->"nothing"
        else->"there is no such button"
    }
    println(answer)
}






















