/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clienteservidor.practicaprogramada01;

public class Camion extends Vehiculo {
    private int cargaMaxima;

    public Camion(String marca, String modelo, int año, String tipoCombustible, int cargaMaxima) {
        super(marca, modelo, año, tipoCombustible);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}

