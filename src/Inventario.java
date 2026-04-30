import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void añadirProducto(Producto p) {
        if (p.getCantidad() < 0) {
            throw new IllegalArgumentException("No se pueden añadir productos con cantidad negativa");
        }
        productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularValor();
        }
        return total;
    }
}
