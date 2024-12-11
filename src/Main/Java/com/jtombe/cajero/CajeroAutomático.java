package com.jtombe.cajero;
import com.jtombe.banco.CuentaBancaria;
import com.jtombe.banco.CuentaAhorros;
import com.jtombe.banco.TipoDeCuenta;

import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomático {
    private CuentaBancaria cuentaBancariaActual;

protected CajeroAutomático (String identificador, String contraseña){
    double cantidadAleatoria = ThreadLocalRandom.current().nextDouble (0, 100000);
    cuentaBancariaActual = new CuentaAhorros("Julián Tombé", TipoDeCuenta.AHORROS,cantidadAleatoria);
}
protected void mostrarSaldo (){
    System.out.println("Su saldo es " +cuentaBancariaActual.obtenerSaldo());
}
    
}
