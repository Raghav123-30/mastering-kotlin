package basics

//Control flow using `when` , its like advanced switch

fun describe(obj: Any):String =
    when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long number"
        !is String -> "Not a string"
        else -> "Something else"
    }

fun compare(oldSales: Double, newSales:Double): String =
    when{
        oldSales !in 0.0 ..100.0 || newSales !in 0.0 .. 100.0 -> "Invalid input"
        oldSales == newSales -> "Sales were same as last year"
        oldSales > newSales -> "Old sales were greater than this year"
        oldSales < newSales -> "New sales are greater than last year"
        else -> "Unknown case"
    }



fun main(){
    println(describe(5))
    val x= 5;
    val y = 6;

    if(x>y){
        println(x)
    }else{
        println(y)
    }

    println(compare(55.0, 67.0))
    println(compare(-1.0,-900.0))

}