import kotlin.random.Random


class coche (var nombre: String,var speedMax: Int, val acc: Int, val brake: Int) {
    var velocidad: Int = 0
    var speed = 0;
    var distance = 0;
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


