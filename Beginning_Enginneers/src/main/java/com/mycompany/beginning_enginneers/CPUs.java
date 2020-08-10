
package com.mycompany.beginning_enginneers;

import javax.swing.JOptionPane;


public class CPUs {
   // Atributos
   public int    precio; 
   public String nProducto;  // nombre de producto
   public int    cProducto = 0; // cantidad de producto
   public String marca;
   private int    stock;

    public CPUs(String nProducto, int cProducto, String marca, int precio) {
        this.nProducto = nProducto;
        this.cProducto = cProducto;
        this.marca = marca;
        this.precio = precio;
        
    }// fin del constructor CPUs
   
   public void CalcularPrecio(int precio, int cProducto){
        int resultadoCPU;
        resultadoCPU = precio*cProducto;
        JOptionPane.showMessageDialog(null, "Precio total por los CPUs: "+resultadoCPU);

   }
    
    
}// fin de CPUs
