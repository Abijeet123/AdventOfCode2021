import java.io.File

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles


//data class cntt(var zeroes : Int =0, var ones : Int = 0)
fun filter(input : List<String>,index : Int) : MutableList<String>{
    var count = cnt()
    for (i in input){
        when (i[index].toString()){
            "1" -> count.ones++
            else -> count.zeroes++
        }
    }
    var ret : MutableList<String> = mutableListOf()
    if (count.ones >= count.zeroes){
        for (i in input  ){
            if (i[index] == '1') ret.add(i)
        }
    }else{
        for (i in input){
            if (i[index] == '0') ret.add(i)
        }
    }
    return ret
}

fun filter2(input : List<String>,index : Int) : MutableList<String>{
    var count = cnt()
    for (i in input){
        when (i[index].toString()){
            "1" -> count.ones++
            else -> count.zeroes++
        }
    }
    var ret : MutableList<String> = mutableListOf()
    if (count.zeroes <= count.ones){
        for (i in input  ){
            if (i[index] == '0') ret.add(i)
        }
    }else{
        for (i in input){
            if (i[index] == '1') ret.add(i)
        }
    }
    return ret
}

fun main(){
    var file = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\test.txt")
    var oxygenSupport : MutableList<String> = mutableListOf()
    var co2 : MutableList<String> = mutableListOf()
    file.forEachLine { oxygenSupport.add(it)
                        co2.add(it)
                        }

    for (i in 0..11){
        if (oxygenSupport.size == 1) break
        oxygenSupport = filter(oxygenSupport,i)
    }
    println(oxygenSupport)

    for (i in 0..11){
        if (co2.size == 1) break
        co2 = filter2(co2,i)
    }
    println(co2)
    println(toDecimal(oxygenSupport[0]) * toDecimal(co2[0]))
}