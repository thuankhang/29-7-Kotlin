var year: Int = 0
var month: Int = 0
var m: Int = 0
var y: Int = 0
var y1: Int = 0
var y2: Int = 0
print("Write month: ")
month = readLine()!!.toInt()
print("Write year: ")
year = readLine()!!.toInt()
if (month != 2) {
    if (month < 8){
        m = month % 2
        if (m == 1){
            print("31 days")
        }
        else print("30 days")
    }
    else{
        m = month % 2
        if (m == 1){
            print("30 days")
        }
        else print("31 days")
    }
}
else{
    y = year % 4
    y1 = year % 100
    y2 = year % 400
    if (y == 0 ){
        if (y1 == 0){
            if (y2 == 0) print("29 days")
            else print("28 days")
        }
        else print("29 days")
    }
    else print("28 days")
}