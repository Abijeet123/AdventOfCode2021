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
    var input = "C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\aoc1.txt"
    val f = File(input)
    var a : MutableList<Int> = mutableListOf()
    var pref : MutableList<Int> = mutableListOf()
    f.forEachLine { a.add(it.toInt()) }
    pref.add(a[0])
    for (i in 1 until a.size){
        pref.add(a[i] + pref[i - 1])
    }
    var sol = 0
    if (pref[3] - pref[0] > pref[2]) sol++
    for (i in 4 until a.size){
        if (pref[i] - pref[i - 3] > pref[i - 1] - pref[i - 4]) sol++
    }
    println(sol)
}