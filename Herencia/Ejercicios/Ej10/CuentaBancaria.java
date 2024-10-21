package Herencia.Ejercicios.Ej10;

public class CuentaBancaria {

    protected float saldo;
    protected int numeroCuenta;

    public CuentaBancaria(float saldo,int numeroCuenta){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    protected void depositar(float cantidad){
        this.saldo += cantidad;
        System.out.println("El saldo actual de la cuenta es " + saldo);
    }

}
