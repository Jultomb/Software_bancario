package com.jtombe.cajero;


import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Ingrese su número de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificación = scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña = scanner.nextLine();
        CajeroAutomático cajero = new CajeroAutomático(identificación, contraseña);

        int opciónSeleccionada;
        do {
            System.out.println("Seleccione una de las siguientes opciones: \n 1 Para consulta de saldo \n 2 Para ingresar dinero \n 3 Para retirar dinero \n 4 Para consultar sus últimos movimientos \n 5 Para revisar las condiciones legales \n Una vez digite la opción, presione la tecla Enter ");
            Scanner opción = new Scanner(System.in);
            opciónSeleccionada = opción.nextInt();
            System.out.println("La opción que ha seleccionado es la " + opciónSeleccionada);

            switch (opciónSeleccionada) {

                case 1:
                    cajero.mostrarSaldo();
                    break;

                case 2:
                    cajero.ingresarDinero();
                    break;

                case 3:
                    cajero.sacarDinero();
                    break;

                case 4:
                    cajero.consutarUltimosMovimientos();
                    break;

                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;

                default:
                    cajero.salir();

            }
        }
        while (opciónSeleccionada == 1 || opciónSeleccionada == 2 || opciónSeleccionada == 3 || opciónSeleccionada == 4 || opciónSeleccionada == 5);
    }
}
