package Problema1;

class Tarjeta implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago realizado con tarjeta por un total de: " + cantidad + " euros.");
    }
}