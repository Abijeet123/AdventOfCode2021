import java.io.File

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles

fun toDecimal(string : String) : Int{
    var b = string.length - 1
    var ret = 0
    for (i in string){
        ret = ret + (1 shl b) * i.toString().toInt()
//        println("$ret ${1 shl b} ${i.toInt()}")
        b--
    }
    return ret
}

data class cnt(var zeroes : Int = 0, var ones : Int = 0)

fun main(){
    var file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\aoc3.txt")
    var count = List<cnt>(12){cnt()}

    file.forEachLine {
            var index = 0
            for (i in it){
                when(i.toString()){
                    "1" -> count[index].ones++
                    "0" -> count[index].zeroes++
                }
                index++
            }
        }
//    for (i in count){
//        println("${i.ones} ${i.zeroes}")
//    }
    var gamma : String = ""
    var epsilon : String = ""
    for (i in count){
        if (i.ones > i.zeroes){
            gamma = gamma + "1"
            epsilon = epsilon + "0"
        }else{
            gamma = gamma + "0"
            epsilon = epsilon + "1"
        }
    }
    println(toDecimal(gamma) * toDecimal(epsilon))
}
