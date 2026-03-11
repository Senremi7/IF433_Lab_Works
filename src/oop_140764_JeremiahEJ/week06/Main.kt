package oop_140764_JeremiahEJ.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val lamp = SmartLamp("Lamp01", "Ruang Tamu")
    val speaker = SmartSpeaker("Speaker01", "Google Nest Dapur")
    val cctv = SmartCCTV("CCTV01", "Ezviz Garasi")

    println("=== TESTING turnON FUNCTION ON SMART DEVICEd ===")
    lamp.turnOn()
    speaker.turnOn()
    cctv.turnOn()

    println("\n=== TESTING SMART HOME HUB ===")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}