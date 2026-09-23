package tp3_ejercicio_nueve;

public class UsoValidadorSeparadores {
    public static void main(String[] args) {
        System.out.println("Probando el Ejercicio 9 (Validación de separadores)...");

        String expresion = "[(a % b) * c]";
        boolean valido = ValidadorSeparadores.sonSeparadoresValidos(expresion);

        System.out.println(expresion + " -> " + (valido ? "correcto" : "incorrecto"));
    }
}
