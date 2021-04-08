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
public class Vehiculo {
    private String marca ;
    private String linea ;
    private int modelo;
    protected double prontoPago ;
    protected double servicioPublico ;
    
    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String linea, int modelo, double prontoPago, double servicioPublico) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.prontoPago = prontoPago;
        this.servicioPublico = servicioPublico;
        
    }

    public double getProntoPago() {
        return prontoPago;
    }

    public double getServicioPublico() {
        return servicioPublico;
    }
 
    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public int getModelo() {
        return modelo;
    }
      
    public void carro(){
        marca = JOptionPane.showInputDialog("Escriba la marca del auto.");
        linea = JOptionPane.showInputDialog("Escriba la linea del auto.");
        modelo =Integer.parseInt(JOptionPane.showInputDialog("Escriba la modelo del auto."));
        
        JOptionPane.showMessageDialog(null,"El auto que escogio es un "+getMarca()+"\nde la linea "+getLinea()+" y su modelo es "+getModelo());
       
    }
      
}
