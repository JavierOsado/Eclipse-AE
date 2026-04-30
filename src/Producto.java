public class Producto {

    private String id;
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Producto(String id, String nombre, int cantidad, double precioUnitario) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double calcularValor() {
        return cantidad * precioUnitario;
    }
}
