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

//
//fun main(){
//    val immutableSet: Set<String> = setOf("this", "is", "set")
//    val mutableSet: MutableSet<String> = mutableSetOf("this", "is", "mutable", "set")
//    println(immutableSet.count())
//    println("this" in immutableSet)
//    mutableSet.add("last element")
//    mutableSet.remove("this")
//    println("${immutableSet.first()}")
//    println("${immutableSet.last()}")
//}

/**
 * Topic: Collections -> Map
 * Map stores items: stores items in key-value pairs, by using key we can access elements
 * key should be unique.
 * Types of Map:
 *          immutable map: val a: Map<Key, Value> = mapOf(key to value)
 *          mutabel map: val a: MutableMap<key, value> = mutableMapOf(key to value)
 * accessing map items: a["key"]
 * !!! If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value
 * adding elements: a["key"] = value
 * removing elements: a.remove("key")
 * number of items in the map: a.count()
 * To check if a specific key is already included in a map: a.containsKey("key")
 * To obtain a collection of the keys or values of a map : a.keys & a.values
 *
 * */

//fun main(){
//    val immutableMap: Map<String, Int> = mapOf("one" to 1, "two" to 2) //{one=1, two=2}
//    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
//
//    println(immutableMap["one"])
//    mutableMap["three"] = 3//{one=1, two=2, three=3}
//    mutableMap.remove("three")//{one=1, two=2}
//    println(immutableMap.containsKey("one"))//true
//}

/**
 * Conditional statements
 * Topic: if
 * !!! if we have more than 2 conditions it is recommended to use "when"*/

//fun main(){
//    var a = 10
//    a += 5
//
//    val answer = if(a == 10) 10 else 15
//    println(answer)
//    second()
//}
//
//fun second(){
//    var a = 10
//    a +=10
//
//    val answer = if(a == 10){
//        10
//    }else if(a == 20){
//        20
//    }else{
//        15
//    }
//    println(answer)
//}

/**
 * Use 'when' when you have a conditional expression with multiple branches.
 * To use when:
 * Place the value you want to evaluate within parentheses ().
 * Place the branches within curly braces {}.
 * Use -> in each branch to separate each check from the action to take if the check is successful.
 * when can be used either as a statement or as an expression. A statement doesn't return anything but performs actions instead.*/

//fun main(){
//    var a = 10
//    a += 10
//
//    when(a){
//        10 -> println(10)
//        20 -> println(20)
//        else -> println("nothing")
//    }
//    second()
//}
//fun second(){
//    var a = 10
//    a += 10
//
//    val answer = when{
//        a == 10 -> 10
//        a == 20 -> 20
//        else -> 0
//    }
//    println(answer)
//}

//topic: Ranges
//fun main(){
//    for(i in 1..4){
//        print(" "+i) //1 2 3 4
//    }
//
//    for(i in 1..<4){
//        print(i) // 1 2 3
//    }
//
//    for(i in 4 downTo 1){
//        print(i)// 4 3 2 1
//    }
//
//    for(i in 1..10 step 2){
//        print(i)// 1 3 5 7 9
//    }
//
//    for(i in 'a'..'d'){
//        print(i)// a b c d
//    }
//}

/**
 * Topic: Functions
 * -we can declare functions with 'fun' keyword
 * -we can have parameters of function inside ()
 * -each parameter should have data type
 * -we can give function return data type fun ():-> here
 * -function body will be inside {}
 * -if function doest not need to return, 'return' keyword can be omitted
 * */

//fun main(){
//    newFunc()
//    sum(2,2) //4
//}
//
//fun newFunc(){
//    println("new function")
//}
//
//fun sum(x: Int, y: Int): Int{
//    return x+y
//}
//------------------------------------------------------------------------------
//Topic: named arguments
//fun main(){
//    adder(secondNumber = 3, firstNumber = 8)
//    //first number: 8 and second number: 3
//}
//
//fun adder(firstNumber: Int, secondNumber: Int): String{
//    return "first number: ${firstNumber} and second number: ${secondNumber}"
//}
//-------------------------------------------------------------------------------

/**
 * Functions: Default parameter
 * -when we give default parameters to the parameters if caller gives another value
 * it overrides default value, otherwise function uses default value
 * */

//fun main(){
//    defaultParameter()
////    first number: 1
////    second number: 2
//    defaultParameter(3,4)
////    first number: 3
////    second number: 4
//}
//fun defaultParameter(firstNumber: Int = 1, secondNumber: Int = 2): String{
//    return "first number: ${firstNumber} \nsecond number: ${secondNumber}"
//}
//-------------------------------------------------------------------------------

/**
 * Functions: functions without return keyword
 * -if function does not return useful value then its value is Unit
 * -print function is Unit type, in this case we don't have to use 'return'*/
//fun main(){
//    functionWithoutReturn("Muhammad")
//}
//
//fun functionWithoutReturn(name: String){
//    println("Hello, ${name}")
//}
//-------------------------------------------------------------------------------

/**
 * Topic: Lambda expressions
 * -with lambda our code will be clean
 * -lambda function parameter come befor ->
 * -lambda function body comes after ->
 * */

//fun main(){
//    uppercaseString("hello")//HELLO
//}
//
//fun uppercaseString(word: String): String{
//    return word.uppercase()
//}

//same code but with lambda function
//fun main(){
//    val uppercaseString = {word: String-> word.uppercase()}
//    println(uppercaseString("hello"))//HELLO
//}

//-------------------------------------------------------------------------------
/**
 * Topic: pass lambda expression to another function
 * A great example of when it is useful to pass a lambda expression to a function, is using the .filter() function on collections:
 * The .filter() function accepts a lambda expression as a predicate:
 * { x -> x > 0 } takes each element of the list and returns only those that are positive.
 * { x -> x < 0 } takes each element of the list and returns only those that are negative.
 * This example demonstrates two ways of passing a lambda expression to a function:
 * For positive numbers, the example adds the lambda expression directly in the .filter() function.
 * For negative numbers, the example assigns the lambda expression to the isNegative variable. Then the isNegative variable is used as a function parameter in the
 * .filter() function. In this case, you have to specify the type of function parameters (x) in the lambda expression.
 *
 * Another good example, is using the .map() function to transform items in a collection
 * f.e: numbers.map({x:Int -> x*2})
 * */

//fun main(){
//    val numbers: List<Int> = listOf(-1,2,-3,4,-5,6,-7,8,-9)
//
//    val positiveNumbers = numbers.filter({x: Int-> x>0})//[2, 4, 6, 8]
//    val negativeNumbers = numbers.filter({x: Int-> x<0})//[-1, -3, -5, -7, -9]
//
//    println(positiveNumbers)
//    println(negativeNumbers)
//
//}
//-------------------------------------------------------------------------------

// lambda expression can be returned from function
//fun second(name: String): (Int) -> Int = when(name){
//    "hour" -> { value -> value *60*60 }
//    "minute" -> { value-> value*60 }
//    "second" -> { value-> value }
//    else -> {value -> value}
//}
//fun main(){
//    val l = listOf(1,2,3)
//    val minuteToSecond = second("minute")
//    val answer = l.map(minuteToSecond).sum()
//    println(answer)
//}
//-------------------------------------------------------------------------------
//Kotlin: Classes

//creating simple class, with properties

//class simpleClass(val age: Int, val name: String)
//
//fun main(){
//    val objectOfSimpleClass = simpleClass(21, "Muhammad")
//}

// creating instance of the class
//class simpleClass(val age: Int, val name: String){
//    val information : String = "name: $name, and age is: $age"
//}
//
//fun main(){
//    val instanceOfClass = simpleClass(7, "Jack")
//    println(instanceOfClass.information)
//}

// Access properties
//class simpleClass(var age: Int, val name: String)
//
//fun main(){
//    val instanceOfClass = simpleClass(2, "jane")
//    //prints value of property
//    println(instanceOfClass.name)
//
//    //updates value of property
//    instanceOfClass.age = 4
//
//    //prints new value of property
//    println(instanceOfClass.age)
//}

/**
 * Classes: Member functions
 * -member functions should be declared within class body, inside {}
 * -to call function, instaceOfClass.functionName()*/

//class simpleFunction(val age: Int, val Name: String){
//    fun getAge(){
//        println(age)
//    }
//}
//
//fun main(){
//    val instanceOfFunction = simpleFunction(3, "katya")
//    instanceOfFunction.getAge()
//}


//multiple constructors
class user{
    var id : Int = 0
    var name: String = " "

    constructor(id: Int){
        this.id = id
    }

    constructor(id: Int, name: String){
        this.id = id
        this.name = name
    }
}

fun main(){
    val a = user(1)
    val b = user(1, "jack")
}