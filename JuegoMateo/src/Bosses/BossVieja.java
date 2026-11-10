package Bosses;

public class BossVieja {
    public static int viejaVida (){
        int vida = 150;

        return vida;
    }

    public static int viejaDano (){
        int danoBase = 7;

        // Probabilidad del 20%
        int probabilidad = (int) (Math.random() * 100);
        // como el math.random es un double, usamos el int para castearlo y sea todo la misma variable
        if (probabilidad < 20) {
            return danoBase * 2;
        }

        return danoBase;
    }

    public static int viejaArmadura (){
        int armadura = 10;

        return armadura;
    }


}
