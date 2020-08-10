
package com.mycompany.beginning_enginneers;

import javax.swing.JOptionPane;


public class RAM {
   public int    precio; 
   public String nProducto;  // nombre de producto
   public int    cProducto; // cantidad de producto
   public String marca;
   private int    stock;
    public RAM(String nProducto, int cProducto, String marca, int stock) {
        
        this.nProducto = nProducto;
        this.cProducto = cProducto;
        this.marca = marca;
        this.stock = stock;
    }// fin de constructor RAM
   
   public void CalcularPrecio(int precio, int cProducto){
        int resultadoCPU;
        resultadoCPU = precio*cProducto;
        JOptionPane.showMessageDialog(null, "Precio total por los CPUs: "+resultadoCPU);

   }
}// fin de RAM
