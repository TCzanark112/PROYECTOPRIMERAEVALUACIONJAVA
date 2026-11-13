package videojuego;
import java.util.Scanner;
public class Confirmacion
{
    public static boolean confirma(int rolelegido)
    {
        Scanner sc = new Scanner(System.in);
        String nombrerol="";
        if(rolelegido==1)
        {
            nombrerol="Cazador";
        } else if (rolelegido == 2) {
            nombrerol="Guerrero";
        } else if (rolelegido==3) {
            nombrerol="Mago";
        } else if (rolelegido==4) {
            nombrerol="Asesino";
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Estas seguro que quieres elegir "+nombrerol);
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe "+ Colores.verde()+" (si)"+ Colores.reset()+" si es lo que quieres");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe "+ Colores.verde()+" (no)"+ Colores.reset()+" si quieres volver a elegir");
        String escritura = sc.nextLine().trim();
        while(!escritura.equalsIgnoreCase("si")&&!escritura.equalsIgnoreCase("no"))
        //usamos en and en este caso porque sino aunque cumpla una de las dos condiciones seguira en el bucle
        {
            Error.falloletras();
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Estas seguro que quieres elegir "+nombrerol);
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe "+ Colores.verde()+"(si)"+ Colores.reset()+ " si es lo que quieres");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe "+ Colores.verde()+"(no)"+ Colores.reset()+" si quieres volver a elegir");
            escritura=sc.nextLine().trim();

        }
        if(escritura.equalsIgnoreCase("no"))
        {
            return false; //que vuelva a elegir
        }

            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has elegido el rol de "+ Colores.amarillo()+nombrerol+ Colores.reset());
            return true; //ponerlo siempre fuera de un if sino el programa piensa que cada uno de los if tiene su return pero el final fuera no tiene

    }
    public static boolean confirmacion2(int eleccion) //metodo generico para confirmar cualquier eleccion doble
    {
        Scanner sc = new Scanner(System.in);
        String confirmacion="";
        boolean sale=false;
            if (eleccion == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Estas seguro de elegir la primera mision?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(si)" + Colores.reset() + " si es lo que quieres");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(no)" + Colores.reset() + " si quieres volver a elegir");
                confirmacion = sc.nextLine().trim();
                while (!confirmacion.equalsIgnoreCase("si") && !confirmacion.equalsIgnoreCase("no")) {
                    Error.falloletras();
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Estas seguro que quieres elegir ruta 1");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + " (si)" + Colores.reset() + " si es lo que quieres");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(no)" + Colores.reset() + " si quieres volver a elegir");
                    confirmacion = sc.nextLine().trim();
                }
                if (confirmacion.equalsIgnoreCase("no")) {
                   sale=false;
                } else if (confirmacion.equalsIgnoreCase("si")) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has elegido la primera ruta");
                    sale = true;
                }


            } else if (eleccion == 2) {

                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Estas seguro de elegir la segunda mision?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(si)" + Colores.reset() + " si es lo que quieres");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(no)" + Colores.reset() + "si quieres volver a elegir");
                confirmacion = sc.nextLine().trim();
                while (!confirmacion.equalsIgnoreCase("si") && !confirmacion.equalsIgnoreCase("no")) {
                    Error.falloletras();
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Estas seguro que quieres elegir ruta 2");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(si)" + Colores.reset() + " si es lo que quieres");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Escribe " + Colores.verde() + "(no)" + Colores.reset() + "si quieres volver a elegir");
                    confirmacion = sc.nextLine().trim();
                }
                if (confirmacion.equalsIgnoreCase("no")) {
                    sale = false;
                } else if (confirmacion.equalsIgnoreCase("si")) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has elegido la segunda ruta");
                    sale = true;
                }
            }
            return sale;
        }

    }

