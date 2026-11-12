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

    public static String fraseAtaque() {

        String[] frases = {
                "¡BIGOTITOS ES MIO!",
                "¡ME LAS VAS A PAGAR!",
                "¡La vieja se abalanza sobre ti!",
                "¡QUIEN TE CREES QUE ERES!",
                "¡No me tomes a broma muchacho!"
        };

        int aleatorio = (int) (Math.random() * 5);

        return frases[aleatorio];
    }

}
