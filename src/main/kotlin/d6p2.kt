import java.io.File
import java.math.BigInteger

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles

var dp = Array(9){Array(258) {0L} }
fun child(age : Int, days : Int) : Long{
    if (days - (age + 1) <= 0) return 1
    if (dp[age][days] != 0L) return dp[age][days]
    var a = child(8,days - (age + 1)) + child(6, days - (age + 1))
    dp[age][days] = a
    return a
}

fun main(){
    var file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\test.txt").readLines()
    var input = file[0].split(",").map { it.toInt() }
    var cnt : Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0)
    for (i in input){
        cnt[i]++
    }
    for (i in cnt) println(i)
    var a = 257
    var sol = 0L
    for (i in 0..8){
        println(i)
        if (cnt[i] == 0) continue
        sol = sol + cnt[i] * child(i,a)
    }
    println(sol)
//    var a = 257
//    val sol = 2 * child(3,a) + child(4,a) + child(1,a) + child(2,a)
//    println(sol)
}