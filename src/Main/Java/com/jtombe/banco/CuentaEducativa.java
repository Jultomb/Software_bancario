package com.jtombe.banco;

public class CuentaEducativa extends CuentaBancaria{

    public CuentaEducativa (String titular, TipoDeCuenta tipoDeCuenta, double saldo){
        super(titular, tipoDeCuenta,saldo);

    }

    @Override
    public void informaciónSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de nómina \n De acuerdo al contrato firmado, en esta cuenta sólo es posible ingresar dinero y consultar el saldo. \n El retiro se realizará por ventanilla y con soporte de matrícula educativa");

    }
}
