package oop_140764_JeremiahEJ.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Speaker '$name' dengan id '$id' menyala.")
    }
    override fun turnOff(){
        println("Speaker '$name' dengan id '$id' mati.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}