package com.mycompany.beginning_enginneers;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
    //Menu de bienvenida y mostrar al usuario nuestra gama y cantidad de productos
    
        int opcion = 0;
            JOptionPane.showMessageDialog(null,"***********Bienvenido a Beginning Enginneers***********\n" + 
                                               "***********Favor seleccionar una opción***********\n");
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog("1. CPU's\n" + "2. GPUs\n" + "3. RAM\n" + "4. MOTHERBOARD\n" + "5. PS\n" + "0. Salir"));
           
           switch(opcion){
           
               case 1:
                        int cpuOp = 0;
                        Principal CPU = new Principal();
                        CPU.iconoCPU();
                        //JOptionPane.showMessageDialog(null,"***********Bienvenido al apartado de CPU´s***********\n" + "***********Favor seleccionar una opción***********\n");
                       do{
                           cpuOp = Integer.parseInt(JOptionPane.showInputDialog("1. Intel Pentium G5400, Precio: 25mil colones (Gama baja)\n" + 
                                                                                "2. AMD Ryzen 5 3600X, Precio: 150mil colones (Gama media)\n" + 
                                                                                "3. AMD Ryzen 9 3950X, Precio: 500mil colones (Gama alta)\n" + 
                                                                                "0. Ir al menu principal"));
                           switch(cpuOp){
                               case 1://CPUs
                                   int CProducto = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto = "Intel Pentium G5400";
                                   String marca = "Intel";
                                   int PrecioProducto = 25000;
                                   CPUs gamabaja = new CPUs(NProducto, CProducto, marca, PrecioProducto);
                                   gamabaja.CalcularPrecio(PrecioProducto, CProducto);
                                   break;
                               case 2:
                                   int CProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto2 = "AMD Ryzen 5 3600X";
                                   String marca2 = "AMD";
                                   int PrecioProducto2 = 150000;
                                   CPUs gamamedia = new CPUs(NProducto2, CProducto2, marca2, PrecioProducto2);
                                   gamamedia.CalcularPrecio(PrecioProducto2, CProducto2);
                                   break;
                               case 3:
                                   int CProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto3 = "AMD Ryzen 9 3950X";
                                   String marca3 = "AMD";
                                   int PrecioProducto3 = 500000;
                                   CPUs gamaAlta = new CPUs(NProducto3, CProducto3, marca3, PrecioProducto3);
                                   gamaAlta.CalcularPrecio(PrecioProducto3, CProducto3);
                                   break;
                                   
                         
                           }// fin de switch anidado para el cpuOp
                       }while(cpuOp != 0);// fin de do while para el cpuOp
           
               case 2://GPUs
                   
                    int GPUs = 0;
                        JOptionPane.showMessageDialog(null,"***********Bienvenido al apartado de GPU's***********\n" + 
                                                           "***********Favor seleccionar una opción***********\n");
                     do{
                           GPUs = Integer.parseInt(JOptionPane.showInputDialog("1. ZOTAC Geforce 1030 2GB, precio:65mil colones (Gama baja)\n" + 
                                                                                "2. ASUS Geforce GTX 1650 Super phoenix 4GB, precio: 130mil colones (Gama media)\n" + 
                                                                                "3. MSI Geforce RTX 2080TI GAMING X TRIO 11GB, precio: 889mil colones (Gama alta)\n" + 
                                                                                "0. Ir al menu principal"));
                           switch(GPUs){
                               case 1:
                                   int CProducto = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto = "Zotac Geforce 1030 2GB ";
                                   String marca = "Zotac";
                                   int PrecioProducto = 65000;
                                   GPUs gamabaja = new GPUs(NProducto, CProducto, marca, PrecioProducto);
                                   gamabaja.CalcularPrecio(PrecioProducto, CProducto);
                                   break;
                               case 2:
                                   int CProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto2 = "Asus Geforce GTX 1650 super";
                                   String marca2 = "ASUS";
                                   int PrecioProducto2 = 130000;
                                   GPUs gamamedia = new GPUs(NProducto2, CProducto2, marca2, PrecioProducto2);
                                   gamamedia.CalcularPrecio(PrecioProducto2, CProducto2);
                                   break;
                               case 3:
                                   int CProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto3 = "MSI Geforce RTX 2080TI GAMING X TRIO 11GB";
                                   String marca3 = "MSI";
                                   int PrecioProducto3 = 889000;
                                   GPUs gamaAlta = new GPUs(NProducto3, CProducto3, marca3, PrecioProducto3);
                                   gamaAlta.CalcularPrecio(PrecioProducto3, CProducto3);
                                   break;
                                   
                                   
                            }// fin de switch anidado para el GPUs
                       }while(GPUs != 0);// fin de do while para el GPUs
break;
               case 3://RAM
                   int RAMOp = 0;
                        JOptionPane.showMessageDialog(null,"***********Bienvenido al apartado de RAM***********\n" + 
                                                           "***********Favor seleccionar una opción***********\n");
                       do{
                           RAMOp = Integer.parseInt(JOptionPane.showInputDialog("1. G.Skill Value 8GB DDR4 2666, Precio: 20mil colones (Gama baja)\n" + 
                                                                                "2. ADATA XPG SpecTrix D50G 8GB DDR4 3600, Precio: 24mil colones (Gama media)\n" + 
                                                                                "3. TeamGroup T-Force Delta RGB 16GB DDR4 2666, Precio: 43mil colones (Gama alta)\n" + 
                                                                                "0. Ir al menu principal"));
                           switch(RAMOp){
                               case 1:
                                   int CProducto = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto = "G.Skill Value 8GB DDR4 2666";
                                   String marca = "G.Skill";
                                   int PrecioProducto = 20000;
                                   RAM gamabaja = new RAM(NProducto, CProducto, marca, PrecioProducto);
                                   gamabaja.CalcularPrecio(PrecioProducto, CProducto);
                                   break;
                               case 2:
                                   int CProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto2 = "ADATA XPG SpecTrix D50G 8GB DDR4 3600";
                                   String marca2 = "ADATA";
                                   int PrecioProducto2 = 24000;
                                   RAM gamamedia = new RAM(NProducto2, CProducto2, marca2, PrecioProducto2);
                                   gamamedia.CalcularPrecio(PrecioProducto2, CProducto2);
                                   break;
                               case 3:
                                   int CProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto3 = "TeamGroup T-Force Delta RGB 16GB DDR4 2666";
                                   String marca3 = "TeamGroup";
                                   int PrecioProducto3 = 43000;
                                   RAM gamaAlta = new RAM(NProducto3, CProducto3, marca3, PrecioProducto3);
                                   gamaAlta.CalcularPrecio(PrecioProducto3, CProducto3);
                                   break;
                                   
                                   
                            }// fin de switch anidado para el ramOp
                       }while(RAMOp != 0);// fin de do while para el ramOp
                       case 4:// MOTHERBOARD
                   int MotherboardOp = 0;
                       JOptionPane.showMessageDialog(null,"***********Bienvenido al apartado de RAM***********\n" + 
                                                          "***********Favor seleccionar una opción***********\n");
                      do{
                          
                   MotherboardOp = Integer.parseInt(JOptionPane.showInputDialog("1. Gigabyte H310M M.2 2.0, Precio: 50mil colones (Gama baja)\n" + 
                                                                                "2. ASRock H370 PRO4, Precio: 85mil colones (Gama media)\n" + 
                                                                                "3. ASRock Z390 Phantom Gaming Sli/AC, Precio: 150mil colones (Gama alta)\n" +
                                                                                "0. Ir al menu principal"));
                          
                          switch (MotherboardOp){
                              case 1: 
                                  int CProducto = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto = "Gigabyte H310M M.2 2.0";
                                   String marca = "Gigabyte";
                                   int PrecioProducto = 50000;
                                   RAM gamabaja = new RAM(NProducto, CProducto, marca, PrecioProducto);
                                   gamabaja.CalcularPrecio(PrecioProducto, CProducto);
                                   break;
                              case 2: 
                                  int CProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto2 = "ASRock H370 PRO4";
                                   String marca2 = "ASRock";
                                   int PrecioProducto2 = 85000;
                                   RAM gamamedia = new RAM(NProducto2, CProducto2, marca2, PrecioProducto2);
                                   gamamedia.CalcularPrecio(PrecioProducto2, CProducto2);
                                   break;
                              case 3: 
                                  int CProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto3 = "ASRock Z390 Phantom Gaming Sli/AC";
                                   String marca3 = "ASRock";
                                   int PrecioProducto3 = 150000;
                                   RAM gamaAlta = new RAM(NProducto3, CProducto3, marca3, PrecioProducto3);
                                   gamaAlta.CalcularPrecio(PrecioProducto3, CProducto3);
                                   break;
                          }//fin del switch anidado para MotherboardOp
                      }while(MotherboardOp != 0);// fin do while para MotherboardOp
                      
                       case 5:
                                 int PSOp = 0;
                                 JOptionPane.showMessageDialog(null,"***********Bienvenido al apartado de PS***********\n" +  
                                                                    "***********Favor seleccionar una opción***********\n");
                    do{
                                 Integer.parseInt(JOptionPane.showInputDialog( "1.Poder Evga 600w 80 plus, precio 37,000 colones"
                                                            +  " 2.Coirsair Cx650 80+ Bronce Power Support, 57,000\n" +
                                                               " 3.Dell Optiplex Optiplex 760, precio 38,000 colones \n" +
                                                         "0.Ir al menu"));
         
           
                                switch(PSOp){
                                    case 1:
                                   int CProducto = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto = "Poder Evga 600w 80 plus";
                                   String marca = "Poder Evga";
                                   int PrecioProducto = 37000;
                                  
                                   break;
                               case 2:
                                   int CProducto2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto2 = "Coirsair Cx650 80+ Bronce Power Support";
                                   String marca2 = "Coirsair";
                                   int PrecioProducto2 = 57000 ;
                                   
                                   break;
                               case 3:
                                   int CProducto3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad a llevar"));
                                   String NProducto3 = "Dell Optiplex Optiplex 760";
                                   String marca3 = "Dell";
                                   int PrecioProducto3 = 38000;
                                  
                                   break;
                                               }//switch
                                    }while(PSOp != 0);
           }// fin del switch primario
        }while(opcion != 0);

    }// fin del main
  
      
}// fin del Principal
