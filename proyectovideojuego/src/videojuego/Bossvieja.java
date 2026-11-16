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

}
