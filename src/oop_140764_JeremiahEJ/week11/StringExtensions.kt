package oop_140764_JeremiahEJ.week11

// Extension - THIS
fun String.addGreeting(): String{
    return "Hello $this"
}

// Extension - Parameter
fun String.repeatTimes(n:Int): String{
     return this.repeat(n)
}

fun String?.isNullOrEmpty(): Boolean{
    // "this" bs bernilai null
    return this == null || this.isEmpty()
}