package videojuego;
import java.util.Random;

public class BossBandido {
    public static int bandidoVida (){
        return 300;
    }

    public static int bandidoDano (){
        Random ramdon = new Random();
        int danoBase = 30;
        int probabilidad = ramdon.nextInt(100)+1;
        if (probabilidad < 25 && probabilidad > 5) { // Probabilidad del 20%
            return danoBase * 2;
        }
        if (probabilidad < 5){
            return danoBase * 3;
        }
        return danoBase;
    }
    public static String frasesatacando(int daniobase)
    {
        if(daniobase==30)
        {
            return "Ataque básico";
        } else if (daniobase == daniobase * 2) {
            return Colores.amarillo()+"ATAQUE CRITICO"+Colores.reset();
        } else  {
            return Colores.morado()+"PORRAZO SERIO"+Colores.reset();
        }
    }

    public static int bandidoarmadura (){
        return 70;
    }

}