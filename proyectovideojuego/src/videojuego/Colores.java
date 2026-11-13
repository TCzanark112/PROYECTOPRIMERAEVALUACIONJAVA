package videojuego;

public class Colores //meto en esta clase todos los Colores que queramos usar
{
    public static String rojo() //he creado una funcion rojo para no tener que poner el codigo ANSI del color rojo todo el rato
    {
        String rojo = "\u001B[31m"; //este es el codigo ANSI del color rojo
        return rojo;
    }

    public static String reset()
    {
        String reset="\u001B[0m";
        return reset;
    }
    public static String azul()
    {
        String azul="\u001B[34m";
        return azul;
    }
    public static String verde()
    {
    String verde = "\u001B[32m";
    return verde;
    }
    public static String amarillo()
    {
        String amarillo="\u001B[33m";
        return amarillo;
    }
    public static String morado()
    {
        String morado ="\u001B[35m";
        return morado;
    }

}
