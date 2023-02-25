//-Una biblioteca necesita implementar un sistema en el que se puedan cargar libros. Para esto, tendremos una clase
//Libro con el titulo, autor y numero de la paginas. Implemente las clases y métodos necesarios para esta situación,
//📚 Teniendo en cuenta lo que se pide a continuación:
//• En el main deberemos tener un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y guardándolos
//en el objeto Libro.
//• Después, esa Libro se guarda una lista y se le pregunta al usuario si quiere crear otro libro o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas los libros.
//• Mostrar las libros mayores o iguales a 300 paginas.
//• Mostrar las libros menores a 150 paginas.

package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "\u2726 Título: " + titulo.toUpperCase() +
                "\nAutor: " + autor +
                "\nCant. Páginas: " + paginas;
    }
}