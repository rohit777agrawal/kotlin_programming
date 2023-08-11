fun main() {
    var alarm = 12

    if (alarm == 12){
        println("Ring! Ring!")
    }
    else{
        println("o ring")
    }

    when (alarm){
        12 -> println("It's ringing again!")
        24 -> println("No ring!")
        7 -> println("No ring")
        57, 1, 19 -> println("Multi-Alarm System")
        else -> println("Don't know!")
    }
}