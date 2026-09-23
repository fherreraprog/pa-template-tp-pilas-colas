package tp3_ejercicio_nueve;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Pruebas Ejercicio 9 TP3 - Validación de separadores")
public class TestValidadorSeparadores {

    @Test
    @DisplayName("Expresión con separadores correctamente balanceados")
    void testExpresionValidaDelEnunciado() {
        assertTrue(ValidadorSeparadores.sonSeparadoresValidos("[(a % b) * c]"),
                "❌ La expresión del enunciado debería ser válida.");
    }

    @Test
    @DisplayName("Expresión con cierre de más")
    void testExpresionConCierreDeMas() {
        assertFalse(ValidadorSeparadores.sonSeparadoresValidos("2 * (a + b)]] / 2.5 + x"),
                "❌ Debería detectar el cierre ']' sobrante.");
    }

    @Test
    @DisplayName("Expresión con separadores sin cerrar")
    void testExpresionSinCerrar() {
        assertFalse(ValidadorSeparadores.sonSeparadoresValidos("{(c - d) * [(c + a / t]"),
                "❌ Debería detectar separadores que quedan abiertos.");
    }

    @Test
    @DisplayName("Expresión sin separadores")
    void testExpresionSinSeparadores() {
        assertTrue(ValidadorSeparadores.sonSeparadoresValidos("a + b * c"),
                "❌ Una expresión sin separadores debe considerarse válida.");
    }

    @Test
    @DisplayName("Separadores anidados y mezclados correctamente")
    void testSeparadoresAnidadosCorrectos() {
        assertTrue(ValidadorSeparadores.sonSeparadoresValidos("{[(a + b) * c] - d}"),
                "❌ Los separadores anidados correctamente deberían ser válidos.");
    }

    @Test
    @DisplayName("Separadores de distinto tipo cruzados")
    void testSeparadoresCruzados() {
        assertFalse(ValidadorSeparadores.sonSeparadoresValidos("(a + [b) * c]"),
                "❌ Debería detectar separadores de distinto tipo cruzados entre sí.");
    }
}
