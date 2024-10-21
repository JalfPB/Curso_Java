package Herencia.Ejercicios.Ej10;

public class CuentaAhorro extends CuentaBancaria{

    public CuentaAhorro(float saldo, int numeroCuenta){
        super(saldo, numeroCuenta);
    }

    public void retirar(){
        this.saldo = saldo-50;
        System.out.println("El saldo actual de la cuenta es " + saldo);
    }

}
