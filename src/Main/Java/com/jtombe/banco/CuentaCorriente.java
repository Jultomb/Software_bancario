package com.jtombe.banco;

public class CuentaCorriente extends CuentaBancaria{
    private final double comisión = 0.2;

    public CuentaCorriente(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        super(titular, tipoDeCuenta, saldo);
    }

    @Override
    public void sacarDinero(double cantidad) {
        super.sacarDinero(cantidad);
        saldo -= cantidad -(cantidad*comisión);
    }

    @Override
    public void ingresarDinero(double cantidad) {
        super.ingresarDinero(cantidad);
        saldo += cantidad;
    }

    @Override
    public void obtenerSaldo() {
        super.obtenerSaldo();
    }

    @Override
    public void informaciónSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta corriente \n De acuerdo al contrato firmado, la comisión por retiro es de"+comisión*100+" % del valor retirado");
    }
}