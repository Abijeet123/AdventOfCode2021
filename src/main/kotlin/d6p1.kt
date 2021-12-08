import java.io.File

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles


fun main(){
    var file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\test.txt").readLines()
//    var input = file.map { it.toInt() }
    println(file.size)
    var input = file[0].split(",").map { it.toBigInteger() }
    var a = input as MutableList<Int>
    for (i in 1..80){
        println(a.size)
        var newChild = 0
        for (index in 0 until a.size){
            if (a[index] == 0){
                a[index] = 6
                newChild++
            }else{
                a[index] = a[index] - 1
            }
        }
        for (index in 0 until newChild) a.add(8)
    }
    println(a.size)
}