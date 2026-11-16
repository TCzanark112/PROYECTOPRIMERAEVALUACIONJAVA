package videojuego;
import java.util.Random;

public class EstadisticasMalvado
{
     public static int evildanio()
     {
         int danoBase = 250;
         Random ramdon= new Random();
         int probabilidad = ramdon.nextInt(100);
         if (probabilidad < 30) {
             return danoBase * 2;
         }
         return danoBase;
     }
    public static String evilfrase(int daniobase)
    {
        if(daniobase==250)
        {
            return Colores.morado()+ "EXPLOSION LETAL"+Colores.reset();
        } else  {
            return Colores.rojo()+"¡¡¡HAKAI!!!"+Colores.reset();
        }
    }
    public static int evilvida()
    {
        return 666;
    }
    public static int evilarmadura()
    {
        return 666;
    }



    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static int danioGrieff()
    {
            int danogrief = 621;
            Random ramdon= new Random();
            int probabilidad = ramdon.nextInt(100);
            if (probabilidad < 10) {
                return danogrief * 2;
            }
            return danogrief;
    }
    public static String frasesGrief(int danogrief)
    {
        if(danogrief==621)
        {
            return Colores.verde()+ "CORTE VELOZ"+Colores.reset();
        } else  {
            return Colores.azul()+"¡¡¡ONDA VITAL!!!"+Colores.reset();
        }
    }
    public static int armaduraGrief()
    {
        return 200;
    }
    public static int vidaGrieff()
    {
        return 444;
    }
    public static void estadisticagrieff(int vida,int daniobase,int armadura)//esto es una sobrecarga que no quiero que tenga scanner
    {
        System.out.println("tus Estadisticas actuales son:");
        System.out.println(Colores.verde() + "VIDA: " + Colores.reset() + vida);
        System.out.println(Colores.verde()+"ATQUE: "+ Colores.reset()+daniobase);
        System.out.println(Colores.verde()+"ARMADURA: "+ Colores.reset()+armadura);
    }


}
