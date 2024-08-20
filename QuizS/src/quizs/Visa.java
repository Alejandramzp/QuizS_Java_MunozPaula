
package quizs;


public class Visa extends Tarjeta {

    public Visa(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        float Descuento = 0;
        double cuota = 50000 - Descuento;
        return cuota;
    }   
}
