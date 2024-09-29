//Project: Codecademy Mad Libs Project
//Purpose: Fun fill in the blanks story
//Author: Elisa Aldridge

fun main () {
  
    val costOfGas = 2.28
    val mileage = 25
    // Declare the variable distance below
      
    println("What's your name?")
    var name = readLine()
    // Write your code below
    println("Enter a friend's name:");
    var friendName = readLine()
  
    println("Enter an adjective:")
    var adjective = readLine()
  
    println("Enter a city:")
    var city = readLine()
  
    println("Enter a band name:")
    var bandName = readLine()
  
    println("What kind of job will you and $friendName do to save money?")
    var work = readLine()
  
    val distance : Int
    println("Please enter a number between 400 and 600:")
    distance = Integer.valueOf(readLine())
    //println(distance)
  
    var totalForGas = (costOfGas / mileage) * distance
    totalForGas = Math.round(totalForGas * 100) / 100.00
  
    val totalMoneySaved = totalForGas + 200
  
    print("""
      A long time ago, $name and their friend $friendName planned a(n) $adjective road trip to see their favorite band: $bandName. 
      The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.\n
      Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
      To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
      """.trimIndent())
  }