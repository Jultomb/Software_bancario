package com.jtombe.cajero;
import com.jtombe.banco.CuentaBancaria;
import com.jtombe.banco.CuentaAhorros;
import com.jtombe.banco.TipoDeCuenta;
import com.jtombe.moks.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomático {
    private CuentaBancaria cuentaBancariaActual;

    protected CajeroAutomático(String identificador, String contraseña) {
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 100000);
        cuentaBancariaActual = new CuentaAhorros("Julián Tombé", TipoDeCuenta.AHORROS, 1200000);
    }

    protected void mostrarSaldo() {
        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }

    protected void ingresarDinero() {
        System.out.println("Cuánto dinero desea ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
        if (cantidad >= 10000) {
            System.out.println("Transacción exitosa \n El valor retirado es $" + cantidad);
        }
        else
            System.out.println("Transacción declinada. El valor mínimo de retiro es de $10.000. El valor ingresado de $" + cantidad + " es inferior. Ingrese un valor válido");

    }
        protected void sacarDinero() {
            System.out.println("Cuánto dinero desea retirar?");
            Scanner scanner = new Scanner(System.in);
            double cantidad = scanner.nextDouble();
            cuentaBancariaActual.sacarDinero(cantidad);
            if (cantidad >= 10000) {
                System.out.println("Transacción exitosa \n El valor retirado es $" + cantidad);
            }
            else
                System.out.println("Transacción declinada. El valor mínimo de retiro es de $10.000. El valor ingresado de $" + cantidad + " es inferior. Ingrese un valor válido");
        }
    protected void consutarUltimosMovimientos() {
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "Pesos");
        mostrarMovimientos(movimientos);
    }

    private void mostrarMovimientos(ArrayList<String> movimientos) {
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }

    protected void mostrarCondicionesLegales() {
        cuentaBancariaActual.informaciónSobreCondicionesLegales();
        {
            System.out.println("No acepte ayuda de terceros en las transacciones bancarias que deba realizar");
        }
    }

        protected void salir () {
            System.out.println("Muchas gracias por utilizar nuestros servicios");
        }
    }
