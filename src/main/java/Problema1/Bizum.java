package Problema1;

class Bizum implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pago realizado con Bizum por un total de: " + cantidad + " euros.");
    }
}
