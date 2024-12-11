package com.jtombe.banco;

public class CuentaNómina extends CuentaBancaria{

    public CuentaNómina (String titular, TipoDeCuenta tipoDeCuenta, double saldo){
        super (titular, tipoDeCuenta, saldo);
    }

    @Override
    public void informaciónSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de nómina \n De acuerdo al contrato firmado, esta cuenta no tendrá comisión por ningún concepto");

    }
}
