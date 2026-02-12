package oop_140764_JeremiahEJ.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
){
    fun calculateFine(): Int{
        if(loanDuration > 3) {
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}