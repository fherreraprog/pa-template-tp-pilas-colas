package tp3_ejercicio_seis;

import estructuras.PilaInt;

public class UsoEjercicio6 {
    public static void main(String[] args) {
        System.out.println("Probando el Ejercicio 6 (Operaciones sobre pila)...");

        PilaInt pila = new PilaInt();
        pila.meter(10);
        pila.meter(20);
        pila.meter(30);
        pila.meter(40);
        pila.meter(50);

        System.out.println("Segundo elemento (sin modificar): "
                + Ejercicio6.segundoElementoSinModificar(pila));
        System.out.println("La pila permanece sin cambios tras la consulta.");
    }
}
