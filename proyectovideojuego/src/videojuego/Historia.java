package videojuego;
import java.util.Scanner;

public class Historia {
    public static void introduccion() {
        Scanner scanner = new Scanner(System.in);
        boolean rolconfirmacion = false;
        int rolelegido = 0;
        String aceptar = "";
        String boss = "";
        String reinhard= Colores.blanco()+"["+Colores.reset()+Colores.carmesi()+"REINHARD VAN ASTREA"+Colores.reset()+Colores.blanco()+"]"+Colores.reset();
        //Menu
        Menu.menufinal();


        /*INTRODUCCION DE LA HISTORIA*/

        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Te despierta tu padre una mañana feliz y soleada en la aldea de fuentealvilla en la región sur del reino de los hombres.
                Aunque para el resto es un día normal tu estás ilusionado ya que es el día de tu cumpleaños número 16 lo que significa que legalmente ya puedes cumplir tu sueño,
                afiliarte al gremio de aventureros  y tu padre va a acompañarte para ello.
                Al salir de la casa bajais la calle mientras que tu madre se despide desde la ventana.
                El camino es tranquilo y agradable, no hace calor y el olor a pan recién hecho que sale de las casas vecinas acompaña el ambiente.
                Tras un rato caminando llegais a la taberna de aventureros y tu padre se despide de ti con un gran abrazo diciendote lo orgulloso que está de ti.
                Entras a la taberna y el olor a alcohol y sudor te sorprende - Bueno es lo que tiene un sitio sin ventilar lleno de bárbaros- suspiras para tus adentros.
                Te acercas a la barra y preguntas a la camarera, una clase de mestizo entre elfo y humano, que donde  hay que ir para unirte al gremio y te deriva a su compañero,
                un hombre alto y grande al que se le nota que los años de batallas constantes le han pasado factura y te explica que tienes que elegir una clase entre varias opciones""");
        while (!rolconfirmacion) { //bucle para hasta que confirme su eleccion
            rolelegido = Personajes.elegirRol(); //llamamos a la funcion y guardamos el numero elegido
            rolconfirmacion = Confirmacion.confirma(rolelegido); //aqui le damos el valor del metodo confirma que contiene el boolean y los textos que hemos puesto
        }
        Respuestas.respuesta1(rolelegido);
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(" *¿Te gustaría ver tus estadisiticas actuales?* ");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa " + Colores.verde() + "(1)" + Colores.reset() + " si quieres verlo");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Pulsa " + Colores.verde() + "(2)" + Colores.reset() + " si quieres continuar la Historia");
        int estadisticavida = Estadisticas.vida(rolelegido);
        int estadisticadanio = Estadisticas.daniobase(rolelegido);
        int estadisticarmadura = Estadisticas.armadura(rolelegido);
        Estadisticas.estadistica(scanner, estadisticavida, estadisticadanio, estadisticarmadura); //he metido el error dentro de Estadisticas para no tener que hacer mas variables en el main
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("VIEJO: Bueno... dime tu nombre para darte de alta como un verdadero aventurero");
        //le damos valor al scanner, dentro comprueba si es correcto lo que hemos introducido y nos devuelve un string
        String nombre = Personajes.nombre(scanner); //El string que nos devuelve lo guardamos en la variable nombre
        Respuestas.respuesta2(nombre, rolelegido); //respuesta del viejo
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                VIEJO: Bueno bienvenido al GREMIO DE AVENTUREROS.
                *Una vez equipado vas a buscar tu primera misión* ves en la pizarra de encargos y hay varios""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Todas estas misiones para un rango <S> estaría chupado, pero como tu eres un principiante, rango <F> son misiones muy complicadas");
        boolean ruta2 = false;
        while (!ruta2) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("ELIGE UNA DE ESTAS DOS MISIONES:");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("------------------------------------");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("--> nivel 3: EXTERMINA UN NIDO DE GOBLINS" + Colores.verde() + "(1)" + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("--> nivel 5: MATA A LA ORDA DE GOLEMS DE LAS LLANURAS DEL ESTE" + Colores.verde() + "(2)" + Colores.reset());
            int ruta = Error.validacionnumero(scanner);
            ruta2 = Confirmacion.confirmacion2(ruta);
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Ilusionado te dispones a la puerta y en ese momento te para una abuelita malrrollera,
                tiene aspecto descuidado y por el pelo graso que le tapa la cara solo puedes ver una verruga que le sobresale de la nariz,
                toda la pinta de bruja tiene, piensas para tus adentros. ”Por favor jovenzuelo, le ruego que rescate a mi gatito bigotitos,
                prometo que le compensaré por sus servicios”""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "-->nivel1: RESCATA A BIGOTITOS" + Colores.reset());
        Minijuego.gatito();
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Enhorabuena has conseguido salvar a BIGOTITOS");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Una vez rescatado el gato la bruja se le va la cabeza, debe haber tomado setas en mal estado, y trata de matarte.");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.azul() + "PRIMER COMBATE:" + Colores.reset() + Colores.amarillo() + nombre + Colores.reset() + " VS " + Colores.rojo() + "VIEJA LOKA" + Colores.reset());
        int vidavieja = Bossvieja.viejaVida();
        int viejadano = Bossvieja.viejaDano();
        int viejarmadura = Bossvieja.viejaArmadura();

        boss = Colores.rojo() + "la vieja loka" + Colores.reset();
        boolean pasa = false;
        while (!pasa) {
            pasa = Combates.combate1(rolelegido, nombre, viejadano, vidavieja, viejarmadura, boss);
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("RECIBES A BIGOTITOS");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Tras tremendo espectáculo se te acerca un señor misterioso aplaudiendo con túnica y capucha,
                “como ya ha anochecido no es raro que vaya así, puesto que hace frío” piensas,
                “Eso ha sido extraordinario muchacho, querrías trabajar para mi?”
                por su acento parece que es del norte pero no sabes muy bien si del reino del rey sol o de las tribus shaolin,
                 “soy un agente del rey demonio morthro  y quiero solicitar tus servicios para que nos guíes en una travesía a través del cañón Lugubre hasta las tierras Baldías,
                la recompensa obviamente será de su agrado ¿Aceptas?”
                escribe (si) o (no)""");
        aceptar = scanner.nextLine().trim();
        while (!aceptar.equalsIgnoreCase("si")) {
            if (aceptar.equalsIgnoreCase("no")) {
                String frase = Respuestas.grifingrogando();
                Funcionparaquelaletrasalgadeunoenuno.imprimirlento(frase);
            } else {
                Error.falloletras();
            }
            aceptar = scanner.nextLine().trim();
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Después de aceptar se presenta con el nombre de " + Colores.morado() + "Grieff" + Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                y se acerca a acariciar a “Tu noble compañero minino” a lo que bigotitos lo araña y sale corriendo mientras suelta un bufido""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("-----------------------------------------------------------------------------------------------");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("-----------------------------------------------------------------------------------------------");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Tras partir en la aventura con " + Colores.morado() + "Grieff" + Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Durante los primeros siete días, el mundo pareció detenerse. Caminaste bajo un cielo gris, con el único sonido de tus botas gastadas y el peso del silencio marcando las horas. 
                Cada jornada transcurría idéntica, un bucle de caminos vacíos y soledad donde parecía que nada iba a cambiar jamás.
                Pero al arrancar la segunda semana, el aire cambió de golpe. 
                Mientras caminais por las estrechas laderas del Cañón Lúgubre os emboscan y te ves  obligado a enfrentarte a un grupo de bandidos.""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Entre los dos derrotais a la mayoria de bandidos, pero derrepente ves a Grieff rodeado y tu te ves obligado a enfrentarte al BOSS Bandido tu solo");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.verde() + "COMBATE:" + Colores.reset() + Colores.amarillo() + nombre + Colores.reset() + " VS " + Colores.rojo() + "BOSS BANDIDO" + Colores.reset());
        boss = Colores.rojo() + " El Bandido" + Colores.reset();
        pasa = false;
        while (!pasa) {
            pasa = Combates.combate1(rolelegido, nombre, BossBandido.bandidoDano(), BossBandido.bandidoVida(), BossBandido.bandidoarmadura(), boss);
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Debido a la intensa pelea se forma un derrumbamiento y huyes con los supervivientes del grupo hasta una cueva.
                La salida se queda bloqueada, que haces:""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Quedarte quejandote" + Colores.verde() + "(1)" + Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Explorar la cueva" + Colores.verde() + "(2)" + Colores.reset());
        Minijuego.eleccion(scanner);//siempre hay que explorar
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Mientras explorais la cueva oscura os vais adentrando con una antorcha la cual gracias a ella podeis ver,
                tu te preguntas si estaran bien tus compañeros que se han quedado fuera descansando, pero derrepente un fuerte viento
                apaga la antorcha haciendo que tengais que cruzar la cueva a oscuras""");
        Minijuego.explorarcueva(scanner, rolelegido, nombre);
        if (rolelegido == 4) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                    Después de conseguir encontrar la puerta, gracias a tus habilidades de asesino consigues truncar la cerradura
                    y forzar la puerta""");
        } else {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                    Después de conseguir encontrar la puerta, gracias a las habilidades de Grieff romper la cerradura
                    y forzar la puerta""");
        }
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Al entrar dentro encontrais un enorme pasillo largo con columnas a los lados de color cuarzo.
                Con una alfombra roja de lineas amarillas en el suelo, como si os estuviera indicando hacia donde ir.
                Seguis el largo pasillo recto que estaba iluminado, pero estrañamente no habia ninguna antorcha al rededor,
                y era un sitio cerrado.
                Llegais al final del pasillo y hay una puerta, te das cuenta que todo el pasillo y la puerta esta rodeado de
                un aura magica, ese es el motivo por el cual parace todo iluminado pero no hay antorchas.
                PUERTA: SI QUEREIS ENTRAR A LA HABITACION DE MAHJNAR DEBEIS DEMOSTRAR QUE SOIS DIGNOS, teneis que resolver este
                rompecabezas(ahorcado), dentro guarda un tesoro muy poderoso""");

        Minijuego.ahorcado(rolelegido, nombre);

        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "Enhorabuena logro conseguido " + Colores.reset() + Colores.verde() + "*¿Es esto el fin?*" + Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                PUERTA: Porfin se rompe el hechizo, veo que no eres alguien normal, miles de aventureros lo han intentado
                por 100 años no habido nadie que lo pudiera completar, tu debes de ser el elegido.
                El elegido que dictaban las leyendas predicadas por el MESIAS MELKHOR""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                *Creo que esta flipando* piensas para tus adentros
                Al terminar de abrise la puerta ves como el hechizo se rompe y la voz de la puerta se va apagando lentamente.
                """);
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.morado() + "Grieff:" + Colores.reset() + " Buen trabajo " + nombre + " , entramos a ver?");

        Final.elfinal(rolelegido, nombre,boss);
        }
    }

