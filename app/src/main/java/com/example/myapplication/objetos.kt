import java.util.logging.Handler
import kotlin.random.Random

class coche (speedMax: Int, acc: Int, brake: Int) {
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

var coche1 = coche (10,20,20);
var coche2 = coche (10,200,20);

var coches = arrayOf (coche1,coche2)

fun main() {
    val Arrayoches = arrayOf(coche1,coche2)
    for (i in 0 ..Arrayoches.size-1){
        for (i in 0..Arrayoches.size-1){
            var aleatorio:Int = Random.nextInt(100,300)
            Arrayoches[i].velocidad+=aleatorio
        }
    }
}