package tp4_ejercicio_nueve;

import java.util.Objects;

/**
 * Representa un auto identificado por su número de patente.
 * Clase de soporte ya implementada para el Ejercicio 9 del TP4.
 */
public class Auto {

    private final String patente;

    public Auto(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
        if (!(otro instanceof Auto)) {
            return false;
        }
        Auto auto = (Auto) otro;
        return Objects.equals(patente, auto.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    @Override
    public String toString() {
        return patente;
    }
}
