/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.clienteservidor.practicaprogramada01;


public class PracticaProgramada01 {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Vino", 4);
        Producto producto2 = new Producto("Cervezas", 6);
        Producto producto3 = new Producto("Brownie", 24);
        Producto producto4 = new Producto("Arroz", 8);
        Producto producto5 = new Producto("Chicles", 34);

     
        System.out.println("------Productos-------");
        
        producto1.imprimirDatos();
        producto2.imprimirDatos();
        producto3.imprimirDatos();
        producto4.imprimirDatos();
        producto5.imprimirDatos();
        
        
        CuentaBanco cuenta1 = new CuentaBanco(84, 20000);
        CuentaBanco cuenta2 = new CuentaBanco(38, 100);
        CuentaAhorros cuenta3 = new CuentaAhorros(28, 10500);
        CuentaAhorros cuenta4 = new CuentaAhorros(40, 450);
        CuentaBanco cuenta5 = new CuentaBanco(90, 3200);

        cuenta1.deposito(200);
        cuenta1.retiro(100);

        cuenta2.deposito(50);
        cuenta2.retiro(200);

        cuenta3.deposito(150);
        cuenta3.retiro(50);

        cuenta4.deposito(100);
        cuenta4.retiro(150); 

        cuenta5.deposito(500);
        cuenta5.retiro(300);
        
        
        Automovil automovil = new Automovil("Honda", "Civico", 2023, "Gasolina", 5);
        Camion camion = new Camion("kenworth", "T680", 2023, "Diesel", 150000);
       
        Motocicleta motocicleta = new Motocicleta("Yamaha", "SBolt R-Spec", 2023, "Gasolina", false);

        System.out.println("Los datos del Camión:");
        System.out.println("La marca: " + camion.getMarca());
        System.out.println("Año: " + camion.getAño());
        System.out.println("El modelo: " + camion.getModelo());
        System.out.println("Carga máxima: " + camion.getCargaMaxima());
        System.out.println("Tipo de combustible: " + camion.getTipoCombustible());
        

        System.out.println("\nLos datos del Automóvil:");
        System.out.println("La marca: " + automovil.getMarca());
        System.out.println("Año: " + automovil.getAño());
        System.out.println("El modelo: " + automovil.getModelo());
      
        System.out.println("Tipo de combustible: " + automovil.getTipoCombustible());
        System.out.println("Número de puertas: " + automovil.getNumeroPuertas());

        System.out.println("\nLos datos de la Motocicleta:");
        System.out.println("La marca: " + motocicleta.getMarca());
        System.out.println("Año: " + motocicleta.getAño());
        System.out.println("El modelo: " + motocicleta.getModelo());
        System.out.println("Tipo de combustible: " + motocicleta.getTipoCombustible());
        System.out.println("Tiene sidecar: " + (motocicleta.isTieneSidecar() ? "Sí" : "No"));
    
        
        
        
        
        
        
        
        Sierras sierra = new Sierras("Sierra", "440V", "Cinta");
        Niveles nivel = new Niveles("Nivel", "Metal", 40);

        
        System.out.println("herramienta: " + nivel.getTipo());
        System.out.println("El material es de: " + nivel.getMaterial());
        System.out.println("Su longitud es de: " + nivel.getLongitud());

        System.out.println();

        System.out.println(" Su Voltaje: " + sierra.getVoltaje());
         System.out.println("Herramienta: " + sierra.getTipo());
        System.out.println("El tipo del corte: " + sierra.getTipoCorte());
    }
}
