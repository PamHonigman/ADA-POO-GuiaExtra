package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroServicios {

    ArrayList<Libro> listaLibros;
    Libro libro;
    Scanner in = new Scanner(System.in).useDelimiter("\n");

    public LibroServicios() {
        this.listaLibros = new ArrayList<>();
    }

    public LibroServicios(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void crearLibro() {

        System.out.println(" - AGREGAR LIBRO - ");
        System.out.print("Título: ");
        String titulo = in.next();
        System.out.print("Autor: ");
        String autor = in.next();
        System.out.print("Cantidad de páginas: ");
        int paginas = in.nextInt();

        libro = new Libro(titulo, autor, paginas);

        añadirLibro(libro);
    }

    public void añadirLibro(Libro libro) {
        this.listaLibros.add(libro);
    }

    public void imprimirLista() {
        System.out.println("\n - MOSTRAR LISTA - ");
        for (Libro librosAux : listaLibros) {
            System.out.println("\n" + librosAux);
        }
    }

    public void mayores300() {
        for (Libro librosAux : listaLibros) {
            if (librosAux.getPaginas() >= 300)
            System.out.println("\n" + librosAux);
        }
    }

    public void menores150() {
        for (Libro librosAux : listaLibros) {
            if (librosAux.getPaginas() < 150)
                System.out.println("\n" + librosAux);
        }
    }
}
