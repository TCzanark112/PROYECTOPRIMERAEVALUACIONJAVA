package videojuego;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Minijuego
{
    public static void gatito()
    {
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Adivina el numero para poder salvar a bigotitos");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Para rescatar a BIGOTITOS tienes que elegir un numero del 1-10");
        Random random=new Random();
        Scanner sc = new Scanner(System.in);

        int numerorandom=random.nextInt(10)+1;
        boolean repeticion=false;
        while(!repeticion)
        {
            try{
                int numero= sc.nextInt();
                sc.nextLine();
                if(numero>numerorandom&&numero<=10)
                {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("tu numero es mayor");

                } else if (numero < numerorandom&&numero>=1) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("tu numero es menor");

                } else if (numero==numerorandom) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has acertado el numero");
                    repeticion=true;
                }else {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+ "Tu numero no esta dentro de los parametros"+ Colores.reset());
                }

            }catch (InputMismatchException e)
            {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+ "Tu numero no esta dentro de los parametros"+ Colores.reset());
            }

        }

    }
}
