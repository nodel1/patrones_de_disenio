package Problema1;

class Efectivo implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago realizado en efectivo por un total de: " + cantidad + " euros.");
    }
}
