package videojuego;
import java.util.Scanner;
public class Pruebas
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String aceptar= "";
        String boss="bandido";
        String nombre="alex";
        int rolelegido=1;
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.verde()+"COMBATE:"+Colores.reset()+Colores.amarillo()+nombre+Colores.reset()+" VS "+Colores.rojo()+"BOSS BANDIDO"+Colores.reset());
        boss=Colores.rojo()+" El Bandido"+Colores.reset();
       boolean pasa=false;
        while(!pasa) {
            pasa=Combates.combate2(rolelegido, nombre, BossBandido.bandidoDano(), BossBandido.bandidoVida(), BossBandido.bandidoarmadura(), boss);
        }
    }
    }

