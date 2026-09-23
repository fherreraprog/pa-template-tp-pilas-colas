package tp3_ejercicio_nueve;

import estructuras.PilaInt;

/**
 * Trabajo Práctico N° 3 - Ejercicio 9.
 *
 * <p>Valida que los separadores {@code ()}, {@code {}} y {@code []} de una
 * expresión aritmética estén correctamente balanceados, utilizando una
 * {@link PilaInt} de caracteres codificados como enteros.</p>
 */
public class ValidadorSeparadores {

    /**
     * Determina si los separadores de la expresión dada están correctamente
     * colocados (abiertos y cerrados en el orden correspondiente).
     *
     * <p>Ejemplos:</p>
     * <ul>
     *   <li>{@code "[(a % b) * c]"} → correcto</li>
     *   <li>{@code "2 * (a + b)]] / 2.5 + x"} → incorrecto</li>
     *   <li>{@code "{(c - d) * [(c + a / t]"} → incorrecto</li>
     * </ul>
     *
     * @param expresion expresión a validar
     * @return {@code true} si los separadores están correctamente balanceados
     */
    public static boolean sonSeparadoresValidos(String expresion) {
        PilaInt aperturas = new PilaInt();
        for (int indice = 0; indice < expresion.length(); indice++) {
            char caracter = expresion.charAt(indice);
            if (esApertura(caracter)) {
                aperturas.meter(caracter);
            } else if (esCierre(caracter)) {
                if (aperturas.estaVacia() || !coinciden((char) aperturas.sacar(), caracter)) {
                    return false;
                }
            }
        }
        return aperturas.estaVacia();
    }

    private static boolean esApertura(char caracter) {
        return caracter == '(' || caracter == '{' || caracter == '[';
    }

    private static boolean esCierre(char caracter) {
        return caracter == ')' || caracter == '}' || caracter == ']';
    }

    private static boolean coinciden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '{' && cierre == '}')
                || (apertura == '[' && cierre == ']');
    }
}
