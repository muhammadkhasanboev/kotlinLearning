//fun main(){
//    println("Hello world")
//}

//fun main(){
//    //val is read only variable, we cannot reassign value
//    val readOnlyVariable = 1
//    //var is mutable variable, we can easily reassign new values
//    var mutableVariable = 1
//    mutableVariable = 2
//}

//fun main(){
//    /*Types in Kotlin:
//    * Byte, Short, Int, Long
//    * UByte, UShort, UInt, ULong -> unsigned integers
//    * Float, Double
//    * Boolean
//    * Char
//    * String
//    * */
//    val integerVariable: Int = 1
//    println("this is '$integerVariable' integer variable")
//}

//fun main(){
//    /*Collections: List
//    * -lists can be: read-only, mutable
//    * -to create read-only list: listOf()
//    * -to create mutable list: mutableListOf()
//    * -ordered, duplicate allowed*/
//
//    val readOnlyList = listOf("a", "b", "c")
//    println(readOnlyList)
//
//    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
//    mutableList.add("d")
//    println(mutableList)
//}

//fun main(){
//    /*Collections: Set
//    * -to create read-only set: setOf()
//    * -to create mutable set: mutableSetOf()
//    * -unordered, stores unique items*/
//    val readOnlySet = setOf("a", "a", "b", "c")
//    println(readOnlySet)  //[a, b, c]
//
//    val mutableSet: MutableSet<String> = mutableSetOf("a", "b", "b", "c")
//    mutableSet.remove("c")
//    println(mutableSet) //[a, b]
//}

//fun main(){
//    /*Collections: Map
//    * -map needs value and key to store items
//    * -to create read-only map: mapOf()
//    * -to create mutable map: mutableMapOf()
//    * -maps access items by their key values
//    * -we can have duplicate values, but not duplicate keys*/
//
//    val readOnlyMap = mapOf("a" to 1, "b" to 2, "c" to 3)
//    println(readOnlyMap) //{a=1, b=2, c=3}
//    println(readOnlyMap["a"]) //1
//
//    val mutableMap: MutableMap<String, Int> = mutableMapOf("a" to 1, "b" to 2)
//    println(mutableMap) //{a=1, b=2}
//    mutableMap["c"] = 3
//    println(mutableMap) //{a=1, b=2, c=3}
//}

//fun main(){
//    //conditional expressions: If
//    var a: Int = 1
//    a++
//    a/=2
//    a+=2
//
//    if(a == 2){
//        println("2")
//    } else {
//        println("it was $a")
//    }
//}

//fun main(){
//    //conditional expression: when
//    var a = 2
//    a += 2
//    a /= 2
//    when(a){
//        1 -> println("1")
//        2 -> println("2")
//        else -> println("it was $a")
//    }
//}

//fun main(){
//    //creating our own functions
//    val a = 1
//    val b = 2
//    val answer = myFunction(a,b)
//    println(answer) //3
//}
//
//fun myFunction(a: Int, b: Int): Int{
//    return a+b
//}

//fun main(){
//    val a = 1
//    val b = 2
//    val adder: (Int, Int) -> Int = {a,b -> a+b}
//    println(adder(a,b)) //3
//}

//class Example(val name: String, val age: Int){
//    fun PrintAllInfo(){
//        println("User name: $name, \nUser age: $age")
//    }
//}
//
//fun main(){
//    val user1 = Example("John", 21)
//    user1.PrintAllInfo()
//}

//data class User(val name: String, val id: Int)
//
//fun main(){
//    val user = User("Alex", 777)
//    println(user) // User(name=Alex, id=777)
//    val user2 = user.copy()
//    println(user2)
//}

//fun main(){
//    var neverNull: String = "this cant be null"
//    //neverNull = null is impossible
//    var nullPossible: String? = "You can keep null value"
//    nullPossible = null
//
//    //by default variables can not be nullable
//    var defaultVariable = "You can not assing null value"
//    //defaultVariable = null -> impossible
//    println(neverNull.length)
//    //println(nullPossible.length) ->throws compiler error
//
//}


//fun userInputCheck(login: String?, password: String?): String{
//    if(login!=null && login.length>0){
//        if(password!=null && password.length>=8){
//            return "Welcome"
//        }else{
//        return "Password should contain at least 8 characters"
//        }
//    }else{
//        return "login is invalid"
//    }
//
//}
//fun main(){
//    val login_1: String? = null
//    val login_2: String? = "Alex"
//    val login_3: String? = "example"
//
//    val password_1: String? = "12345678"
//    val password_2: String? = "1111111"
//    val password_3: String? = "example123"
//
//    println(userInputCheck(login_1, password_1))
//    println(userInputCheck(login_2, password_2))
//    println(userInputCheck(login_3, password_3))
//}

//fun main(){
//    print("enter the value: ")
//    val a = readln()
//    println(a)
//}

open class A(val name: String){
    open fun info(): String{
        return "name is: $name"
    }
}

class B(val id: Int, name: String): A(name){
    override fun info(): String{
        return "username: $name\nuser Id: $id"
    }
}

fun main(){
    val example = B(3, "Whoever")
    println(example.info())
}























