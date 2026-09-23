package tp4_ejercicio_nueve;

public class UsoEstacionamiento {
    public static void main(String[] args) {
        System.out.println("Probando el Ejercicio 9 (Estacionamiento)...");

        Estacionamiento estacionamiento = new Estacionamiento();
        System.out.println(estacionamiento.entrar("AA111AA"));
        System.out.println(estacionamiento.entrar("BB222BB"));
        System.out.println(estacionamiento.entrar("CC333CC"));
        System.out.println(estacionamiento.salir("AA111AA"));
        System.out.println("Espacio disponible: " + estacionamiento.espacioDisponible());
    }
}
