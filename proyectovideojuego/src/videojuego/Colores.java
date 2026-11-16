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
    public static String carmesi()
    {
        String carmesi ="\u001B[1;38;2;235;45;65m";
       return carmesi;
    }
    public static String blanco()
    {
        String blanco ="\u001B[1;38;2;240;248;255m";
        return blanco;
    }

}
