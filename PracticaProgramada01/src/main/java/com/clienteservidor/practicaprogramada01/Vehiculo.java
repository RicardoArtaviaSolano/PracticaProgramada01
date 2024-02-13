/*
Escribir un programa en Java para crear una jerarquía de clases de vehículo. La
clase base debe ser Vehículo, con las subclases Camión, Automóvil y Motocicleta.
Cada subclase debe tener propiedades como marca, modelo, año y tipo de
combustible. Implementar métodos para calcular la eficiencia del combustible, la
distancia recorrida y la velocidad máxima. En cada subclase debe agregar un
atributo adicional para cada vehículo.
En una clase principal crear al menos 1 vehículo de cada tipo e imprimir los datos
de cada uno
 */
package com.clienteservidor.practicaprogramada01;



public class Vehiculo {
   
    
    private String marca;
    private String modelo;
    private int año;
    private String tipoCombustible;

    public Vehiculo(String marca, String modelo, int año, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
    
   
