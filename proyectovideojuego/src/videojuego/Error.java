package videojuego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error
{
    public static void fallosnumeros()
    {
        System.out.println(Colores.rojo()+"Error, tu numero no esta dentro de los parámetros establecidos, intentelo de nuevo porfavor"+ Colores.reset());
    }
    public static void falloletras()
    {
        System.out.println(Colores.rojo()+"Error, solo puedes escribir si o no, intentelo de nuevo porfavor"+ Colores.reset());
    }public static void falloletras2()
    {
        System.out.println(Colores.rojo()+"Error, solo puedes escribir letras, intentelo de nuevo porfavor"+ Colores.reset());
    }

    public static int validacionnumero(Scanner sc)
    {
        boolean falso=false;
        int numero=0;

        while(!falso)
        {
            try {
                numero=sc.nextInt();

                if(numero>=1&&numero<=2)
                {
                    falso=true;
                }
            else {
                    Error.fallosnumeros();
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Elige un numero del 1 al 2");
                }

        }catch (InputMismatchException e)
            {
                sc.next();
                Error.fallosnumeros();
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Introduce numeros del 1 al 2");
            }
        }
        return numero;
    }

}
