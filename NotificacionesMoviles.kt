package com.example.aprendiendokotlin

/*
Por lo general, el teléfono te proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa
que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje
debe incluir lo siguiente:

La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más
 */

fun main() {

    /* val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.

     printNotificationSummary(51"Tu tienes 51 notificaciones")
     printNotificationSummary(135"Tu tienes 135 notificaciones")
*/

    fun notificacion() {

        print("Cantidad de notificaciones recibidas -->")
        val notificaciones : Int = readln().toInt()

        if (notificaciones < 100) {

            print("Tu tienes $notificaciones notificaciones.")


        }else{
            print("Tu telefono va a explotar! Tu tienes + de 99 notificaciones.")
        }
    }

}





