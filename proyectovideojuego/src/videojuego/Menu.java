package videojuego;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void menufinal () {
        Scanner sc=new Scanner(System.in);
        boolean validacion=false;
            System.out.println("-------->MENU PRINCIPAL<--------");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LA HISTORIA>> (1)");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LOS CREDITOS>> (2)");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<SALIR DEL JUEGO>> (3)");

            while(!validacion)
            {
                try {
                    int numero = sc.nextInt();
                    sc.nextLine();
                    if(numero==3)
                    {
                        System.exit(0); //sirve para salir directamente del programa
                    }
                    else if(numero==2)
                    {
                        Creditos.autores();
                    }
                    else if(numero==1)
                    {
                        validacion=true;
                    }
                    else {
                        Error.fallosnumeros();
                        System.out.println("-------->MENU PRINCIPAL<--------");
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LA HISTORIA>> (1)");
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LOS CREDITOS>> (2)");
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<SALIR DEL JUEGO>> (3)");
                    }
                }catch (InputMismatchException e){ //coge el error, y el input es para que no se crashee
                    //la variable e sirve para guardar los datos de los errores que ha habido
                    sc.next();//limpia la letra o simbolo que no acepta el programa
                    Error.fallosnumeros();
                    System.out.println("-------->MENU PRINCIPAL<--------");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LA HISTORIA>> (1)");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<IR A LOS CREDITOS>> (2)");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<SALIR DEL JUEGO>> (3)");
                }

            }

    }
}



