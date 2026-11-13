package videojuego;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Personajes
{
    public static int elegirRol() //no le doy parametros, porque con el scanner voy a devolver el int
    {
        int eleccion=0;
        Scanner sc = new Scanner(System.in);
        boolean numerovalido=false;
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Puedes elegir entre estas 4 clases");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Cada clase tiene sus ventajas y desventajas");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (1) si quieres ser "+ Colores.verde()+ "CAZADOR"+ Colores.reset()+", usas el arco, destacas en rastreo y astucia");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (2) si quieres ser "+ Colores.azul() +" GUERRERO"+ Colores.reset()+", utilizaras un espadon, las palabras no se te daran tan bien como los puños");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (3) si quieres ser "+ Colores.morado()+"MAGO"+ Colores.reset()+", usas una vara magica, destacarás en conocimientos antiguos y lenguas ya extintas");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (4) si quieres ser un "+ Colores.rojo()+"ASESINO"+ Colores.reset()+", tu arma será la daga, serás como un gato escurridizo");

    while(!numerovalido)
    {
        try{
            eleccion = sc.nextInt();
            sc.nextLine();
            if(eleccion<=4&&eleccion>=1)
            {
                numerovalido=true;
            }
            else{
                Error.fallosnumeros();
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (1) si quieres ser "+ Colores.verde()+ "CAZADOR"+ Colores.reset()+", usas el arco, destacas en rastreo y astucia");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (2) si quieres ser "+ Colores.azul() +" GUERRERO"+ Colores.reset()+", utilizaras un espadon, las palabras no se te daran tan bien como los puños");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (3) si quieres ser "+ Colores.morado()+"MAGO"+ Colores.reset()+", usas una vara magica, destacarás en conocimientos antiguos y lenguas ya extintas");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (4) si quieres ser un "+ Colores.rojo()+"ASESINO"+ Colores.reset()+", tu arma será la daga, serás como un gato escurridizo");
            }
        }catch (InputMismatchException e)
        {
            sc.next();
            Error.fallosnumeros();
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (1) si quieres ser "+ Colores.verde()+ "CAZADOR"+ Colores.reset()+", usas el arco, destacas en rastreo y astucia");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (2) si quieres ser "+ Colores.azul() +" GUERRERO"+ Colores.reset()+", utilizaras un espadon, las palabras no se te daran tan bien como los puños");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (3) si quieres ser "+ Colores.morado()+"MAGO"+ Colores.reset()+", usas una vara magica, destacarás en conocimientos antiguos y lenguas ya extintas");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Dale al (4) si quieres ser un "+ Colores.rojo()+"ASESINO"+ Colores.reset()+", tu arma será la daga, serás como un gato escurridizo");

        }
    }
    return eleccion;    //devuelve el numero
    }

public static String nombre(Scanner sc)
{
    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("<<Introduce tu nombre con letras, puede ser mayusculas o minusculas");
    String nombre = sc.nextLine().trim();
    while(!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"))
    {
        Error.falloletras2();
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Solo puedes introducir letras en tu nombre ");
        nombre=sc.nextLine().trim();
    }
    return nombre;
}
}
