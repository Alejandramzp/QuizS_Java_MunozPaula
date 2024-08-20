
package quizs;


public class Nomina extends Tarjeta {

    public Nomina(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }

    @Override
    public double cuotaDeManejo() {
        float Descuento = 0;
        double cuota = 50000 - Descuento;
        return cuota;
    }
}
