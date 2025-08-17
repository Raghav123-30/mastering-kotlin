package basics

const val MAX_USERS = 100 // true compile time constant in contrast val is assigned once but can be known at run time


class User{
    lateinit var name: String; //non nullable and used when you'd like to initialize later

    fun initValue(name: String) {
        this.name=name
    }
}

fun main(){
    val pi = 3.14 // Can't be reassigned
    var counter = 0 //Inferred type as Int

    counter += 1
    println(counter)

    val age:Int = 24 // Explicit type declaration
    val name:String = "Raghavendra"

    val middleName: String? = null  // Allow nulls

    println(middleName?.length) // Safe calls to avoid null pointer exception

    val list = mutableListOf(5,6)
    list.add(7) // Reference cannot be reassigned but if object itself is mutable then we can change the data

   val x: Int;
    x = 100;  //It can be assigned this way after declaration but we have to explicitly define the type

    val raghav = User()
    raghav.initValue("Raghav") //Initialized later

    val config by lazy{
        println("Initialized")
        "Kotlin Config"
    } //Initialized when you access for first time

    println(config)  //Initialized

   println(MAX_USERS)

}