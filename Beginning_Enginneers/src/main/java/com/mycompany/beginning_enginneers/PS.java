
package com.mycompany.beginning_enginneers;


public class PS {
   public int    precio; 
   public String nProducto;  // nombre de producto
   public int    cProducto; // cantidad de producto
   public String marca;
   private int    stock;
   
    public PS(String nProducto, int cProducto, String marca, int stock) {
        
        this.nProducto = nProducto;
        this.cProducto = cProducto;
        this.marca = marca;
        this.stock = stock;
    }//fin de PS
      public void CalcularPrecio(int precio, int cProducto){
        int resultadoPS = 0;
        resultadoPS += precio * cProducto;
        //JOptionPane.showMessageDialog(null, "Precio total por la ps es: " + resultadoCPU);
}// fin del calcular precio PS
}// fin de PS
