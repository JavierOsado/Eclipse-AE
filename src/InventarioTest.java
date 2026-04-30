import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventarioTest {

    @Test
    void testAñadirProducto() {
        Inventario inventario = new Inventario();
        Producto p = new Producto("A1", "Teclado", 3, 25.0);

        inventario.añadirProducto(p);

        assertTrue(inventario.getProductos().contains(p));
    }

    @Test
    void testBuscarProductoPorId() {
        Inventario inventario = new Inventario();
        Producto p = new Producto("B1", "Impresora", 2, 150.0);

        inventario.añadirProducto(p);

        Producto resultado = inventario.buscarProductoPorId("B1");

        assertNotNull(resultado);
        assertEquals("Impresora", resultado.getNombre());
    }

    @Test
    void testCalcularValorInventario() {
        Inventario inventario = new Inventario();

        inventario.añadirProducto(new Producto("A1", "Teclado", 3, 25.0)); // 75
        inventario.añadirProducto(new Producto("B1", "Ratón", 4, 50.0));   // 200

        double esperado = 275.0;

        assertEquals(esperado, inventario.calcularValorInventario());
    }
}
