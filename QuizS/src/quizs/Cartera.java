
package quizs;


public class Cartera extends Tarjeta implements PatronCartera {
    private String anho;

    public Cartera(String anho, String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
        this.anho = anho;
    }
 
    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println("Nº Cuenta: " + super.getNumeroDeCuenta() + ", Cuota Manejo:"
                + cuotaDeManejo() + "Tipo Tarjeta:" + "Mes:" + super.getMes());
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        System.out.println("Agregar Tarjeta");
    }

    @Override
    public double cuotaDeManejo() {
        return 0;
    }
    
}
