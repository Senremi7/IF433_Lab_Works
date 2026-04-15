package oop_140764_JeremiahEJ.week08;

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // ERROR: sendEmail(user.email) // Tidak bisa mengakses email karena private

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}
