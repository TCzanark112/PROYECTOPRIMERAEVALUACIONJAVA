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
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+BossBandido.frasesatacando(daniovieja)+" de " + daniovieja + " de danio");                  vidaprota = vidaprota - daniorealrecibido;
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



    public static void combate2(int vidavieja, int armaduravieja, String boss, String nombreprota,String reinhard) {
        Scanner sc = new Scanner(System.in);
        int vidaprota = EstadisticasMalvado.evilvida();
        int armaduraprota = EstadisticasMalvado.evilarmadura();
        double reducciondedanio = 100.0 / (100 + armaduraprota); //si no pones el .0 se piensa que es un int y dependiendo de los numeros se quedan en 0
        double reducciondedanio2 = 100.0 / (100 + armaduravieja);

            do {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Quieres atacar?" + Colores.verde() + "(1)" + Colores.reset() + " o prefieres ver tus estadisiticas" + Colores.verde() + "(2)" + Colores.reset());
                int numero = Error.validacionnumero(sc);
                if (numero == 1) {
                    int daniovieja2 = EstadisticasMalvado.danioGrieff();
                    int daniorealvieja = (int) (daniovieja2 * reducciondedanio);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + EstadisticasMalvado.frasesGrief(daniovieja2) + "Le haces " + daniorealvieja + " de daño");
                    vidaprota = vidaprota - daniorealvieja;
                    if (vidaprota > 0) {
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A" + boss + " le queda " + vidaprota + " de vida");
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                        int danioprota = EstadisticasMalvado.evildanio();
                        int danioprotareal = (int) (danioprota * reducciondedanio2);
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace " + EstadisticasMalvado.evilfrase(danioprota) + " de " + danioprota + " de danio");
                        vidavieja = vidavieja - danioprotareal;
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidavieja + " de vida");
                    }
                } else if (numero == 2) {
                    EstadisticasMalvado.estadisticagrieff(vidavieja, EstadisticasMalvado.danioGrieff(), armaduravieja);
                }
            } while (vidavieja > 0 && vidaprota > 0);

        {
            if(vidavieja>0)
            {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Has derrotado a evil"+boss+", no me lo esperaba");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Enhorabuena has completado el juego.");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("To be continue");
                System.exit(0);
            } else if (vidaprota > 0) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te han derrotado");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("La feroz batalla concluye con la victoria de "+Colores.rojo()+boss+Colores.reset());
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                       Grieff puso cada gramo de su voluntad y sus agallas en aquella lucha, 
                       pero el destino ya había firmado la victoria del enemigo mucho antes de que empezara.
                       Hay batallas que son inganables y este era una de ellas.
                       Tras matar a Grieff el anillo absorbio sus poderes y lo volvio más fuerte.
                       Se ve que el anillo era uno de las 4 Calamidades que iban a destruir el mundo.
                       Cuanto mas tiempo el anillo estaba con un usuario, más fuerte se volvia el usuario de manera exponencial.
                       Aparte de absorber los poderes de la gente que asesinaba.
                       En la leyenda se contaba que llegaria a un punto donde acabaria con toda vida existente en la Tierra.
                       Realmente con solo un par de horas llegaria a destruir la Tierra.
                       """);
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("------------------------------------------------------------------------------------------------------------");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("             ");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("             ");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("             ");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("             ");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Justo después de que "+boss+"diera un paso al exterior de la cueva");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Con su mera presencia asesino todo ser vivo que habia dentro de un diametro de 1km");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                       El cielo, desgarrado por la catástrofe y teñido de un negro antinatural, pareció contener el aliento. El mundo entero temblaba al borde del colapso,
                       a apenas un instante de que la humanidad fuera borrada de la existencia por un poder que nadie en esta realidad podía detener.
                       Entonces, el aire se volvió ligero.
                       Una brisa limpia, imposible en medio de tanta destrucción, barrió las cenizas del campo de batalla. 
                       El estruendo ensordecedor de la calamidad se apagó de golpe, como si el propio mundo inclinara la cabeza ante una presencia superior. 
                       Desde el umbral donde las realidades se cruzan, descendió una silueta envuelta en un aura pura e inmaculada.
                       Sus pasos no hacían ruido al tocar la tierra quebrada, y el brillo de su cabello rojo intenso cortó la oscuridad como el primer rayo del alba tras una tormenta eterna.
                       No pertenecía a este mundo, pero había acudido a su llamado para corregir la anomalía, tal como lo había hecho en innumerables historias antes que esta.
                       El caballero se detuvo a unos metros de distancia, observando el desastre con una serenidad absoluta, y dejó escapar un suspiro cargado de sincera pesadumbre antes de hablar.""");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(reinhard+": Es una verdadera lástima. De verdad lo es.");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        A pesar de la magnitud de la catástrofe que lo rodeaba, su postura era impecable, desprovista de cualquier rastro de ira o arrogancia.
                        Su mirada azul, clara y profunda, se posó directamente sobre ti con una mezcla de compasión y deber inquebrantable.""");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(reinhard+": Incluso estando al borde del abismo, puedo sentirlo en ti.");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        No eras una mala persona.
                        Antes de que esta oscuridad te corrompiera, tenías un corazón noble, alguien capaz de proteger a los demás en lugar de destruirlos.
                        Me habría gustado conocerte en aquel entonces... quizás habríamos podido ser buenos amigos.
                        
                        Llevó una mano con naturalidad hacia la empuñadura de su espada.
                        En ese instante, la atmósfera entera pareció rendirse ante él; no había duda, no había incertidumbre, solo la certeza absoluta de un desenlace que ya estaba escrito.
                        """);
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(reinhard+": Sin embargo, no puedo permitir que des un paso más.");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        
                        " Mi deber es salvaguardar el equilibrio de este mundo y proteger las vidas de quienes lo habitan." +
                        " Perdóname, pero esta anomalía termina aquí.
                        """);
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"TO BE CONTINUE"+Colores.reset());
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("fin del juego");
                System.exit(0);

            }
        }

    }



    public static void combate3(int rolelegido, String nombre, int vidavieja, int armaduravieja, String boss) {
        Scanner sc = new Scanner(System.in);
        int vidaprota = Estadisticas.vidabendecido(rolelegido);
        int danioprota = Estadisticas.daniobasebendecido(rolelegido);
        int armaduraprota = Estadisticas.armadurabendecida(rolelegido);
        boolean victoria = false;
        double reducciondedanio = 100.0 / (100 + armaduraprota); //si no pones el .0 se piensa que es un int y dependiendo de los numeros se quedan en 0

        double reducciondedanio2 = 100.0 / (100 + armaduravieja);
        int daniorealrecibido2 = (int) (danioprota * reducciondedanio2);
        do {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Elije un ataque: Golpe de voluntad(1) " + Respuestas.nombredehabilidadesbendecidas(rolelegido) + "(2)");
            int numero = Error.validacionnumero(sc);
            if (numero == 1) {
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces un ataque básico, le haces " + danioprota + " de danio");
                vidavieja = vidavieja - daniorealrecibido2;
                if (vidavieja > 0) { //para que no pegue muerta
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A" + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    int daniovieja = EstadisticasMalvado.evildanio();
                    int daniorealrecibido = (int) (daniovieja * reducciondedanio);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+EstadisticasMalvado.evilfrase(daniovieja)+" de " + daniovieja + " de danio");
                    vidaprota = vidaprota - daniorealrecibido;
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Te deja a " + vidaprota + " de vida");
                }
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("quieres ver tus Estadisticas actuales?");
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Si(1) o No(2)");
                int stats = Error.validacionnumero(sc);
                if (stats == 1) {
                    Estadisticas.estadisticaBendecida(vidaprota, danioprota, armaduraprota);

                }
            } else if (numero == 2) {
                switch (rolelegido) {
                    case 1:
                        int ataquearquero = Estadisticas.flechadelelegido();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataquearquero + " de danio");
                        daniorealrecibido2 = (int) (ataquearquero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 2:
                        int ataqueguerrero = Estadisticas.espadazodelelegido();
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueguerrero + " de danio");
                        daniorealrecibido2 = (int) (ataqueguerrero * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                    case 3:

                        int llamaradadelfenix = Estadisticas.llamaradadelfenix(rolelegido);
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + llamaradadelfenix + " de danio");
                        daniorealrecibido2 = (int) ( llamaradadelfenix* reducciondedanio2);

                        break;
                    case 4:
                        int ataqueasesino = Estadisticas.asesinatodemales(rolelegido);
                        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Le haces " + ataqueasesino + " de danio");
                        daniorealrecibido2 = (int) (ataqueasesino * reducciondedanio2);
                        vidavieja = vidavieja - daniorealrecibido2;
                        break;
                }
                if (vidavieja > 0) { //para q no pegue muerta
                    int daniovieja = EstadisticasMalvado.evildanio();
                    int daniorealrecibido = (int) (daniovieja * reducciondedanio);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("A " + boss + " le queda " + vidavieja + " de vida");
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Es el turno de ataque de" + boss);
                    Funcionparaquelaletrasalgadeunoenuno.imprimirlento(boss + " te hace "+EstadisticasMalvado.evilfrase(daniovieja)+" de " + daniovieja + " de danio");                  vidaprota = vidaprota - daniorealrecibido;
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
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("has muerto");


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
                    Estadisticas.estadisticaBendecida(vidaprota, danioprota, armaduraprota);
                }
            }
        }
    }
}