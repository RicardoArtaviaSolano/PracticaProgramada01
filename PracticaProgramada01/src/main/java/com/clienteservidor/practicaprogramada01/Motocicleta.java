/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int año, String tipoCombustible, boolean tieneSidecar) {
        super(marca, modelo, año, tipoCombustible);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
