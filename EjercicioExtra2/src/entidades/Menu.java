package entidades;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    LibroServicios libroServicios = new LibroServicios();
    boolean salir = false;
    int opcion;

    public void menu(){

        System.out.println("** Bienvenido al sistema de carga de libros **");

        while (!salir){
            System.out.println("\nMenú: " +
                    "\n1) Agregar un libro" +
                    "\n2) Mostrar lista" +
                    "\n3) Buscar libros con 300 páginas o menos" +
                    "\n4) Buscar libros con más de 150 páginas" +
                    "\n5) Salir");
            System.out.print("\nA continuación ingrese su selección: ");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("");
                    libroServicios.crearLibro();
                    System.out.println("\nEl libro ha sido añadido exitosamente!");

                    break;

                case 2:
                    libroServicios.imprimirLista();

                    break;

                case 3:
                    System.out.println("\n- Resultado de la búsqueda: -");
                    libroServicios.mayores300();

                    break;

                case 4:
                    System.out.println("\n- Resultado de la búsqueda: -");
                    libroServicios.menores150();

                    break;

                case 5:
                    System.out.println("\nHa seleccionado salir. Hasta la próxima!!");
                    salir = true;

                    break;

                default:
                    System.out.println("\nOpción inválida!");
            }

            if (!salir){
                System.out.print("\nOprima ENTER para volver al Menú Principal");
                in.next();
            }
        }
    }
}
