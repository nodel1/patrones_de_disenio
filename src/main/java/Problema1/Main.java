package Problema1;

public class Main {
    public static void main(String[] args) {

        MetodoPago pagoEfectivo = new Efectivo();
        MetodoPago pagoTarjeta = new Tarjeta();
        MetodoPago pagoBizum = new Bizum();


        pagoEfectivo.pagar(50.0);
        pagoTarjeta.pagar(100.0);
        pagoBizum.pagar(30.0);
    }
}
