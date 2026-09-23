package estructuras;


public class PilaString {

    private final int maxpila = 10;
    private String[] elementos;
    private int cima;

    public PilaString() {
        elementos = new String[maxpila];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == maxpila - 1);
    }

    public void meter(String e) {
        cima = cima + 1;
        elementos[cima] = e;
    }

    public String sacar() {
        String aux = elementos[cima];
        cima = cima - 1;
        return aux;
    }

}
