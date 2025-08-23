package basics

fun greet(){
    println("Hello")
}

fun greetUser(name: String = "World"){ // This way you can give parameters the default values
  println("Hello $name")
}

//one line functions

fun add(a:Int,b:Int) = a+b;

//varargs aka variable arguments, it's like using spread operator in javascript
fun addAll(vararg numbers: Int): Int{
    return numbers.sum()
}

//inline ,anonymous functions

val multiply:(a:Int,b:Int) ->Int = {a,b -> a*b}


//higher order functions. Functions that take function as an argument
fun operateOnNumbers(a:Int,b:Int, operation:(a:Int,b:Int)->Int): Int{
    return operation(a, b)
}
//kotlin syntactical sugar
fun max(a:Int,b: Int) = if(a>b) a else b;

//extension function
fun String.shout() = "$this!!!";

fun main(){
    greet() // Returns Unit which is like void
    greetUser()
    greetUser(name = "Raghavendra")
    println(multiply(3,4))
   println(
       operateOnNumbers(4,5){x,y -> x+y}
   )
    println(max(4,5))

    println("Raghav".shout())
}