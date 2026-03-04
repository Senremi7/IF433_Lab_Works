package oop_140764_JeremiahEJ.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}