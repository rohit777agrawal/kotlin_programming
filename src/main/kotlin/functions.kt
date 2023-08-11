fun main(){
    hello("Rohit")
    println(getMax(12,14))
    println(getMin(12,14))
    println(getMin(12.3,11.9))
    println(sum(1,2,3,4,5,6,7,8,9))
    println(printAllValue(1,2,3,4,5,6,7,8,9))
}

fun sum(vararg numbers: Int): Int{
    var result = 0;
    for (number in numbers){
        result += number
    }
    return result
}

fun printAllValue(vararg numbers: Int){
    numbers.forEach { println(it) }
}

fun hello(name: String) {
    println("Hello $name!")
}

fun getMax(a: Int, b: Int): Int {
    return if (a>b) a else b
}

fun getMin(a: Int, b: Int): Int = if (a<b) a else b  //Can be written in single line if only one.
fun getMin(a: Double, b: Double): Double = if (a<b) a else b  //method overloading: same fun name but differnt para

