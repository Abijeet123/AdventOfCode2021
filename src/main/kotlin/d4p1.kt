import java.io.File

fun main(){
    var file1 = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\test.txt").readLines()
    var file2 = File("C:\\Users\\User\\KTPRAC\\aoc\\src\\main\\kotlin\\test2.txt").readLines()
    var numbers = file1[0].split(",").map { it.toInt() }
    println(numbers)
    var board : MutableList<List<String>> = mutableListOf()
    for (i in file2){
        board.add(i.split(" "))

    }
    println(board)
}