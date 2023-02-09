package entidades;

import java.util.Scanner;

public class Menu {

    Mascota mascota = new Mascota();

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    String fin = "";
    int opcion;

    public void menu() {

        System.out.println("************ Bienvenido al sistema de carga de mascotas ************");

        do {
            System.out.println("Seleccione una opción:" +
                    "\n1. Agregar una mascota" +
                    "\n2. Mostrar lista" +
                    "\n3. Salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("- INGRESE LOS DATOS SOLICITADOS -");
                    System.out.println("Nombre de la mascota: ");
                    String nombre = in.next();
                    System.out.println("Especie: ");
                    String especie = in.next();
                    System.out.println("Raza: ");
                    String raza = in.next();
                    System.out.println("Edad (en años):");
                    int edad = in.nextInt();

                    mascota.crearMascota(nombre, especie, raza, edad);
                    System.out.println("La mascota ha sido guardada exitosamente!");

                    System.out.println("Para volver al menú presione Y, de lo contrario presione cualquier letra");
                    fin = in.next();

                    break;

                case 2:
                    mascota.mostrarLista();

                    System.out.println("Para volver al menú presione Y, de lo contrario presione cualquier letra");
                    fin = in.next();

                    break;

                case 3:
                    System.out.println("Ha seleccionado salir. Hasta la próxima!!");
                    fin = "n";

                    break;

                default:
                    System.out.println("Seleccione una opción válida");
            }

        } while (fin.equalsIgnoreCase("y"));

        mascota.mostrarLista();
        mascota.mascotasViejitas();
        mascota.mascotasPeques();




    }


}
