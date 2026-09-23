package tp4_ejercicio_nueve;

import estructuras.PilaString;


public class Estacionamiento {

    private static final int CAPACIDAD = 10;

    private final PilaString autos;
    private int cantidadAutos;
    private int movimientos;

    public Estacionamiento() {
        this.autos = new PilaString();
        this.cantidadAutos = 0;
        this.movimientos = 0;
    }

   
    public String entrar(String patente) {
        // --- TU CÓDIGO AQUÍ ---
        return "";
    }

    
    public String salir(String patente) {
        // --- TU CÓDIGO AQUÍ ---
        return "";
    }

    public int espacioDisponible() {
        return CAPACIDAD - cantidadAutos;
    }

    public int getMovimientos() {
        return movimientos;
    }
}
