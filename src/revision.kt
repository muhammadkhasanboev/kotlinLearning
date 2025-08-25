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

fun main(){
    /*Collections: List
    * -lists can be: read-only, mutable
    * -to create read-only list: listOf()
    * -to create mutable list: mutableListOf()
    * -unordered, duplicate allowed*/

    val readOnlyList = listOf("a", "b", "c")
    println(readOnlyList)

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    mutableList.add("d")
    println(mutableList)
}