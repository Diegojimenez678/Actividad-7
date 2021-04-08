/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestos;

import javax.swing.JOptionPane;

/**
 *
 * @author YEFERSON
 */
public class Descuento extends Vehiculo{
  private double cuenta ;
   private double valor = 1000000;
   public Descuento(){
     
   }

    public Descuento(double cuenta, String marca, String linea, int modelo, double prontoPago, double servicioPublico) {
        super(marca, linea, modelo, prontoPago, servicioPublico);
        this.cuenta = cuenta;
    }

    public double getCuenta() {
        return cuenta;
    }
    
    public void nodescuento(){
        JOptionPane.showMessageDialog(null, "El costo es de "+valor);
    }
   
   public void descuento1(){
       prontoPago = valor*0.1;
       prontoPago = valor-prontoPago;
       
       JOptionPane.showMessageDialog(null,"el costo es de "+getProntoPago());
   }
    public void descuento2(){
        servicioPublico = valor*0.2;
       servicioPublico = valor-servicioPublico;
       
       JOptionPane.showMessageDialog(null,"el costo es de "+getServicioPublico());
    }
    public void descuento3(){
        cuenta = valor*0.2;
       cuenta = valor-cuenta;
       
       JOptionPane.showMessageDialog(null,"el costo es de "+getCuenta());
    }
    public void descuento4(){
        prontoPago = valor*0.1;
       prontoPago = valor-prontoPago;
       servicioPublico = prontoPago*0.2;
       servicioPublico = prontoPago-servicioPublico;
       JOptionPane.showMessageDialog(null,"el costo es de "+getServicioPublico());
    }
    public void descuento5(){
       prontoPago = valor*0.1;
       prontoPago = valor-prontoPago;
       cuenta = prontoPago*0.2;
       cuenta = prontoPago-cuenta;
       
       JOptionPane.showMessageDialog(null,"el costo es de "+getCuenta());
    }
    public void descuento6(){
         servicioPublico = valor*0.2;
       servicioPublico = valor-servicioPublico;
         cuenta = servicioPublico*0.2;
       cuenta = servicioPublico-cuenta;
       
       JOptionPane.showMessageDialog(null,"el costo es de "+getCuenta());

    }
    public void descuento7(){
         prontoPago = valor*0.1;
       prontoPago = valor-prontoPago;
       servicioPublico = prontoPago*0.2;
       servicioPublico = prontoPago-servicioPublico;
        cuenta = servicioPublico*0.2;
       cuenta = servicioPublico-cuenta;
         JOptionPane.showMessageDialog(null,"el costo es de "+getCuenta());
    }
   
}
