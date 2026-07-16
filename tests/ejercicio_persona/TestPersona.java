package ejercicio_persona;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas Clase Persona")
public class TestPersona {

    @Test
    @DisplayName("Validar Constructor y Getters")
    void testConstructorYGetters() {
        Persona p = new Persona("Juan Pérez", 35123456);
        assertEquals("Juan Pérez", p.getNombre(), "❌ El nombre seteado no coincide.");
        assertEquals(35123456, p.getDni(), "❌ El DNI seteado no coincide.");
    }

    @Test
    @DisplayName("Validar Setters")
    void testSetters() {
        Persona p = new Persona("Temporal", 0);
        p.setNombre("Ana Gómez");
        p.setDni(40123456);
        assertEquals("Ana Gómez", p.getNombre(), "❌ El setter de Nombre falló.");
        assertEquals(40123456, p.getDni(), "❌ El setter de DNI falló.");
    }
}