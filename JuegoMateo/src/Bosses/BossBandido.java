package Bosses;

public class BossBandido {
    public static int bandidoVida (){
        int vida = 300;

        return vida;
    }

    public static int bandidoDano (){
        int danoBase = 30;

        // Probabilidad del 20%
        int probabilidad = (int) (Math.random() * 100);

        // como el math.random es un double, usamos el int para castearlo y sea todo la misma variable
        if (probabilidad < 25 && probabilidad > 5) {
            System.out.println("Porrazo Serio");
            return danoBase * 2;
        }
        if (probabilidad < 5){

            System.out.println("Golpe rastrero del bandido jefe");
            return danoBase * 3;
        }
        System.out.println("Atque normal");
        return danoBase;
    }

    public static int viejaArmadura (){
        int armadura =70;

        return armadura;
    }

    public static String fraseAtaque() {

        String[] frases = {
                "TE VAS A ENTERAR, MINDUNDI!!",
                "VAIS A SUFRIR!!!",
                "No soy tan blando como mis secuaces",
                "No saldreis con vida de esta",
                "Os metisteis con el bandido equivocado!!!"
        };

        int aleatorio = (int) (Math.random() * 5);

        return frases[aleatorio];
    }
}
