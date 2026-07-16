package ejercicio_articulo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas Clase Articulo")
public class TestArticulo {

    @Test
    @DisplayName("Validar Control de Stock")
    void testManejoStock() {
        Articulo art = new Articulo("Teclado", 1500.0, 10);
        
        art.incrementarStock(5);
        assertEquals(15, art.getStock(), "❌ Error al incrementar stock.");

        art.decrementarStock(3);
        assertEquals(12, art.getStock(), "❌ Error al decrementar stock.");
    }
}