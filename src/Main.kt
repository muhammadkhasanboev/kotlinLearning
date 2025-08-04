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

//fun main(){
//    val Button = "B"
//
//    val answer = when(Button){
//        "A" -> "yes"
//        "B"->"no"
//        "X"->"menu"
//        "Y"->"nothing"
//        else->"there is no such button"
//    }
//    println(answer)
//}

//loops

//fun main(){
//    for(i in 1..5){
//        print(i+1)
//    }
//}

//fun main(){
//    val vegetables = listOf("carrot", "potato", "tomato")
//
//    for(i in vegetables){
//        println("there is no $i")
//    }
//}
//
//
//fun main(){
//    var count = 0
//   do{
//       count++
//       print(count)
//   }while (count<10)
//}

//fizz buzz game
/*
divisible by 3-->fizz
divisible by 5-->buzz
divisible by 3 and 5 --> fizbuzz
 */

//fun main(){
//    for(i in 1..100){
//        when {
//            i%15==0 -> println("fizzbuzz")
//            i%3==0 -> println("fizz")
//            i%5==0 -> println("buzz")
//            else -> println("number is $i")
//        }
//    }
//}
//

//fun hello(){
//    return println("hello")
//}
//fun main(){
//    hello()
//}


//example for functions

//fun adder(a : Int, b : Int): Int{
//    return a+b
//}
//
//fun main(){
//    println(adder(1,2))
//}

/*
* example: named arguments
* you can use variable names in function parameter when calling function
* whether sequence is not same but with parameter names everything works fine
* */
//fun logMessage(log: String, Message: String="hello"){
//    return println("log is $log, message: $Message")
//}
//fun main(){
//    logMessage(Message="Hello world", log="nothing")
//    logMessage(log="info")
//}


//using single-expression function
//fun sum(a: Int, b: Int)=a+b
//
//fun main(){
//    println(sum(2,2))
//}


//simple exercise:

//val registeredUser : MutableList<String> = mutableListOf("Example", "Example2")
//val registeredEmails : MutableList<String> = mutableListOf("example@gmail.com", "example2@gmail.com")
//
//fun register(username: String, gmail: String): String{
//    if(username in registeredUser){
//       return "This username already taken"
//    }
//    if(gmail in registeredEmails){
//      return  "this E-mail already taken"
//    }
//    registeredUser.add(username)
//    registeredEmails.add(gmail)
//    return "User registered successfully"
//}
//
//fun main(){
//    println(register("Example", "example@gmail.com"))
//    println(register("example3","example3@gmail.com"))
//    println(registeredUser.count())
//}


//EXERCISE: write function that takes radius of circle and calculates the area of that circle
//import kotlin.math.*
//fun areaCalculator(radius: Int): Double = PI*radius*radius
//
//fun main(){
//    println(areaCalculator(radius=2))
//}

//fun main(){
//    val touppercase = {text:String -> text.uppercase()}
//    print(touppercase("hello"))
//}

//fun main(){
//    //given list
//    val numbers = listOf(-1,3,-3,5,3,2-1,0)
//    //filter() can be great example for passing lambda to another function
//    val positive = numbers.filter({x->x>=0})
//    println("posivite numbers: $positive")
//    //filter() can be great example for passing lambda to another function
//    val isNegative = {x:Int-> x<0}
//    val negative = numbers.filter(isNegative)
//    println("negative numbers: $negative")
//}
//
//fun main(){
//    val numbers = listOf(1,2,3,4,5,6,7,8,9)
//    //changes numbers to negative
//    val changeToNegative = numbers.map{x->x*(-1)}
//    println(changeToNegative) //[-1, -2, -3, -4, -5, -6, -7, -8, -9]
//    //multiplies numbers by 2
//    val doubleAmount = numbers.map{x->x*2}
//    println(doubleAmount)//[2, 4, 6, 8, 10, 12, 14, 16, 18]
//    //filters even numbers
//    val even = numbers.filter{x->x%2==0}
//    println(even)//[2, 4, 6, 8]
//}

/**
 * Topic: Collections-> List
 * List stores items in order that they are added
 * we have two kind of lists: immutable and mutable
 * despite the we declared the list with 'var' keyword
 * we can not add or remove list items if it is immutable
 * Immutable list: val a : List<Data type> = listOf(..)
 * Mutable list: val a : MutableList<Data type> = mutableListOf(..)
 * Length of the list: a.count()
 * first and last item of the list: a.first(), a.last()
 * add and remove functions: a.add(..), a.remove(..)
 * accessing list items: a[0], a[1]
 * */

//fun main(){
//    val immutableList : List<String> = listOf("this", "is", "immutable","list")
//    println(immutableList)
//
//    val mutableList: MutableList<String> = mutableListOf("this", "is", "mutable","list")
//    println(mutableList)
//
//    println("this is first element of immutable list: ${immutableList[0]}")
//    println("these are first and last element of immutable list: ${immutableList.first()} ${immutableList.last()}")
//    println("this is length of immutable list: ${immutableList.count()}")
//    println("this" in immutableList)
//
//    mutableList.add("added word")
//    println(mutableList)
//    mutableList.removeLast()
//    //last item in the list removed
//}
//
/**
 * Topic: Collections -> Set
 * Set stores item: unordered, stores only unique items
 * types of Set:
 *      Immutable set: val a: Set<Data type> = setOf(..)
 *      Mutable set: val a: MutableSet<Data type> = mutableSetOf(elements)
 * number of item in the set: a.count()
 * checking availability: 'element name' in a
 * add and remove: a.add(), a.remove()
 * we cannot access elements: a[0] X
 */

fun main(){
    val immutableSet: Set<String> = setOf("this", "is", "set")
    val mutableSet: MutableSet<String> = mutableSetOf("this", "is", "mutable", "set")
    println(immutableSet.count())
    println("this" in immutableSet)
    mutableSet.add("last element")
    mutableSet.remove("this")
    println("${immutableSet.first()}")
    println("${immutableSet.last()}")
}

