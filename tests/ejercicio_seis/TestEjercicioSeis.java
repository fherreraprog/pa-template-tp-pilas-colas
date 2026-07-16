package ejercicio_seis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas Ejercicio 6 - Manejo de Arreglos")
public class TestEjercicioSeis {

    @Test
    @DisplayName("Validar flujo completo del arreglo")
    void testFlujoArreglo() {
        EjercicioSeis ej6 = new EjercicioSeis(3);

        assertTrue(ej6.ingresarNumero(10), "❌ Debería permitir ingresar elementos dentro del límite.");
        assertTrue(ej6.ingresarNumero(20));
        assertTrue(ej6.ingresarNumero(30));
        assertFalse(ej6.ingresarNumero(40), "❌ No debería permitir ingresar elementos en un arreglo lleno.");

        String esperado = "10, 20, 30";
        assertEquals(esperado, ej6.mostrarNumeros().trim(), "❌ El formato devuelto por mostrarNumeros no coincide.");

        ej6.vaciarArreglo();
        assertEquals(0, ej6.getCantidadActual(), "❌ Al vaciar, el contador de elementos debe volver a 0.");
        assertEquals("", ej6.mostrarNumeros().trim(), "❌ Mostrar números debería retornar vacío luego de limpiar.");
    }
}