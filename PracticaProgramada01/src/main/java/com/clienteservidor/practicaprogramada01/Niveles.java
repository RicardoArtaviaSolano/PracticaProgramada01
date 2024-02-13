/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;


class Niveles extends Manuales {
   
    private int longitud;

 
    public Niveles(String tipo, String material, int longitud) {
        super(tipo, material);
        this.longitud = longitud;
    }

   
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
