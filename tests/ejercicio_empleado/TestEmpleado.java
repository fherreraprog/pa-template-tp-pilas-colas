package ejercicio_empleado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas Clase Empleado")
public class TestEmpleado {

    @Test
    @DisplayName("Validar Sueldo Neto (Deducción del 17%)")
    void testSueldoNeto() {
        Empleado emp = new Empleado("E-4512", 100000.0);
        assertEquals(83000.0, emp.calcularSueldoNeto(), 0.01, "❌ El cálculo del sueldo neto (Sueldo - 17%) es incorrecto.");
    }
}