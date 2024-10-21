package Herencia.Ejercicios.Ej10;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(float saldo, int numeroCuenta) {
        super(saldo, numeroCuenta);
    }

    public void retirar() {
        this.saldo = saldo - 100;
        System.out.println("El saldo actual de la cuenta es " + saldo);
    }
}
