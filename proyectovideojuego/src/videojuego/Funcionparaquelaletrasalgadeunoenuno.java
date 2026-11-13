package videojuego;

public class Funcionparaquelaletrasalgadeunoenuno {
    public static void imprimirlento(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i)); //usamos el print para que no salte de linea
            try { //ejecuta este bloque de codigo, que hace que el programa se pause 10 milisegundos
                Thread.sleep(1);//ponemos thread, es la ruta por el que el ordenador va ejecutandose
            } catch (InterruptedException e) //si se produce un error se guarda en la varibale e
            {
                Thread.currentThread().interrupt(); //esto sirve para dejar constancia si ha habido alguna interrupcion
            }
        }
        System.out.println(); //limpiamos el codigo
    }
}

