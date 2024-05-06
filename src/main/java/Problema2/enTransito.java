package Problema2;

class EnTransito implements Estado {
    @Override
    public void revisarEstado() {
        System.out.println("El pedido está en tránsito.");
    }
}
