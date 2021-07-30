var year: Int = 0
    print("Write your birth year: ")
    year = readLine()!!.toInt()
    while (year >= 2021) {
            print("Write your birth year again: ")
            year = readLine()!!.toInt()
    }
    val age: Int = 2021 - year
    println("You are $age years old")
    val graduate: Int = 24 - age
    println("You will graduate in $graduate years")
