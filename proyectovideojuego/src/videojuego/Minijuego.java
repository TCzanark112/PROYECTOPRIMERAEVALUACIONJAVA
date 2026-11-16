package videojuego;
import java.util.Arrays;
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
    public static void eleccion(Scanner scanner)
    {
       int numero= Error.validacionnumero(scanner);
       if(numero==1)
       {
           Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Grifg te mete una colleja y te obliga a ir a explorar con él");
       }else if (numero==2){
           Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Grieff y tu explorais la cueva");

       }
    }

    public static void explorarcueva(Scanner scanner , int rolelegido,String nombre)
    {
        String boss="";
        String[][] cueva={ //array normal, solo los array se pueden inicializar con corchetes, los otros son con new arraylist
        {"camino", "camino", "camino", "pared"},
        {"inicio", "pared", "camino", "camino"},
        {"camino", "pared", "pared", "camino"},
        {"camino", "PORTAL", "salida", "camino"}
    };
         int filactual=1;
         int columnactual=0;
         boolean encontrado=false;
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Inicia el minijuego encuentra la salida.");
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                 Al estar en una cueva oscura tendras que ir poniendo las coordenadas a donde quieras ir in saber a donde vas""");
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"Cuidado "+Colores.reset()+"solo podras ir de uno en uno");
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Osea (1,0)->(1,1) o (2,0)");
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Empiezas desde la coordenada Fila:1,Columna:0-->(1,0)");
         Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Buena suerte");
         if(rolelegido==4)
         {
             Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.verde()+"Se activa tu pasiva"+Colores.reset()+Colores.amarillo()+" Vision Asesina"+Colores.reset());
             Minijuego.mapaasesino(cueva,filactual,columnactual);
         }
         while(!encontrado)
         {
             Funcionparaquelaletrasalgadeunoenuno.imprimirlento("------------------------------------------------");
             Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Que quieres hacer:?");
             Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Ver tu posicion actual "+Colores.verde()+"(1)"+Colores.reset());
             Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Ir a la siguiente posicion"+Colores.verde()+"(2)"+Colores.reset());
             int opcion=Error.validacionnumero(scanner,0,3);
             if(opcion==1)
             {
                 Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Estas en la posicion ("+filactual+","+columnactual+")");
             } else if (opcion == 2) {
                 Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Introduce la fila");
                 int siguientefila=Error.validacionnumero(scanner,0,3);;
                 Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Introduce la columna");
                 int siguientecolumna=Error.validacionnumero(scanner,0,3);;
                    if(siguientefila<0||siguientefila>3||siguientecolumna<0||siguientecolumna>3)
                    {
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has puesto un numero que esta fuera de los parametros de la cueva");
                    }else {
                        int diferenciafila=Math.abs(siguientefila-filactual);
                        int diferenciacolumna=Math.abs(siguientecolumna-columnactual);
                        if((diferenciafila+diferenciacolumna)==1)
                        {
                            String casilla=cueva[siguientefila][siguientecolumna];
                            if(casilla.equalsIgnoreCase("pared"))
                            {
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"Te chocas con una pared"+Colores.reset());
                            } else if (casilla.equalsIgnoreCase("camino")) {
                                filactual=siguientefila;
                                columnactual=siguientecolumna;
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.verde()+"Avanzas con exito"+Colores.reset());
                            } else if (casilla.equalsIgnoreCase("portal")) {
                                filactual=siguientefila;
                                columnactual=siguientecolumna;
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo()+"HAS ENCONTRADO UN PORTAL"+Colores.reset());
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Quieres utilizar el portal?");
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si "+Colores.verde()+"(1)"+Colores.reset());
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("No "+Colores.verde()+"(2)"+Colores.reset());
                                int afirmacion=Error.validacionnumero(scanner,0,3);;
                                if(afirmacion==1)
                                {
                                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("ACTIVAS EL PORTAL");
                                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Os meteis los dos al portal y os teletransportais");
                                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te lleva a la sala del anillo");
                                    Final.elfinal(rolelegido,nombre,boss);
                                } else if (afirmacion == 2) {
                                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("NO OS METEIS AL PORTAL");
                                }
                            } else if (casilla.equalsIgnoreCase("salida")) {
                                filactual=siguientefila;
                                columnactual=siguientecolumna;
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Vas tocando y notas que es una puerta");
                                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.verde()+"ENORABUENA HAS ENCONTRADO LA SALIDA"+Colores.reset());
                                encontrado=true;
                            }
                        }else
                        {
                            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"NO PUEDES AVANZAR TANTO"+Colores.reset());
                        }
                    }
             }else
             {
                 Funcionparaquelaletrasalgadeunoenuno.imprimirlento("opcion no valida");
             }
         }
    }
    public static void mapaasesino(String[][] cueva,int filaactual,int columnaactual)
    {
        System.out.println("VISION ASESINA");
        System.out.println("-------------------");
        for(int i =0;i<cueva.length;i++) //buclefilas
        {
            for(int a=0;a< cueva.length;a++)// bucle para las columnas
            {
                if(filaactual==i&&columnaactual==a)
                {
                    System.out.print("[TÚ]");
                }else
                {
                    //guardamos los datos del array en una variable String
                    String casilla=cueva[i][a];
                    System.out.print("["+casilla+"]");
                }
            }
            System.out.println();//para que pase a la siguiente linea
        }
    }

    public static void ahorcado(int rolelegido,String nombre) {
        String boss="";
        String palabra = Minijuego.palabraramdon();
        Scanner sc = new Scanner(System.in);
        //ventaja para el mago
        if (rolelegido == 3) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Al parecer al lado del rompecabezas hay letras antiguas escritas");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Gracias a tu conocimiento de mago los puedes leer, te gustaría leerlo?");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("si" + Colores.verde() + "(1)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("no" + Colores.verde() + "(2)" + Colores.reset());
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "SE LANZA UN HECHIZO QUE ABRE LA PUERTA DIRECTAMENTE A LA FUERZA" + Colores.reset());
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("PUERTA:" + Colores.verde() + " ¡¡¡No puede ser!!!, me ha roto este mago novato...(se deshace la puerta)");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Entras, y te encuentras en la sala del anillo");
                Final.elfinal(rolelegido, nombre,boss);
                return;//para terminar el ahorcado
            } else if ((numero == 2)) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Decides enfrentarte al acertijo sin magia");
            }
        }

        //-----------------------------------------------------------------------------------------------------------------------------------------------------
        //ventaja del mago

        boolean pasas = false;
        char[] guionesarray = new char[palabra.length()]; //creamos el array para guardar los guiones y el que usaremos para imprimir
        for (int i = 0; i < palabra.length(); i++) {
            guionesarray[i] = '_';
        }
        System.out.println("Adivina que palabra es:");
        for (int j = 0; j < guionesarray.length; j++) {
            System.out.print(guionesarray[j]);
        }
        System.out.println(" ");
        int contador = 0;
        int numero;

        while (!pasas) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Quieres intentar adivinar una letra?" + Colores.verde() + " (1)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Quieres intentar adivinar la palabra?" + Colores.verde() + " (2)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si fallas al adivinar la palabra se reseteara el ahorcado y volveras a empezar");
            numero = Error.validacionnumero(sc);
            if (numero == 1) {


                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pon tu letra:");
                char letra = sc.next().charAt(0);
                boolean acertada = false;
                for (int a = 0; a < palabra.length(); a++) {
                    if (Character.toLowerCase(letra) == Character.toLowerCase(palabra.charAt(a))) {
                        guionesarray[a] = palabra.charAt(a);
                        acertada = true;
                    }
                }
                if (!acertada) {

                    if (contador == 0) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                      |
                                      |
                                     ===""");

                    } else if (contador == 1) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                  |   |
                                      |
                                     ===""");

                    } else if (contador == 2) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                 /|   |
                                      |
                                     ===""");
                    } else if (contador == 3) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                 /|\\ |
                                      |
                                     ===""");
                    } else if (contador == 4) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                 /|\\ |
                                 /    |
                                     ===""");

                    } else if (contador == 5) {
                        System.out.println("Fallo");
                        System.out.println("""
                                +---+
                                  O   |
                                 /|\\ |
                                 / \\ |
                                     ===""");

                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has fallado demasiadas veces, vuelves a empezar");
                        Minijuego.ahorcado(rolelegido, nombre);
                        return;

                    }
                    contador++;
                }
                System.out.println();
                for (int j = 0; j < guionesarray.length; j++) {
                    System.out.print(guionesarray[j]);
                }
                System.out.println();
                String palabras = new String(guionesarray);
                if (palabras.equalsIgnoreCase(palabra)) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Ya has adivinado la palabra");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("La palabra era " + palabra);
                    pasas = true;
                }
            } else if (numero == 2) {
                sc.nextLine(); //limpieza
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pon la palabra:");
                String resultado = sc.nextLine();
                if (resultado.equalsIgnoreCase(palabra)) {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Enhorabuena has acertado");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("La palabra era " + palabra);
                    pasas = true;
                } else {
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Lastima has fallado al adivinar la palabra, reseteando y volviendo a empezar");
                    Minijuego.ahorcado(rolelegido, nombre);
                    return;

                }
            }


        }
    }
    public static String palabraramdon()
    {
        String[]palabras={"Aprobados","Diez","Trabajo","Esfuerzo"};
        Random ramdon=new Random();
        int numero=ramdon.nextInt(4);
        return palabras[numero];
    }
}
