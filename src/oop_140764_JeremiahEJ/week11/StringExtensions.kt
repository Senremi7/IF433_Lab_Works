package oop_140764_JeremiahEJ.week11

// Extension - THIS
fun String.addGreeting(): String{
    return "Hello $this"
}

// Extension - Parameter
fun String.repeatTimes(n:Int): String{
     return this.repeat(n)
}