package videojuego;
import java.util.Scanner;
public class Creditos
{
    public static void autores()
    {
        Scanner sc = new Scanner(System.in);
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Este trabajo lo hemos hecho entre Marcelo Gonzalez, Mateo izquierdo y Alejandro Zheng Ye.
                Espero que os guste el juego, o si ya lo habeis jugado, espero que os lo hayais pasado bien""");
        System.out.println("si quieres salir del juego dale al (1)");
        System.out.println("si quieres volver al Menu principal dale al (2)");
        int numero = sc.nextInt();
        sc.nextLine();
        while(numero>2||numero<1)
        {
            Error.fallosnumeros();
            System.out.println("si quieres salir dale al (1)");
            System.out.println("si quieres volver al Menu principal dale al (2)");
            numero = sc.nextInt();
        }
        if(numero==1)
        {
            System.exit(0);
        } else if (numero==2) {
            Menu.menufinal();

        }
    }
}
