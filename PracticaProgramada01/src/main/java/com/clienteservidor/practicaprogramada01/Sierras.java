/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;

class Sierras extends Electricas {
    
    private String tipoCorte;

 
    public Sierras(String tipo, String voltaje, String tipoCorte) {
        super(tipo, voltaje);
        this.tipoCorte = tipoCorte;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }
}
