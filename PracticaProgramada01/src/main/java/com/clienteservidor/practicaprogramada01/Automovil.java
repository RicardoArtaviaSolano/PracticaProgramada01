/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;



public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int año, String tipoCombustible, int numeroPuertas) {
        super(marca, modelo, año, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}


