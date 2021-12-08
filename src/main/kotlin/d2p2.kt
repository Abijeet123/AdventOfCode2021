import java.io.File

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles


data class A(var forward : Long = 0, var depth : Long = 0, var aim : Long = 0)
fun main(){
    var a = A()
    val file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\aoc2.txt")
    file.forEachLine { var b = it.split(" ")
        when (b[0]){
            "forward" -> {
                a.forward = a.forward + b[1].toLong()
                a.depth = a.depth + a.aim * b[1].toLong()
            }
            "up" -> {
                a.aim = a.aim - b[1].toLong()
            }
            "down" -> a.aim = a.aim + b[1].toLong()
        }
//        println("${a.forward} ${a.depth} ${a.aim}")
    }
    println(a.forward * a.depth)
}