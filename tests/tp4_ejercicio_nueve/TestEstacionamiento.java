package tp4_ejercicio_nueve;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Pruebas Ejercicio 9 TP4 - Estacionamiento en fila")
public class TestEstacionamiento {

    @Test
    @DisplayName("Ingresar autos reduce el espacio disponible")
    void testIngresoDeAutos() {
        Estacionamiento estacionamiento = new Estacionamiento();

        assertEquals(10, estacionamiento.espacioDisponible(), "❌ El estacionamiento debe iniciar vacío (10 lugares).");

        estacionamiento.entrar("AA111AA");
        estacionamiento.entrar("BB222BB");

        assertEquals(8, estacionamiento.espacioDisponible(), "❌ Deben quedar 8 lugares tras ingresar 2 autos.");
    }

    @Test
    @DisplayName("Salir el auto ubicado en el extremo no requiere movimientos")
    void testSalidaDelAutoEnElExtremo() {
        Estacionamiento estacionamiento = new Estacionamiento();
        estacionamiento.entrar("AA111AA");
        estacionamiento.entrar("BB222BB");

        estacionamiento.salir("BB222BB");

        assertEquals(0, estacionamiento.getMovimientos(), "❌ No debería haber movimientos si el auto está en el extremo.");
        assertEquals(9, estacionamiento.espacioDisponible(), "❌ Debe quedar 1 auto adentro (9 lugares libres).");
    }

    @Test
    @DisplayName("Salir un auto intermedio mueve y reubica los autos de encima")
    void testSalidaDeAutoIntermedio() {
        Estacionamiento estacionamiento = new Estacionamiento();
        estacionamiento.entrar("AA111AA"); // fondo de la fila
        estacionamiento.entrar("BB222BB");
        estacionamiento.entrar("CC333CC"); // extremo de la fila

        String resultado = estacionamiento.salir("AA111AA");

        assertTrue(resultado.contains("AA111AA"), "❌ El mensaje debe mencionar la patente del auto que sale.");
        assertEquals(4, estacionamiento.getMovimientos(),
                "❌ Deben moverse 2 autos hacia afuera y volver a entrar (4 movimientos en total).");
        assertEquals(8, estacionamiento.espacioDisponible(), "❌ Deben quedar 2 autos adentro (8 lugares libres).");
    }

    @Test
    @DisplayName("Salir un auto que no está en el estacionamiento")
    void testSalidaDeAutoInexistente() {
        Estacionamiento estacionamiento = new Estacionamiento();
        estacionamiento.entrar("AA111AA");

        String resultado = estacionamiento.salir("ZZ999ZZ");

        assertTrue(resultado.toLowerCase().contains("no"),
                "❌ Debe informarse que el auto no se encuentra en el estacionamiento.");
        assertEquals(9, estacionamiento.espacioDisponible(), "❌ El estacionamiento no debe modificarse.");
    }

    @Test
    @DisplayName("No se admiten autos cuando el estacionamiento está lleno")
    void testEstacionamientoLleno() {
        Estacionamiento estacionamiento = new Estacionamiento();
        for (int i = 0; i < 10; i++) {
            estacionamiento.entrar("PAT" + i);
        }

        assertEquals(0, estacionamiento.espacioDisponible(), "❌ El estacionamiento debe estar lleno (0 lugares).");

        String resultado = estacionamiento.entrar("NN000NN");

        assertTrue(resultado.toLowerCase().contains("no hay espacio") || resultado.toLowerCase().contains("lleno"),
                "❌ Debe rechazar el ingreso e informar que no hay espacio.");
        assertEquals(0, estacionamiento.espacioDisponible(), "❌ El estacionamiento debe seguir lleno.");
    }
}
