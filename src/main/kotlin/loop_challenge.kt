fun main(){
    // print all the even numbers and keep count
    var counter = 0
    for(i in 1..20){
        if((i%2) != 0){
            continue
        }
        counter++
        println(i) //Print
    }
    println("The number of even numbers are: $counter")
}