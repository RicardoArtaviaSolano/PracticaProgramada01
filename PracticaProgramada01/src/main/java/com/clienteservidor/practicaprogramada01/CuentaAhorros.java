/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;

class CuentaAhorros extends CuentaBanco {
    // Constructor 
    public CuentaAhorros(int numeroCuenta, double balance) {
        super(numeroCuenta, balance);
    }

    //  evitar retiros si el saldo cae por debajo de 100 colones
    @Override
    public void retiro(double cantidad) {
        if (getBalance() - cantidad >= 100) {
            super.retiro(cantidad);
        } else {
            System.out.println("No se puede realizar el retiro");
        }
    }
}
