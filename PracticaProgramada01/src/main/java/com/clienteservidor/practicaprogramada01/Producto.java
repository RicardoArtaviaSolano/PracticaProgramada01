/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clienteservidor.practicaprogramada01;

/**Escribir un programa en Java que implemente una clase llamada “Productos” que
tiene como atributos: el nombre y la cantidad de productos.
Implementar un método para imprimir los datos de los atributos del producto.
En una clase principal crear al menos 5 productos y luego imprimir la información de
todos los productos**/

public class Producto {
    
    private String nombre;
    private int cantidad;

    // Constructor
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

 
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
    public void imprimirDatos() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("La Cantidad del producto es de: " + cantidad);
    }
}
