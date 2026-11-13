package videojuego;
import java.util.Random;
public class Respuestas
{
    public static void respuesta1(int rolelegido)
    {
        if(rolelegido==1)
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("VIEJO: Ahh con que CAZADOR, alguien astuto en un equipo es siempre valioso");
        }
        if(rolelegido==2)
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("VIEJO: Veo que estas fuerte, normal que hayas elegido GUERRERO, jaja, pero en mi prime te daba 5 vueltas");
        }
        if(rolelegido==3)
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("VIEJO: Un MAGO eh, eso es que eres alguien inteligente. Esos son los que más miedo me dan");
        }
        if(rolelegido==4)
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿VIEJO: Un ASESINO?, no me gustan los que atacan por la espalda");
        }
    }
    public static void respuesta2(String nombre,int rolelegido)
    {
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
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Un "+nombrerol+ " que se llama "+ Colores.amarillo()+nombre+ Colores.reset()+"...Interesante..");
    }
    public static String nombredehabilidades(int rolelegido)
    {
        String nombredehabilidades = "";
        if(rolelegido==1)
        {
            nombredehabilidades=("FLECHA DE DIOS");
        }
        if(rolelegido==2)
        {
            nombredehabilidades=("ATAQUE CON LA ESPADA");
        }
        if(rolelegido==3)
        {
            nombredehabilidades=("BENDICION DE LA BRUJA");
        }
        if(rolelegido==4)
        {
            nombredehabilidades=("INSTINTO ASESINO");
        }
        return nombredehabilidades;
    }
    public static String grifingrogando()
    {
        String[] frases={
               Colores.verde()+ "???:"+Colores.reset()+"Estás seguro? a mi jefe no le gustará eso",
                Colores.verde()+ "???:"+Colores.reset()+"Venga muchacho, será una gran aventura",
                Colores.verde()+ "???:"+Colores.reset()+"A veces debes hacer cosas que no te gusten, vienes?"
        };
        Random ramdon=new Random();
        int aleatorio=ramdon.nextInt(3);
        return frases[aleatorio];
    }
}
