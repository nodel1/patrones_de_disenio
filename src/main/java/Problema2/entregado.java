package Problema2;

class Entregado implements Estado {
    @Override
    public void revisarEstado() {
        System.out.println("El pedido ha sido entregado.");
    }
}
