package entidades;

import java.util.ArrayList;

public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private ArrayList<Mascota> listaMascotas;

    public Mascota() {
        this.listaMascotas = new ArrayList<>();
    }

    public Mascota(String nombre, String especie, String raza, int edad, ArrayList<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @Override
    public String toString() {
        return "NOMBRE: " +  nombre.toUpperCase() + "\nEspecie: " + especie +
                "\nRaza: " + raza + "\nEdad: " + edad + " años";
    }

    public void crearMascota(String nombre, String especie, String raza, int edad) {

        Mascota mascota = new Mascota();

        mascota.setNombre(nombre);
        mascota.setEspecie(especie);
        mascota.setRaza(raza);
        mascota.setEdad(edad);

        añadirMascota(mascota);
    }

    public void añadirMascota(Mascota mascota){
        this.listaMascotas.add(mascota);
    }

    public void mostrarLista(){
        System.out.println("\nMascotas guardadas hasta el momento: ");
        for (Mascota mascotaAux : listaMascotas) {
            System.out.println("\n" + mascotaAux);
        }
    }

    public void mascotasViejitas() {
        System.out.println("\n" + "Mascotas mayores a 6 años: ");
        for (Mascota mascotaAux : listaMascotas) {
            if (mascotaAux.getEdad() >= 6) {
                System.out.println("\n" + mascotaAux);
            } else {
                System.out.println("Ninguna mascota cumple cumple ese requisito");
            }
        }
    }

    public void mascotasPeques(){
        System.out.println("\n" + "Mascotas menores a 5 años: ");
        for (Mascota mascotaAux : listaMascotas) {
            if (mascotaAux.getEdad() < 5){
                System.out.println("\n" + mascotaAux);
            } else {
                System.out.println("Ninguna mascota cumple ese requisito");
            }
        }
    }

}

