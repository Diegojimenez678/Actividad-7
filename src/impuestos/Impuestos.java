/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestos;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class Impuestos {

    public static void main(String[] args) {
        int opcion =0;
        int opci;
        Vehiculo v = new Vehiculo();
        v.carro();
        try {
        OUTER:
         do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea realizar algun descuento?\n1 para si.\n2 para no.\n3 para salir"));
            Descuento d =new Descuento() ;
            switch (opcion) {
                case 1:
                    opci = Integer.parseInt(JOptionPane.showInputDialog("Pronto pago(P)10%,Servicio publico(S)20%,cuenta(C)20%\n1.P\n2.S\n3.C\n4.P y S\n5.P y C\n6.S y C\n7.P,S y C"));
                    switch (opci) {
                        case 1:
                            d.descuento1();
                            break;
                        case 2:
                            d.descuento2();
                            break;
                        case 3:
                            d.descuento3();
                            break;
                        case 4:
                            d.descuento4();
                            break;
                        case 5:
                            d.descuento5();
                            break;
                        case 6:
                            d.descuento6();
                            break;
                        case 7:
                            d.descuento7();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break;
                    }     
                    break;
                case 2:
                    d.nodescuento();                   
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                     break OUTER;                 
                default:
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                    break;
            }
        } while (opcion <= 1 || opcion >= 2);
}
        catch (HeadlessException | NumberFormatException errorMain) {
    JOptionPane.showMessageDialog(null,"Error en la digitación: ");
}
    }
  
    }
    

