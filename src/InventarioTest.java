
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventarioTest {

    @Test
    void testCalcularValorInventario() {
        Inventario inventario = new Inventario();
        inventario.añadirProducto(new Producto("B2", "Ratón", 5, 15.0));

        double valorEsperado = (10 * 20.0) + (5 * 15.0);
        double valorObtenido = inventario.calcularValorInventario();

        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void testAñadirProducto() {
        Inventario inventario = new Inventario();
        Producto p = new Producto("C3", "Monitor", 3, 150.0);

        inventario.añadirProducto(p);

        assertTrue(inventario.getProductos().contains(p));
    }

    @Test
    void testBuscarProductoPorId() {
        Inventario inventario = new Inventario();
        Producto p = new Producto("D4", "Impresora", 2, 120.0);
        inventario.añadirProducto(p);

        Producto resultado = inventario.buscarProductoPorId("D4");

        assertNotNull(resultado);
        assertEquals("Impresora", resultado.getNombre());
    }
}