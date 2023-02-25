package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class MarcaServicio {

    ArrayList<Marca> listaMarcas;
    String marcas;
    int stock;
    Marca marca;

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    public MarcaServicio() {
        this.listaMarcas = new ArrayList<>();
    }

    public MarcaServicio(ArrayList<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    public void crearLista() {

        System.out.print("Marca: ");
        marcas = in.next();
        System.out.print("Cantidad de existencias: ");
        stock = in.nextInt();

        marca = new Marca(marcas, stock);

        this.listaMarcas.add(marca);

        System.out.println("Los datos fueron cargados exitosamente!");
    }

    public void imprimirLista() {
        for (Marca marcasAux : listaMarcas) {
            System.out.println(marcasAux);
        }
    }

    public void stockMenorA3() {
        for (Marca marcasAux : listaMarcas) {
            if (marcasAux.getStock() < 3) {
                System.out.println(marcasAux);
            }
        }
    }

    public void stockMayorA10() {
        for (Marca marcasAux : listaMarcas) {
            if (marcasAux.getStock() > 10) {
                System.out.println(marcasAux);
            }
        }
    }
}