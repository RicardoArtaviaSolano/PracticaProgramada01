/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;

/**
 *
 * @author Paula
 */
public class CuentaBanco {
    
    private int numeroCuenta;
    private double balance;

    
 public CuentaBanco(int numeroCuenta, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.balance = balance;
    }

    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

   
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void deposito(double cantidad) {
        balance = balance + cantidad;
        System.out.println("Depósito de " + cantidad + " realizado saldo es de : " + balance + " colones.");
    }


    public void retiro(double cantidad) {
        if (balance >= cantidad) {
            balance = balance - cantidad;
            System.out.println("Retiro " + cantidad + " realizado su saldo es de: " + balance + " colones.");
        } else {
            System.out.println("No se puede realizar el retiro");
        }
    }
}
