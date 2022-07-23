/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package com.mycompany.tarea1;

/**
 *
 * @author DONALD
 */
public class Tarea1 {

    double Peso;
    double Altura;
    double PesoKg;
    double AlturaMetros;

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setALtura(double ALtura) {
        this.Altura = ALtura;
    }
    
    public double convertirPeso(){
        PesoKg = Peso/2.205;
        return PesoKg;
    }
    
    public double convertirAltura(){
        AlturaMetros = Altura/100;
        return AlturaMetros;
    }
    
    public double calcularIMC(){
        double total;
        total=convertirPeso()/Math.pow(convertirAltura(),2);
        return total;
    }
    
    public String viewResultado(){
       
        String Rango = null;
        
        if(calcularIMC()<18.4){
            Rango = "Se encuentra en un estado desnutricion";
        }
        else if (calcularIMC()>18.4){
            Rango = "Se encuentra en un peso ideal";            
        }
        else if (calcularIMC()>24.9){
            Rango = "Se encuentra en un estado de obesidad";            
        }
        else if(calcularIMC()>29.9){
            Rango = "Se encuentra en un estado de sobrepeso";            
        }
        return Rango;
    }

    void setAltura(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
