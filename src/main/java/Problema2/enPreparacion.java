package Problema2;

class EnPreparacion implements Estado {
    @Override
    public void revisarEstado() {
        System.out.println("El pedido está en preparación.");
    }
}
