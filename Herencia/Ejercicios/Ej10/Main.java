package Herencia.Ejercicios.Ej10;

public class Main {

    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro(1000, 123);
        CuentaBancaria cb = new CuentaBancaria(0, 0);
        CuentaCorriente cc = new CuentaCorriente(675, 854754);

        ca.retirar();
        cb.depositar(1000);
        cc.retirar();
    }

}
