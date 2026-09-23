package tp3_ejercicio_seis;

import estructuras.PilaInt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Pruebas Ejercicio 6 TP3 - Operaciones sobre pila")
public class TestEjercicio6 {

    /** Pila de prueba: fondo -> 10, 20, 30, 40, cima -> 50. */
    private PilaInt pilaDePrueba() {
        PilaInt pila = new PilaInt();
        pila.meter(10);
        pila.meter(20);
        pila.meter(30);
        pila.meter(40);
        pila.meter(50);
        return pila;
    }

    @Test
    @DisplayName("a) Segundo elemento eliminando los dos superiores")
    void testSegundoElementoEliminando() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.segundoElementoEliminando(pila);

        assertEquals(40, resultado, "❌ Debe devolver el segundo elemento desde la cima (40).");
        assertPilaCimaAFondo(pila, 30, 20, 10);
    }

    @Test
    @DisplayName("b) Segundo elemento sin modificar la pila")
    void testSegundoElementoSinModificar() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.segundoElementoSinModificar(pila);

        assertEquals(40, resultado, "❌ Debe devolver el segundo elemento desde la cima (40).");
        assertPilaCimaAFondo(pila, 50, 40, 30, 20, 10);
    }

    @Test
    @DisplayName("c) N-ésimo elemento eliminando los N superiores")
    void testEnesimoElementoEliminando() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.enesimoElementoEliminando(pila, 3);

        assertEquals(30, resultado, "❌ El tercer elemento desde la cima debe ser 30.");
        assertPilaCimaAFondo(pila, 20, 10);
    }

    @Test
    @DisplayName("d) N-ésimo elemento sin modificar la pila")
    void testEnesimoElementoSinModificar() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.enesimoElementoSinModificar(pila, 3);

        assertEquals(30, resultado, "❌ El tercer elemento desde la cima debe ser 30.");
        assertPilaCimaAFondo(pila, 50, 40, 30, 20, 10);
    }

    @Test
    @DisplayName("e) Elemento del fondo vaciando la pila")
    void testElementoFondoVaciando() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.elementoFondoVaciando(pila);

        assertEquals(10, resultado, "❌ El elemento del fondo debe ser 10.");
        assertTrue(pila.estaVacia(), "❌ La pila debe quedar vacía.");
    }

    @Test
    @DisplayName("f) Elemento del fondo sin modificar la pila")
    void testElementoFondoSinModificar() {
        PilaInt pila = pilaDePrueba();

        int resultado = Ejercicio6.elementoFondoSinModificar(pila);

        assertEquals(10, resultado, "❌ El elemento del fondo debe ser 10.");
        assertPilaCimaAFondo(pila, 50, 40, 30, 20, 10);
    }

    private void assertPilaCimaAFondo(PilaInt pila, int... esperados) {
        PilaInt auxiliar = new PilaInt();
        for (int esperado : esperados) {
            int actual = pila.sacar();
            assertEquals(esperado, actual, "❌ La pila no tiene el contenido esperado.");
            auxiliar.meter(actual);
        }
        assertTrue(pila.estaVacia(), "❌ La pila tiene elementos adicionales.");
        while (!auxiliar.estaVacia()) {
            pila.meter(auxiliar.sacar());
        }
    }
}
