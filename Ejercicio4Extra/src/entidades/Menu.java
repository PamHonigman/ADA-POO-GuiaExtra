package entidades;

import java.util.Scanner;

public class Menu {

    SerieServicio serieServicio = new SerieServicio();

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    String fin = "";
    int opcion;

    public void menu(){

        do{

            System.out.println("** Bienvenido al sistema de carga de series **" +
                    "\nSeleccione una opción: " +
                    "\n1) Agregar una serie " +
                    "\n2) Mostrar lista" +
                    "\n3) Salir");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    serieServicio.crearSerie();
                    System.out.println("La serie ha sido añadida exitosamente!");

                    System.out.println("Para volver al menú presione Y, de lo contrario presione cualquier letra");
                    fin = in.next();

                break;

                case 2:
                    serieServicio.imprimirLista();
                    System.out.println("Para volver al menú presione Y, de lo contrario presione cualquier letra");
                    fin = in.next();

                    break;

                case 3:
                    System.out.println("Ha seleccionado salir. Hasta la próxima!!");
                    fin = "n";

                    break;

                default:
                    System.out.println("Ingrese una opción válida");

            }

        }while (fin.equalsIgnoreCase("y"));

        serieServicio.imprimirLista();

        System.out.println("\nSeries con duración menor a 15 minutos: ");
        serieServicio.menores15Min();

        System.out.println("\nSeries con duración mayor a 40 minutos: ");
        serieServicio.mayores40Min();

        System.out.println("\nSeries de género ROMANCE: ");
        serieServicio.romance();

        System.out.println("\nSeries de género COMEDIA: ");
        serieServicio.comedia();

        System.out.println("\nSeries de género DRAMA: ");
        serieServicio.drama();












    }
}
