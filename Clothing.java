public class Clothing {
    private String descripcion;
    private double precio;
    private String tamanio;
    public final static double min_Price=10.0;
    public final static double tax_rate=0.2;

    public Clothing(String descripcion, double precio, String tamanio) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    public Clothing() {
        this.descripcion = "Remera";
        this.precio = 400;
        this.tamanio = "M";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio + (precio*tax_rate);
    }

    public void setPrecio(double precio) {
        this.precio = (precio>=min_Price)?precio:min_Price;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
