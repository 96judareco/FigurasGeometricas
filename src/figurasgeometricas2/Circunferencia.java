/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *Clase representa un circulo y sus opereaciones
 * @author JUAN DAVID Reyes
 */
public class Circunferencia {
    
    /**
     * atributo contiene el area
     */
    private double radio1;
    /**
     * guarda el perimetro
     */
    private double perimetro1;
    /**
     * guarda el area
     */
    private double area1;
     /**
     * constructor inicia las variables
     */
    public Circunferencia(double radio1) {
        this.radio1 = radio1;
       
    }

    
    public double getRadio1() {
        return radio1;
    }
    private double CalcularPeri(){
       this.perimetro1=2*Math.PI*radio1;
       return this.perimetro1;
    }


     private double CalcularArea(){
       // this.area1=Math.PI* double Math.pow(radio1,2);//radio1*radio1;
       this.area1=Math.PI*radio1*radio1;
         return this.area1;        
     }  

    public double getArea1() {
        return area1;
    }
     public void darResutado(){
         System.out.println("El area es: "+CalcularArea());
         System.out.println("El perimetro es: "+CalcularPeri());
     }
   }
    

