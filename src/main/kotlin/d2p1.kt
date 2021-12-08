import java.io.File

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles

data class position(var forward : Int,var depth : Int)

fun main(){
    var a = position(0,0)
//    var directions : Map<String,Int>
    val file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\aoc2.txt")
    file.forEachLine { var b = it.split(" ")
                when (b[0]){
                    "forward" -> a.forward = a.forward + b[1].toInt()
                    "up" -> a.depth = a.depth - b[1].toInt()
                    "down" -> a.depth = a.depth + b[1].toInt()
                }
    }
    println(a.forward * a.depth)
}