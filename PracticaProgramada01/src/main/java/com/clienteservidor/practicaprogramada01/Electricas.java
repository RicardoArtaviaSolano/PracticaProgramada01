/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;



class Electricas extends Herramientas {
   
    private String voltaje;

    // Constructor
    public Electricas(String tipo, String voltaje) {
        super(tipo);
        this.voltaje = voltaje;
    }

    // Getters y Setters
    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }
}
