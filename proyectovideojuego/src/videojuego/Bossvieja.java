package videojuego;
import java.util.Random;
public class Bossvieja {
    public static int viejaVida (){
        int vida = 150;

        return vida;
    }

    public static int viejaDano (){
        int danoBase = 14;
        Random ramdon= new Random();
        // Probabilidad del 20%
        int probabilidad = ramdon.nextInt(100);
        if (probabilidad < 20) { //si en el random el numero es menor de 20 sale critico, por lo que tiene un 20%
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("La vieja te ha hecho daño critico");
            return danoBase * 2;
        }

        return danoBase;
    }

    public static int viejaArmadura (){
        int armadura = 10;

        return armadura;
    }

    public static String fraseAtaque() {

        String[] frases = {
                "VIEJA:"+ Colores.rojo()+" ¡BIGOTITOS ES MIO!"+ Colores.reset(),
                "VIEJA:"+ Colores.rojo()+" ¡ME LAS VAS A PAGAR!"+ Colores.reset(),
                "VIEJA:" + Colores.rojo()+"¡La vieja se abalanza sobre ti!"+ Colores.reset(),
                "VIEJA:"+ Colores.rojo()+" ¡QUIEN TE CREES QUE ERES!"+ Colores.reset(),
                "VIEJA:"+ Colores.rojo()+" ¡No me tomes a broma muchacho!"+ Colores.reset()
        };
        Random ramdon=new Random();
        int aleatorio = ramdon.nextInt(5);
        return frases[aleatorio];
    }

}
