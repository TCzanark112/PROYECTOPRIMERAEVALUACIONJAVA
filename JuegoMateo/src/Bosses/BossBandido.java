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
            System.out.println("Golpe serio");
            return danoBase * 2;
        }
        if (probabilidad < 5){

            System.out.println("Golpe rastrero del bandido jefe");
            return danoBase * 3;
        }
        System.out.println("Atque normal");
        return danoBase;
    }

}
