package entidades;

public class Serie {
    private String titulo;
    private String genero;
    private int duracion;

    public Serie() {
    }

    public Serie(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\u2726 Título: " + titulo.toUpperCase() +
                "\nGénero: " + genero +
                "\nDuración: " + duracion + " minutos";
    }
}
