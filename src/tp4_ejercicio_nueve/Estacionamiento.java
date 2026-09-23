package tp4_ejercicio_nueve;

import estructuras.PilaInt;

import java.util.HashMap;
import java.util.Map;

/**
 * Trabajo Práctico N° 4 - Ejercicio 9.
 *
 * <p>Simula un estacionamiento con capacidad para {@value #CAPACIDAD} autos
 * dispuestos en una sola fila. Los autos ingresan por el sur (se apilan) y,
 * para que salga uno que no está en el extremo, los autos ingresados después
 * deben moverse temporalmente para dejarlo salir y luego volver a ubicarse
 * en el mismo orden.</p>
 *
 * <p>La fila se modela con una {@link PilaInt} de identificadores: la cima representa el auto más
 * cercano a la entrada/salida (el último en ingresar) y el fondo, el primero
 * en ingresar. Cada vez que un auto se desplaza (hacia afuera o de regreso)
 * se contabiliza como un movimiento.</p>
 */
public class Estacionamiento {

    private static final int CAPACIDAD = 10;

    private final PilaInt autos;
    private final Map<Integer, Auto> autosPorId;
    private int movimientos;
    private int proximoId;

    public Estacionamiento() {
        this.autos = new PilaInt();
        this.autosPorId = new HashMap<>();
        this.movimientos = 0;
        this.proximoId = 1;
    }

    /**
     * Procesa el ingreso de un auto al estacionamiento.
     *
     * @param patente patente del auto que ingresa
     * @return mensaje informando el resultado de la operación (ingreso
     *         exitoso o rechazo por falta de espacio)
     */
    public String entrar(String patente) {
        if (espacioDisponible() == 0) {
            return "No hay espacio disponible.";
        }
        int id = proximoId++;
        autosPorId.put(id, new Auto(patente));
        autos.meter(id);
        return "Ingreso exitoso: " + patente;
    }

    /**
     * Procesa la salida de un auto identificado por su patente. Si el auto
     * no se encuentra en el extremo de la fila, mueve los autos necesarios
     * para permitir su salida y luego los reubica en el mismo orden.
     *
     * @param patente patente del auto que desea salir
     * @return mensaje informando el resultado de la operación (salida
     *         exitosa con la cantidad de movimientos realizados, o auto no
     *         encontrado)
     */
    public String salir(String patente) {
        PilaInt temporal = new PilaInt();
        while (!autos.estaVacia()) {
            int id = autos.sacar();
            Auto auto = autosPorId.get(id);
            if (auto.getPatente().equals(patente)) {
                autosPorId.remove(id);
                while (!temporal.estaVacia()) {
                    autos.meter(temporal.sacar());
                    movimientos++;
                }
                return "Salida exitosa: " + patente;
            }
            temporal.meter(id);
            movimientos++;
        }

        while (!temporal.estaVacia()) {
            autos.meter(temporal.sacar());
            movimientos++;
        }
        return "No se encontro el auto: " + patente;
    }

    /** @return la cantidad de lugares libres en el estacionamiento */
    public int espacioDisponible() {
        return CAPACIDAD - autosPorId.size();
    }

    /** @return la cantidad total de movimientos realizados hasta el momento */
    public int getMovimientos() {
        return movimientos;
    }
}
