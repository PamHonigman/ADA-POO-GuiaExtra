package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class SerieServicio {
    private ArrayList<Serie> listaSeries;

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    public SerieServicio() {
        this.listaSeries = new ArrayList<>();
    }

    public SerieServicio(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public void crearSerie(){

        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre: ");
        String nombre = in.next();
        System.out.print("Genero: ");
        String genero = in.next();
        System.out.print("Duración (en minutos): ");
        int duracion = in.nextInt();

        Serie serie = new Serie(nombre, genero, duracion);

        añadirSerie(serie);
    }

    public void añadirSerie(Serie serie){
        this.listaSeries.add(serie);
    }

    public void imprimirLista(){
        System.out.println("\nSeries ingresadas hasta el momento: ");
        for (Serie serieAux : listaSeries) {
            System.out.println("\n" + serieAux);
        }
    }

    public void menores15Min(){
        for (Serie serieAux : listaSeries) {
            if (serieAux.getDuracion() <= 15){
                System.out.println("\n" + serieAux);
            }
        }
    }

    public void mayores40Min(){
        for (Serie serieAux : listaSeries) {
            if (serieAux.getDuracion() > 40){
                System.out.println("\n" + serieAux);
            }
        }
    }

    public void romance(){
        for (Serie serieAux : listaSeries) {
            if (serieAux.getGenero().equalsIgnoreCase("romance")){
                System.out.println("\n" + serieAux);
            } else {
                System.out.println("No hay coincidencias");
            }
        }
    }

    public void comedia(){
        for (Serie serieAux : listaSeries) {
            if (serieAux.getGenero().equalsIgnoreCase("comedia")){
                System.out.println("\n" + serieAux);
            } else {
                System.out.println("No hay coincidencias");
            }
        }
    }

    public void drama(){
        for (Serie serieAux : listaSeries) {
            if (serieAux.getGenero().equalsIgnoreCase("drama")){
                System.out.println("\n" + serieAux);
            } else {
                System.out.println("No hay coincidencias");
            }
        }
    }




}
