package intermediate


fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    println(numbers)

    //Just like javascript map operation, you can create new list in kotlin by manipulating items of existing list
    val doubledNumbers = numbers.map { it -> it*2 }
    println(doubledNumbers)

    //We can filter the list
    val evenNumbers = numbers.filter { it%2 == 0 }
    println(evenNumbers)

    //We can reduce the items in list to one result
    val sum = numbers.reduce { it,acc -> acc+it }
    println(sum)

    //we can provide different initial value
    val result = numbers.fold(10){it,acc -> acc + it}
    println(result)

    //maps
    val students = listOf<Map<String, String>>(
        mapOf("Raghavendra" to "100"),
        mapOf("Samant" to "101"),
        mapOf("Puneet" to "102"),
        mapOf("Anirudh" to "103")
    )
    println(students)

    //Set keeps only unique items in the collection
    val friends = setOf("Raghav","Samant","Puneet","Samant")
    println(friends)
}