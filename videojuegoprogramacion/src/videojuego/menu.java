package videojuego;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class menu {
    public static void menu(){

        parte1historia historia = new parte1historia();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean valido = false;

        String seleccionarrolpersonaje = "NINGUNO";
        String Username;
        String[] roles = {"CAZADOR", "GUERRERO", "MAGO", "ASESINO", "PEREGRINO ERRANTE"};

        int intentosseleccionrol = 3;

        do {
            System.out.println("-------->MENU PRINCIPAL<--------");
            System.out.println("IR A LA HISTORIA (1)");
            System.out.println("SELECCIONAR ROL (ACTUAL: " + seleccionarrolpersonaje + ")(2)");
            System.out.println("CAMBIAR NOMBRE DE USUARIO (3)");
            System.out.println("SALIR DEL JUEGO (4)");
            int seleccionopcionmenuprincipal = scanner.nextInt();
            if (seleccionopcionmenuprincipal != 1 && seleccionopcionmenuprincipal != 2 && seleccionopcionmenuprincipal != 3 && seleccionopcionmenuprincipal != 4){
                System.out.println("esa opcion no existe");
            }else if (seleccionopcionmenuprincipal == 1){

                while (true){

                    System.out.println("has seleccionado ir a la historia");
                    System.out.println("cargando...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                    }
                    historia.historia();
                    break;
                }

            } else if (seleccionopcionmenuprincipal == 2) {

                while (true){
                    System.out.println("has seleccionado cambiar de rol");
                    System.out.println("recuerda que el cambio de rol es aleatorio");
                    System.out.println("te quedan " + intentosseleccionrol + " intentos");
                    System.out.println("quieres cambiar de rol");
                    System.out.println("   si(1)           no(2)");
                    int opciondeseguridadderol = scanner.nextInt();
                    if (opciondeseguridadderol != 1 && opciondeseguridadderol != 2){
                        System.out.println("esa opcion no vale");
                    } else if (opciondeseguridadderol == 2) {
                        break;
                    }else {

                        if (intentosseleccionrol <= 0){
                            System.out.println("no te quedan intentos");
                            break;
                        }else {
                            System.out.println("tienes un intento menos");
                            --intentosseleccionrol;
                            int numerodentrodelarray = random.nextInt(roles.length);
                            seleccionarrolpersonaje = roles[numerodentrodelarray];
                            System.out.println("tu nuevo rol es: " + seleccionarrolpersonaje);
                            break;
                        }

                    }


                }

            } else if (seleccionopcionmenuprincipal == 3) {

                while (true){

                    System.out.println("has seleccionado cambiar el nombre de usuario");
                    System.out.println("¿estas seguro de que quieres cambiarlo?");
                    System.out.println("    si(1)                 no(2)");
                    int opciondeseguridaddeusername = scanner.nextInt();
                    if (opciondeseguridaddeusername != 1 && opciondeseguridaddeusername != 2){

                        System.out.println("eso no es una opcion");

                    } else if (opciondeseguridaddeusername == 2) {
                        break;
                    }else{

                        System.out.println("introduce el nuevo nombre de usuario");
                        scanner.nextLine();
                        Username = scanner.nextLine();
                        System.out.println("tu nuevo nombre de usuario es: " + Username);
                        
                    }

                }

            }else {

                System.out.println("¿seguro que quieres salir del juego?");
                System.out.println("    si(1)         no(2)        ");
                int opciondeseguridadsalirjuego = scanner.nextInt();
                if (opciondeseguridadsalirjuego != 1 && opciondeseguridadsalirjuego != 2){
                    System.out.println("esa opcion no existe");
                } else if (opciondeseguridadsalirjuego == 1) {
                    System.out.println("saliendo del juego");
                    valido = true;
                }else {

                    System.out.println("no se ha salido del juego");

                }


            }


        }while(!valido);


    }
}
