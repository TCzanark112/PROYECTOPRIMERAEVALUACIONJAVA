package videojuego;
import java.util.Scanner;

public class Combates {
    public static boolean combate1(int rolelegido, String nombre, int daniovieja, int vidavieja, int armaduravieja, String boss) {
        Scanner sc = new Scanner(System.in);
        int vidaprota = Estadisticas.vida(rolelegido);
        int danioprota = Estadisticas.daniobase(rolelegido);
        int armaduraprota = Estadisticas.armadura(rolelegido);
        boolean victoria = false;
        double reducciondedanio = 100.0 / (100 + armaduraprota); //si no pones el .0 se piensa que es un int y dependiendo de los numeros se quedan en 0
        int daniorealrecibido = (int) (daniovieja * reducciondedanio);
        double reducciondedanio2 = 100.0 / (100 + armaduravieja);
        int daniorealrecibido2 = (int) (danioprota * reducciondedanio2);
        do {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Elije un ataque: ataque basico(1) " + Respuestas.nombredehabilidades(rolelegido) + "(2)");
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces un ataque básico, le haces " + danioprota + " de danio");
                vidavieja = vidavieja - daniorealrecibido2;
                if (vidavieja > 0) { //para que no pegue muerta
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A" + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Bossvieja.fraseAtaque());
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+BossBandido.frasesatacando(daniovieja)+" de " + daniovieja + " de danio");
                    vidaprota = vidaprota - daniorealrecibido;
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidaprota + " de vida");
                }
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);
                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);

                }
            } else if (numero == 2) {
                switch (rolelegido) {
                    case 1:
                        int ataquearquero = Estadisticas.FlechaDeDios();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataquearquero + " de danio");
                        daniorealrecibido2 = (int) (ataquearquero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 2:
                        int ataqueguerrero = Estadisticas.ataqueconlaespada();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueguerrero + " de danio");
                        daniorealrecibido2 = (int) (ataqueguerrero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 3:
                        int subidaarmaduramago = Estadisticas.BENDICIONDELABRUJA(rolelegido);//le sube la armadura al mago
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te subes la armadura " + subidaarmaduramago);
                        armaduraprota = subidaarmaduramago + armaduraprota;
                        reducciondedanio = 100.0 / (100 + armaduraprota);
                        daniorealrecibido = (int) (daniovieja * reducciondedanio);
                        break;
                    case 4:
                        int ataqueasesino = Estadisticas.instintoasesion(rolelegido);
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueasesino + " de danio");
                        daniorealrecibido2 = (int) (ataqueasesino * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                }
                if (vidavieja > 0) { //para q no pegue muerta
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A " + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Bossvieja.fraseAtaque());
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+BossBandido.frasesatacando(daniovieja)+" de " + daniovieja + " de danio");                    vidaprota = vidaprota - daniorealrecibido;
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidaprota + " de vida");
                }
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);

                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);

                }

            }
        }
        while (vidaprota > 0 && vidavieja > 0);
        if (vidavieja <= 0) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "Has DERROTADO a " + boss + Colores.reset());
        }
        if (vidaprota <= 0) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("has muerto.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿quieres volver a intentarlo?" + Colores.verde() + "(1)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿quieres salir del programa?" + Colores.verde() + "(2)" + Colores.reset());
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("volviendolo a intentar");
            } else if (numero == 2) {
                System.exit(0);
            }

        } else if (vidaprota > 0) {
            boolean salida = false;
            while (!salida) {
                victoria = true;
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("muy bien, que quieres hacer ahora?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);
                salida = true;
                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);
                }
            }
        }

        return victoria;
    }
    public static boolean combate2(int rolelegido, String nombre, int daniovieja, int vidavieja, int armaduravieja, String boss) {
        Scanner sc = new Scanner(System.in);
        int vidaprota = Estadisticas.vida(rolelegido);
        int danioprota = Estadisticas.daniobase(rolelegido);
        int armaduraprota = Estadisticas.armadura(rolelegido);
        boolean victoria = false;
        double reducciondedanio = 100.0 / (100 + armaduraprota); //si no pones el .0 se piensa que es un int y dependiendo de los numeros se quedan en 0
        int daniorealrecibido = (int) (daniovieja * reducciondedanio);
        double reducciondedanio2 = 100.0 / (100 + armaduravieja);
        int daniorealrecibido2 = (int) (danioprota * reducciondedanio2);
        do {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Elije un ataque: ataque basico(1) " + Respuestas.nombredehabilidades(rolelegido) + "(2)");
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces un ataque básico, le haces " + danioprota + " de danio");
                vidavieja = vidavieja - daniorealrecibido2;
                if (vidavieja > 0) { //para que no pegue muerta
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A" + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(BossBandido.fraseAtaque());
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+BossBandido.frasesatacando(daniovieja)+" de " + daniovieja + " de danio");
                    vidaprota = vidaprota - daniorealrecibido;
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidaprota + " de vida");
                }
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);
                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);

                }
            } else if (numero == 2) {
                switch (rolelegido) {
                    case 1:
                        int ataquearquero = Estadisticas.FlechaDeDios();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataquearquero + " de danio");
                        daniorealrecibido2 = (int) (ataquearquero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 2:
                        int ataqueguerrero = Estadisticas.ataqueconlaespada();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueguerrero + " de danio");
                        daniorealrecibido2 = (int) (ataqueguerrero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 3:
                        int subidaarmaduramago = Estadisticas.BENDICIONDELABRUJA(rolelegido);//le sube la armadura al mago
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te subes la armadura " + subidaarmaduramago);
                        armaduraprota = subidaarmaduramago + armaduraprota;
                        reducciondedanio = 100.0 / (100 + armaduraprota);
                        daniorealrecibido = (int) (daniovieja * reducciondedanio);
                        break;
                    case 4:
                        int ataqueasesino = Estadisticas.instintoasesion(rolelegido);
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueasesino + " de danio");
                        daniorealrecibido2 = (int) (ataqueasesino * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                }
                if (vidavieja > 0) { //para q no pegue muerta
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A " + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(BossBandido.fraseAtaque());
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+BossBandido.frasesatacando(daniovieja)+" de " + daniovieja + " de danio");                    vidaprota = vidaprota - daniorealrecibido;
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidaprota + " de vida");
                }
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);

                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);

                }

            }
        }
        while (vidaprota > 0 && vidavieja > 0);
        if (vidavieja <= 0) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "Has DERROTADO a " + boss + Colores.reset());
        }
        if (vidaprota <= 0) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("has muerto.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿quieres volver a intentarlo?" + Colores.verde() + "(1)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿quieres salir del programa?" + Colores.verde() + "(2)" + Colores.reset());
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("volviendolo a intentar");
            } else if (numero == 2) {
                System.exit(0);
            }

        } else if (vidaprota > 0) {
            boolean salida = false;
            while (!salida) {
                victoria = true;
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("muy bien, que quieres hacer ahora?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);
                salida = true;
                if (stats == 1) {
                    Estadisticas.estadistica(vidaprota, danioprota, armaduraprota);
                }
            }
        }

        return victoria;
    }
}