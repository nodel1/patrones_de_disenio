package Problema2;

public class Main {
    public static void main(String[] args) {

        Estado enPreparacion = new EnPreparacion();
        Estado enTransito = new EnTransito();
        Estado entregado = new Entregado();


        enPreparacion.revisarEstado();
        enTransito.revisarEstado();
        entregado.revisarEstado();
    }
}
