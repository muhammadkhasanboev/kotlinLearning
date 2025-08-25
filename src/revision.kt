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

fun main(){
    val a = 1
    val b = 2
    val adder: (Int, Int) -> Int = {a,b -> a+b}
    println(adder(a,b)) //3
}