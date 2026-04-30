import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    void testCalcularValorProducto() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("X1", "Altavoz", -5, 25.0);
        });
    }
}
