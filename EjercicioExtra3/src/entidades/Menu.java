package entidades;

import java.util.Scanner;

public class Menu {
    boolean salir = false;
    int opcion;
    MarcaServicio marcaServicio = new MarcaServicio();

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    public void menu(){

        System.out.println("\t\t\t\t\t\t¡BIENVENIDO!");
        while (!salir){

            System.out.println("\n\t\t\t\t\t⌁⌁⌁⌁ MENÚ ⌁⌁⌁⌁" +
                    "\n\n1) Agregar una marca" +
                    "\n2) Mostrar lista" +
                    "\n3) Buscar marcas con stock menor a 3 unidades" +
                    "\n4) Buscar marcas con stock mayor a 10 unidades" +
                    "\n5) Salir");

            System.out.print("\nIngrese la opción deseada: ");

            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n\t⌁⌁ Ingrese los datos solicitados ⌁⌁\n");
                    marcaServicio.crearLista();

                    break;

                case 2:
                    System.out.println("\n\t⌁⌁ Mostrando todos los registros ⌁⌁\n");
                    marcaServicio.imprimirLista();

                    break;

                case 3:
                    System.out.println("\n\t⌁⌁ Resultado de la búsqueda: ⌁⌁\n");
                    marcaServicio.stockMenorA3();

                    break;

                case 4:
                    System.out.println("\n\t⌁⌁ Resultado de la búsqueda: ⌁⌁\n");
                    marcaServicio.stockMayorA10();

                    break;

                case 5:
                    System.out.println("\nHa seleccionado salir. Hasta la próxima!!");
                    salir = true;

                    break;

                default:
                    System.out.println("\nOpción inválida!");
            }

            if (!salir){
                System.out.print("\nOprima ENTER para volver al Menú");
                in.next();
            }
        }
    }





}
