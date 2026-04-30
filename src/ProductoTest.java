import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 * Clase de pruebas unitarias para la clase Producto.
 * Contiene tests que verifican el cálculo del valor total del producto.
 * 
 * @author TuNombre
 */
public class ProductoTest {

    /**
     * Prueba el cálculo del valor total del producto.
     * En este caso se utiliza una cantidad negativa para comprobar
     * el comportamiento del método calcularValor().
     */
    @Test
    void testCalcularValorProducto() {
        Producto p = new Producto("X1", "Altavoz", -5, 25.0);
        double valorEsperado = 4 * 25.0;
        double valorObtenido = p.calcularValor();

        extracted(valorEsperado, valorObtenido);
    }

    /**
     * Método auxiliar que encapsula la comparación entre el valor esperado
     * y el valor obtenido.
     *
     * @param valorEsperado valor que debería devolver el método
     * @param valorObtenido valor real devuelto por el método calcularValor()
     */
    private void extracted(double valorEsperado, double valorObtenido) {
        assertEquals(valorEsperado, valorObtenido);
    }
}
