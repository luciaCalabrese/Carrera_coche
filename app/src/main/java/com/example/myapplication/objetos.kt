import java.util.logging.Handler
import kotlin.random.Random


var coche1 = coche (400,10,20);
var coche2 = coche (300,20,20);
val list =  mutableListOf<coche>(coche1,coche2)

val Arrayoches = arrayOf(coche1,coche2)
class coche (var speedMax: Int, val acc: Int, val brake: Int) {
    var velocidad: Int = 0
    var speed = 0;
    var distance = 0;
    var gasoil = Math.floor((Math.random() * 10) + 1);
    var posicion = 0

    fun distance() {

}

}
class carrera (){
}



var coches = arrayOf (coche1,coche2)

fun main() {

    list.add(coche1)
}

fun carreras(coche: coche) {
    var lamp = 0
    var terminado: Boolean = true

    while (lamp <= 10) {

        for (i in 0..list.size - 1) {
            for (i in 0..Arrayoches.size-1) {
                list[i].velocidad += list[i].acc
                var aleatorio: Int = Random.nextInt(0, 4)

                if (aleatorio == 0) {
                    Frenazo(list[i])
                }
                if (aleatorio == 1) {
                    Averiado(list[i])
                    if (list.size - 1 <= 1) {
                        lamp = 10
                    }
                }
                if (aleatorio == 2) {
                    if (list.size == 1) {
                        lamp = 10
                    }
                }
                if (aleatorio == 3) {
                    Aceleracion(list[i])
                }
            }
        }
        lamp++
    }


    System.out.println("------------------")
    if (coche1.velocidad > coche2.velocidad ) {
        System.out.println("coche1 " + coche1.velocidad)
    }

}

fun Frenazo(coche: coche): Any {
    coche.velocidad = 0
    return coche.velocidad
}


fun Averiado(coche: coche): Any {
    if (coche.speedMax > 10 ){
        coche.speedMax = coche.speedMax -10
    }
    return coche.speedMax
}
fun Aceleracion(coche: coche):Any{
    if (coche.speed == coche.speedMax){
        coche.speed = coche.speedMax
    } else{
        coche.speed = coche.speed * 2
    }
    return coche.speed
}


