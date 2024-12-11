package com.jtombe.banco;

public class CuentaAhorros extends CuentaBancaria{
    private final double comisión = 0.03;

    public CuentaAhorros(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
        super(titular, tipoDeCuenta, saldo);
    }

    @Override
    public void sacarDinero(double cantidad) {
        super.sacarDinero(cantidad);
        saldo -= cantidad - (cantidad*comisión);
    }

    @Override
    public void informaciónSobreCondicionesLegales() {

        System.out.println("Condiciones legales de la cuenta de ahorro \n De acuerdo al contrato firmado, la comisión por retiro es de"+comisión*100+" % del valor retirado");
    }
}
