var diemmieng: Double = 0.1
var diem15phut: Double = 0.1
var diem1tiet: Double = 0.1
var diemhk: Double = 0.1

print("Điền điểm miệng: ")
diemmieng = readLine()!!.toDouble()
while (diemmieng > 10 && diemmieng < 0 ) {
    print("Điền lại điểm miệng: ")
    diemmieng = readLine()!!.toDouble()
}
print("Điền điểm 15 phút: ")
diem15phut = readLine()!!.toDouble()
while (diem15phut > 10 && diem15phut < 0 ) {
    print("Điền lại điểm 15 phút: ")
    diem15phut = readLine()!!.toDouble()
}
print("Điền điểm 1 tiết: ")
diem1tiet = readLine()!!.toDouble()
while (diem1tiet > 10 && diem1tiet < 0 ) {
    print("Điền lại điểm 1 tiết: ")
    diem1tiet = readLine()!!.toDouble()
}
print("Điền điểm hk: ")
diemhk = readLine()!!.toDouble()
while (diemhk > 10 && diemhk < 0) {
    print("Điền lại điểm hk: ")
    diemhk = readLine()!!.toDouble()
}
val diemtb = (diemmieng + diem15phut + diem1tiet *2 + diemhk * 3)/7
println("Điểm trung bình của bạn là: $diemtb")

if (diemtb >= 8){ print("Bạn được HSG") }
else if (6.5 <= diemtb) { print("Bạn được HSK")}
else print("...")
