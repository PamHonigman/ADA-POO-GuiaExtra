package entidades;

public class Marca {

    private String marcas;
    private int stock;

    public Marca() {
    }

    public Marca(String marcas, int stock) {
        this.marcas = marcas;
        this.stock = stock;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "» Marca: " + marcas.toUpperCase() + " - Stock: " + stock + " u.";
    }
}
