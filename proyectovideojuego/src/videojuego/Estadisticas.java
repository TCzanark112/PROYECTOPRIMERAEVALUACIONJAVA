package videojuego;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Estadisticas
{
    public static int vida(int rolelegido) //este metodo es para darle una vida dependiendo del rol que haya elegido
    {
        int vida=0;
        if(rolelegido==1)
        {
            vida = 100;
        } else if (rolelegido==2) {
            vida=100;

        } else if (rolelegido==3) {
            vida=60;
        } else if (rolelegido == 4) {
            vida=100;
        }
        return vida;
    }
    public static int armadura(int rolelegido) //este metodo es para darle una armadura dependiendo del rol que ha elegido
    {
        int armadura=0;
        if(rolelegido==1) {
            armadura = 20;
        } else if (rolelegido == 2) {
            armadura=100;
        } else if (rolelegido==3) {
            armadura=0;
        } else if (rolelegido==4) {
            armadura=10;
        }
        return armadura;
    }
    public static int daniobase(int rolelegido) //este metodo es para darle un daño dependiendo del rol que haya elegido
    {
        int daniobase=0;
        if(rolelegido==1)
        {
            daniobase=75;
        } else if (rolelegido == 2) {
            daniobase=30;
        } else if (rolelegido == 3) {
            daniobase=120;
        } else if (rolelegido == 4) {
            daniobase=100;
        }
        return daniobase;
    }
    public static void estadistica(Scanner scanner,int vida,int daniobase,int armadura)//este metodo es para enseñar las Estadisticas
    {
        Scanner sc = new Scanner(System.in);
        boolean acepta = false;
        while(!acepta)
        {try
            {
                int numero=sc.nextInt();
                sc.nextLine(); //limpiamos espacio como siempre
                if(numero==1)
                {
                    System.out.println("tus Estadisticas actuales son:");
                    System.out.println(Colores.verde() + "VIDA: " + Colores.reset() + vida);
                    System.out.println(Colores.verde()+"ATQUE: "+ Colores.reset()+daniobase);
                    System.out.println(Colores.verde()+"ARMADURA: "+ Colores.reset()+armadura);

                    acepta=true;
                } else if (numero==2) {
                    acepta=true;

                }else{
                    Error.fallosnumeros();
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(" *¿Te gustaría ver tus estadisiticas actuales?* ");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa(1) si quieres verlo");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa (2) si quieres continuar la Historia");
                }
            }catch (InputMismatchException e)
        {
                sc.next();
            Error.fallosnumeros();
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(" *¿Te gustaría ver tus estadisiticas actuales?* ");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa(1) si quieres verlo");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa (2) si quieres continuar la Historia");
        }

        }
    }
    public static void estadistica(int vida,int daniobase,int armadura)//esto es una sobrecarga que no quiero que tenga scanner
    {
                System.out.println("tus Estadisticas actuales son:");
                System.out.println(Colores.verde() + "VIDA: " + Colores.reset() + vida);
                System.out.println(Colores.verde()+"ATQUE: "+ Colores.reset()+daniobase);
                System.out.println(Colores.verde()+"ARMADURA: "+ Colores.reset()+armadura);
    }
    public static int FlechaDeDios() //HABILIDAD DEL ARQUERO
    {
        int ataqueespecial=0;
        Random numero= new Random(); //tiene un 10% de que acierte ya que tiene que coincir un numero 1-10 dos veces
        int primernumero = numero.nextInt(10)+1;
        int segundonumero = numero.nextInt(10)+1;
        if(primernumero==segundonumero)
        {
           /* Funcionparaquelaletrasalgadeunoenuno.imprimirlento("NO PUEDE SER, LANZAS LA FLECHA DE DIOS");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("EL ENEMIGO RECIBE UN ONESHOT INSTANTANEO");*/
            ataqueespecial=1000000;
        } else if (primernumero!=segundonumero) {
           /* Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Mala suerte DIOS no te ha escuchado");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("No has hecho nada");*/
        } return ataqueespecial;

    }
    public static int ataqueconlaespada()
    {
       int ataqueespecial=0;
       /* Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Decides atacar con la espada");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Haces 100");*/
        ataqueespecial=100;
        return ataqueespecial;
    }
    public static int BENDICIONDELABRUJA(int rolelegido)
    {

      /*  Funcionparaquelaletrasalgadeunoenuno.imprimirlento("GRACIAS A LA BENDICION DE LA BRUJA TU ARMADURA A SUBIDO MUCHO");*/
       int subidadearmadura= Estadisticas.armadura(rolelegido)+500;
        return subidadearmadura;
    }
    public static int instintoasesion(int rolelegido)
    {
        int critico=2;
       /* Funcionparaquelaletrasalgadeunoenuno.imprimirlento("PEGAS UN CRITICO");*/
        int daniocritico= Estadisticas.daniobase(rolelegido);
       int instintoasesion=critico*daniocritico;
       return instintoasesion;
    }

    public static int vidabendecido(int rolelegido) //este metodo es para darle una vida dependiendo del rol que haya elegido
    {
        int vida=0;
        if(rolelegido==1)
        {
            vida = 650;
        } else if (rolelegido==2) {
            vida=1000;

        } else if (rolelegido==3) {
            vida=530;
        } else if (rolelegido == 4) {
            vida=700;
        }
        return vida;
    }
    public static int armadurabendecida(int rolelegido) //este metodo es para darle una armadura dependiendo del rol que ha elegido
    {
        int armadura=0;
        if(rolelegido==1) {
            armadura = 200;
        } else if (rolelegido == 2) {
            armadura=400;
        } else if (rolelegido==3) {
            armadura=100;
        } else if (rolelegido==4) {
            armadura=100;
        }
        return armadura;
    }
    public static int daniobasebendecido(int rolelegido) //este metodo es para darle un daño dependiendo del rol que haya elegido
    {
        int daniobase=0;
        if(rolelegido==1)
        {
            daniobase=750;
        } else if (rolelegido == 2) {
            daniobase=400;
        } else if (rolelegido == 3) {
            daniobase=1200;
        } else if (rolelegido == 4) {
            daniobase=1000;
        }
        return daniobase;
    }

    public static void estadisticaBendecida(int vida,int daniobase,int armadura)//esto es una sobrecarga que no quiero que tenga scanner
    {
        System.out.println("tus Estadisticas actuales son:");
        System.out.println(Colores.verde() + "VIDA: " + Colores.reset() + vida);
        System.out.println(Colores.verde()+"ATQUE: "+ Colores.reset()+daniobase);
        System.out.println(Colores.verde()+"ARMADURA: "+ Colores.reset()+armadura);
    }







    public static int flechadelelegido() //HABILIDAD DEL ARQUERO
    {
           int ataqueespecial=1000000;
         return ataqueespecial;
    }
    public static int espadazodelelegido()
    {
        int ataqueespecial=0;
        ataqueespecial=1000;
        return ataqueespecial;
    }
    public static int llamaradadelfenix(int rolelegido)
    {

        int llamaradadelfenix=2000;
        return llamaradadelfenix;
    }
    public static int asesinatodemales(int rolelegido)
    {
        int critico=2;
        int daniocritico= Estadisticas.daniobasebendecido(rolelegido);
        int instintoasesion=critico*daniocritico;
        return instintoasesion;
    }




}
