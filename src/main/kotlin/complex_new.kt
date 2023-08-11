fun main(){

    var text: String? = "Some"
    text = null
    println(text?.length)   //It checks that if the text is Null or not and then find the length

    val text2 = text?: "Varialbe is null!"  //Checks if the text is null or not, otherwise assign the other value.
    println(text2)
}