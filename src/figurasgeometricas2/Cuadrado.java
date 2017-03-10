/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *clase que representa un cuadrado y un rectangulo con sus operaciones
 * @author JUAN DAVID
 */
public class Cuadrado {
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2;

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
    /**
     * Atributo que contiene la cordenada x4 y4
     */        
    private Punto punto4;
      /**
     * Guarda el perimetro del Cuadrado o rectangulo
     */
    private double perimetro;

    /**
     * constructor de la clase inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4 
     */
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * Este metodo retornara el perimetro de un cuadrado o un rectangulo
     * @return 
     */
    private double CalculoPerimetro(){
        //si los lados sin iguales retorna perimetro de un cuadrado
        if(darLado1()==darLado2() && darLado1()==darLado4() && darLado2()==darLado3()){
        this.perimetro=darLado1()*4;
    }   
        // sino retorna perimetro de un rectangulo
        else
            this.perimetro=darLado1()*2+darLado1()*2;
        return this.perimetro;
    }
    /**
     * Este metodo retorna el area de un cuadrado o un rectangulo
     * @return 
     */
    private double CalculoArea(){
       
        double lado1 = darLado1();
        double lado2 = darLado2();
        double lado3 = darLado3();
        double lado4 = darLado4();//si los lados sin iguales retorna el area de  un cuadrado
       double area;
       if(lado1==lado2 && lado1==lado4 && lado2==lado3){
             area=Math.pow(lado1,2);
        }
        else
            area=lado1*lado2;
        return area;  
    }
    /**
     * retorna el tipo de figura que es cuadrado o rectangulo
     * @return 
     */
    public String Tipo() {
            String resultado=" ";
            double lado1=  darLado1();
            double lado2 = darLado2();
            double lado3 = darLado3();
            double lado4 = darLado4();
            if(lado1==lado2 && lado1==lado4 && lado2==lado3){
            resultado=" Cuadrado";
            }
            else
            {
            resultado="Rectangulo";
            }
            
        return resultado;
        }
    /**
     * imprime todos los metodos
     */
    public void darResultado(){
        System.out.println("Lado1: " + darLado1());
        System.out.println("Lado2: " + darLado2());
        System.out.println("Lado3: " + darLado3());
        System.out.println("Lado4: " + darLado4());
        System.out.println("perimetro "+CalculoPerimetro());
        System.out.println("Area "+CalculoArea());
        System.out.println("Tipo de Figura"+Tipo());
    }
     /**
      * retorna verdadero si es un cuadrado o falso de no ser asi
      * @return 
      */
    private boolean isCuadrado() {
        if(darLado1()==darLado2() && darLado1()==darLado4() && darLado2()==darLado3()){
            System.out.print("Es un cuadrado");
        }
        else 
            System.out.print("Es un rectangulo");
        return true;
    }
    /**
     * Retorna longitud de lado 1
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna longitud de lado 2
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna longitud del lado 3
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    } 
     /**
    * Retorna longitud del lado 4
    * @return
    */
    private double darLado4(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
      * retorna los datos x1 y1
      * @return 
      */
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * modifica x1 y1
     * @param punto1 
     */

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * retorna los datos x2 y2
     * @return 
     */

    public Punto getPunto2() {
        return punto2;
    }
    /**
     * modifica x2 y2
     * @param punto2 
     */

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    /**
     * retorna los datos x3 y3
     * @return 
     */

    public Punto getPunto3() {
        return punto3;
    }
    /**
     * modifica x3 y3
     * @param punto3 
     */

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /**
     * retorna los datos x4 y4
     * @return 
     */

    public Punto getPunto4() {
        return punto4;
    }
    /**
     * modifica x4 y4
     * @param punto4 
     */

    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
  
   
    
}
