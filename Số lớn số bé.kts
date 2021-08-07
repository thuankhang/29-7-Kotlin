var sum: Int = 0
var different: Int = 0
var a: Int = 0
var b: Int = 0
var big: Int = 0
var small: Int = 0

print("Write a:")
a = readLine()!!.toInt()
print("Write b:")
b = readLine()!!.toInt()
sum = a + b
different = Math.abs(a - b)
big = (sum + different)/2
small = (sum - different)/2
println("The bigger number is: $big")
println("The smaller number is: $small")
