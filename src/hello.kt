fun main() {

    //no semicolons terminating the lines!!

    println("Hello Kotlin!")

    //mutable variable (can be reassigned)
    var ages = 28 //could also do var age: Int = 28 to explicitly set the type
    ages = 92
    //age = "hello" won't work because age was already set as an int


    //immutable variable (can't be reassigned)
    val pokemon = 151
    //pokemom = 152 won't work because val can't be reassigned

    //String
    var favCandy = "Hi-chew"

    //use $variable to fill in the string
    println("I have caught $pokemon Pokemon and fed them $favCandy!")

    /* ************Math Stuff************ */

    //anything with a decimal Kotlin defaults to be a double
    var weight = 188.6
    var radius = 6
    var pi = 3.14
    var c = radius * pi * 2 //this mix of ints and doubles will convert to be a double
    //if you wanted c to be an int instead, you'd have to specify that and convert pi
    //var c: Int = radius * pi.toInt() * 2
    println(c)

    //increment and decrement is pretty much the same too
    var wallet = 40
    wallet -= 5
    wallet += 10
    println(wallet)

    //challenge make a variable, age, set to your age, then add 40 to it, multiline comment what you'll be doing
    var age = 30
    age += 40;
    /*
    When I'm 70 I'll be a hella cool 70 year old rapper
     */


    /* ************If Statements and Boolean************ */

    //just set it to true or false!
    var isLegoAwesome = true //explicit is var isCool: Boolean = false


    //if is just like you think it is too!
    if (isLegoAwesome) {
        println("LEGO!") //sout still works too, woohoo!
    } else {
        println("Mega Bloks")
    }

    //challenge, make variable, name, make if statement to see if equal to "LEGO"
    var name = "Sherry"
    if(name == "LEGO") {
        println("Liar!")
    } else {
        println("hey, " + name)
    }


    /* ************Lists and Arrays************ */


}