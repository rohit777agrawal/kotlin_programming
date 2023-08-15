fun main(){
//    val names= arrayOf("John", "dada", "dad")
//    for (name in names){
//        println(name)
//    }

    //Challenge
    val number= arrayOf(13, 99, 70, 12, 67,239)
    println(getMax(number))
    println(getMin(number))
}

fun getMax(max: Array<Int>): Int =  max.max()
fun getMin(min: Array<Int>): Int =  min.min()