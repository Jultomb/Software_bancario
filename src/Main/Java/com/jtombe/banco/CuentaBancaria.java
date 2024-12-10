package com.jtombe.banco;

public abstract class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    protected double saldo;

    public CuentaBancaria(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {

        this.titular = titular;
        this.saldo = saldo;

    }

    public void sacarDinero(double cantidad) {
        if (cantidad < 10000) {
            System.out.println("El valor mínimo a retirar es de $10.000. $ " + cantidad + " es inferior. Ingrese un valor válido");
            return;
        }
        saldo -= cantidad;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad < 10000) {
            System.out.println("El valor a consignar no puede ser inferior a $10.000. El valor ingresado de $" + cantidad + " es inferior. Ingrese un valor válido.");
            return;
        }
        saldo += cantidad;
    }

    public void obtenerSaldo(){
        System.out.println("El saldo actual que hay en su cuenta es $"+saldo+".");
    }

public abstract void informaciónSobreCondicionesLegales();
}
