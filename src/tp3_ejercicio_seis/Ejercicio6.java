package tp3_ejercicio_seis;

import estructuras.PilaInt;

/**
 * Trabajo Práctico N° 3 - Ejercicio 6.
 *
 * <p>Operaciones sobre los elementos de una {@link PilaInt} de enteros, utilizando
 * únicamente los métodos {@code meter()}, {@code sacar()} y {@code estaVacia()}.</p>
 */
public class Ejercicio6 {

    /**
     * a) Devuelve el segundo elemento desde la cima, eliminando los dos elementos
     * superiores de la pila.
     *
     * @param pila pila de la cual se extraen los elementos
     * @return el segundo elemento desde la cima
     */
    public static int segundoElementoEliminando(PilaInt pila) {
        pila.sacar();
        return pila.sacar();
    }

    /**
     * b) Devuelve el segundo elemento desde la cima, sin modificar el contenido
     * ni el orden de la pila.
     *
     * @param pila pila a consultar
     * @return el segundo elemento desde la cima
     */
    public static int segundoElementoSinModificar(PilaInt pila) {
        int cima = pila.sacar();
        int segundo = pila.sacar();
        pila.meter(segundo);
        pila.meter(cima);
        return segundo;
    }

    /**
     * c) Devuelve el elemento n-ésimo desde la cima, eliminando los n elementos
     * superiores de la pila.
     *
     * @param pila pila de la cual se extraen los elementos
     * @param n    posición desde la cima (entero positivo, 1 = la cima)
     * @return el elemento n-ésimo desde la cima
     */
    public static int enesimoElementoEliminando(PilaInt pila, int n) {
        validarPosicion(n);
        int elemento = 0;
        for (int posicion = 0; posicion < n; posicion++) {
            elemento = pila.sacar();
        }
        return elemento;
    }

    /**
     * d) Devuelve el elemento n-ésimo desde la cima, sin modificar el contenido
     * ni el orden de la pila.
     *
     * @param pila pila a consultar
     * @param n    posición desde la cima (entero positivo, 1 = la cima)
     * @return el elemento n-ésimo desde la cima
     */
    public static int enesimoElementoSinModificar(PilaInt pila, int n) {
        validarPosicion(n);
        PilaInt auxiliar = new PilaInt();
        int elemento = 0;
        for (int posicion = 0; posicion < n; posicion++) {
            elemento = pila.sacar();
            auxiliar.meter(elemento);
        }
        while (!auxiliar.estaVacia()) {
            pila.meter(auxiliar.sacar());
        }
        return elemento;
    }

    /**
     * e) Devuelve el elemento del fondo de la pila, dejándola vacía.
     *
     * @param pila pila de la cual se extraen los elementos
     * @return el elemento del fondo
     */
    public static int elementoFondoVaciando(PilaInt pila) {
        int fondo = 0;
        while (!pila.estaVacia()) {
            fondo = pila.sacar();
        }
        return fondo;
    }

    /**
     * f) Devuelve el elemento del fondo, sin modificar el contenido ni el
     * orden de la pila.
     *
     * @param pila pila a consultar
     * @return el elemento del fondo
     */
    public static int elementoFondoSinModificar(PilaInt pila) {
        PilaInt auxiliar = new PilaInt();
        int fondo = 0;
        while (!pila.estaVacia()) {
            fondo = pila.sacar();
            auxiliar.meter(fondo);
        }
        while (!auxiliar.estaVacia()) {
            pila.meter(auxiliar.sacar());
        }
        return fondo;
    }

    private static void validarPosicion(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("La posicion debe ser positiva.");
        }
    }
}
