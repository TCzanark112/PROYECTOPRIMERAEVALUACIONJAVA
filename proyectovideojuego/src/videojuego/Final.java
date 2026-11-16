package videojuego;
import java.util.Scanner;
public class Final
{
    public static void elfinal(int rolelegido, String nombre,String boss)
    {
        Scanner scanner=new Scanner(System.in);
        String reinhard= Colores.blanco()+"["+Colores.reset()+Colores.carmesi()+"REINHARD VAN ASTREA"+Colores.reset()+Colores.blanco()+"]"+Colores.reset();


        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                Decidís entrar y veis que dentro de la sala hay muchos tesoros, monedas, cofres, lleno de oro.
                Pero al final del todo lo que mas llama la atención es que hay unas escaleras hacia arriba tipo parecido a un altar.
                Arriba del todo hay un cofre, decidis subir y abrir el cofre, dentro del cofre hay una carta escrito en ceniza,
                en el que pone quien se ponga el anillo obtendra el poder de UN DIOS, pero a cambio perdera algo muy importante
                Firmado por...*esta la parte de la firma quemada
                Ves el anillo y ves que esta como glitcheado, como si no fuera de este mundo.
                Te parece algo extraño pero es la primera vez que ves un objeto de clase especial, asique supones que es normal""");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.morado()+"Grieff:"+Colores.reset()+" Cuidado con ese anillo, presiento un poder espeluznante");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.morado()+"Grieff:"+Colores.reset()+" ¿Me das el anillo?");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("¿Que quieres hacer?:");
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Coger y ponerte el anillo"+Colores.verde()+ "(1)"+Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Coger y darselo a Grieff"+Colores.verde()+ "(2)"+Colores.reset());
        Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Cogerlo y observarlo"+Colores.verde()+ "(3)"+Colores.reset());
        int numerofinal= Error.validacionnumero(scanner,1,3);
        if (numerofinal == 1) {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                    Coges el anillo y sientes el flujo del enorme poder, tu pelo se vuelve blanco y te sale unos simbolos en la frente.
                    Sientes que puedes con todo, destruirlo todo, derrotar a cualquiera que se te entrometa.
                    Pero la ligera consciencia que te queda te hace darte cuenta por un momento que estas perdiendo tus sentimientos
                    Poco a poco esa consciencia se consume y te vas quedando sin nada, pero a la vez sientes que la fuerza aumenta.
                    Pierdes tu consciencia y te vuelves loco, desatas tu furia sin sentido en todo lo que te rodea""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.morado() + "Grieff:" + Colores.reset() + "ya veo, te corrompio el mal.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                    Quería que fueramos compañeros, me parecias alguien muy interesante.*Lo dice suspirando*
                    Te voy a tener que derrotar.
                    *en este combate controlaras a Grieff""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.amarillo() + "BATALLA FINAL:" + Colores.morado() + "Grieff" + Colores.reset() + " VS " + Colores.rojo() + "Evil " + nombre + Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("----------------------------------------------------------------------------------------------------");

            boss = Colores.rojo() + nombre + Colores.reset();
            nombre="Griff";
            Combates.combate2(EstadisticasMalvado.vidaGrieff(),EstadisticasMalvado.armaduraGrief(),boss,nombre,reinhard);

        }
        else if (numerofinal == 2)
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
        Le entregas el anillo a Grieff. Al principio lo observa con curiosidad, pero en cuanto lo desliza en su dedo, la atmósfera de la sala cambia por completo.
        Un pulso de energía oscura estalla desde su mano, haciéndolo retroceder un paso mientras su respiración se vuelve pesada.
        Ves cómo su cabello comienza a tornarse blanco como la ceniza y unos símbolos oscuros emergen lentamente sobre su frente.
        Grieff se lleva una mano al rostro, intentando contener una risa baja y distorsionada que no parece suya.
        Poco a poco, el brillo cálido de su mirada se apaga, reemplazado por una frialdad vacía y una sed de destrucción absoluta.
        Ya no queda rastro de tu compañero; el mal lo ha consumido por entero.""");

            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.morado() + "Grieff:" + Colores.reset() + " Así que esto era lo que escondía este lugar... Qué poder tan absurdo.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(" Te mira por encima del hombro con una sonrisa carente de humanidad.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Lo siento "+nombre+" pero ya no necesito ir de la mano con nadie.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Voy a destruir todo lo que se interponga en mi camino... empezando por ti.");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"EVIL GRIEFF"+Colores.reset()+" VS "+Colores.amarillo()+nombre+Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("------------------------------------------------------------------------");
            boss=Colores.rojo()+"EVIL GRIEFF"+Colores.reset();
            Combates.combate1(rolelegido,nombre,EstadisticasMalvado.evildanio(),EstadisticasMalvado.evilvida(),EstadisticasMalvado.evilarmadura(),boss);
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
        Caes de rodillas sobre la piedra fría, escupiendo una bocanada de sangre mientras tu arma se te resbala de las manos.
        Tu cuerpo está al límite: tienes varias costillas rotas, cortes profundos recorriendo tus brazos y un dolor punzante en el pecho que apenas te deja respirar.
        La visión se te nubla por los bordes.
        A duras penas logras mantener los ojos abiertos mientras ves a Grieff acercarse con total indiferencia, intacto, envuelto en esa aura oscura y asfixiante.
        Pusiste cada gramo de tu voluntad y tus agallas en aquella lucha, pero la diferencia de poder era abismal; era completamente imposible derrotarlo así.""");

            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
        Justo cuando Grieff alza la mano para darte el golpe de gracia, el tiempo parece detenerse por una fracción de segundo.
        En medio de la oscuridad opresiva de la cueva, una brisa limpia e imposible acaricia tu rostro, disipando por un instante el olor a sangre y ceniza.
        Desde algún lugar más allá de las fronteras de este mundo, una mirada azul, serena y cargada de una nobleza absoluta, observa tu determinación.
        No pertenece a esta realidad, pero siempre que un héroe se niega a rendirse ante una calamidad imposible, su bendición cruza el velo para equilibrar la balanza.
        Un destello cálido, tan rojo como el fuego sagrado del alba, desciende en silencio y se funde directamente con tu pecho.""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
        De repente, el dolor desaparece.
        Tus heridas se cierran envueltas en un resplandor puro, tus fuerzas regresan multiplicadas y sientes una energía divina recorriendo cada fibra de tu cuerpo.
        Te pones en pie lentamente, empuñando tu arma con una firmeza nueva mientras Grieff retrocede un paso, sorprendido por el power up más ridiculo que ha presenciado.""");
            Combates.combate3(rolelegido,nombre,EstadisticasMalvado.evilvida(),EstadisticasMalvado.evilarmadura(),boss);
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
        Con un último golpe cargado de aquella luz sagrada, logras romper la defensa de Grieff y partir el anillo en mil pedazos.
        Un estallido cegador sacude toda la cueva, disipando al instante la oscuridad asfixiante que amenazaba con devorarlo todo.
        Grieff cae al suelo derrotado; su cabello recupera su color original y los símbolos malditos de su frente se desvanecen por completo.
        Apenas das un paso hacia él, el resplandor divino que te sostenía abandona tu cuerpo de golpe.
        El agotamiento extremo y el peso de todo el combate caen sobre ti de repente, y tu vista se funde a negro mientras te desplomas inconsciente sobre la roca fría.
        Sin que nadie en la superficie llegara a saberlo jamás, acababas de salvar a toda la humanidad de una calamidad que ni siquiera pertenecía a este mundo.
        Horas más tarde, un grupo de viajeros y aldeanos atraídos por el estruendo se adentran en la cueva, encontrándoos a ambos tendidos en el suelo.
        Con cuidado, cargan vuestros cuerpos heridos y os llevan hasta el pueblo más cercano para curaros y ponerlos a salvo.""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"TO BE CONTINUE"+Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Fin");
            System.exit(0);
        }
        else
        {
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        Observas el anillo y te da una mala vibra increible, lo tiras por ahi.
                        Griff: ¿Que era eso?""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(nombre+": nada, era un anillo que daba mucho mal rollo -.-");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        El anillo se cae entre los tesoros, y a su vez se va filtrando hasta caer en una grietas que habían.
                        Donde se pierde en el fondo del subsuelo, no se sabe si en un futuro alguien lo encontrara.""");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(nombre+": Madre mia cuantos teosoros, vamos a volvernos ricossss");
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("""
                        Con una sonrisa de oreja a oreja, os ponéis a llenar vuestras mochilas y bolsillos hasta que literalmente no cabe ni una moneda más.
                        Salís de la cueva cargados hasta los topes, ricos y sin haber tenido que salvar el mundo ni una sola vez, listos para seguir con vuestra aventura.""");

            Funcionparaquelaletrasalgadeunoenuno.imprimirlento(Colores.rojo()+"TO BE CONTINUE"+Colores.reset());
            Funcionparaquelaletrasalgadeunoenuno.imprimirlento("Fin");
            System.exit(0);
        }

    }

}
