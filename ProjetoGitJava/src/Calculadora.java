/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 05021377205
 */
public class Calculadora {
   
    public double soma ( double num1, double num2 ){
       return num1 + num2;
       
    }
    
    public double subtracao ( double num1 , double num2){
        return num1 - num2 ;
    }
    
    public double divisao ( double num1 , double num2 ){
    return num1 / num2 ;
      
    }
    public double multiplicacao ( double num1 , double num2 ){
    return num1 * num2 ;
    
    }
    
public static void main (String [] args){
    double num1 = 10;
    double num2 = 20;
    Calculadora calculadora = new Calculadora();
    System.out.println(calculadora.subtracao(num1, num2));
     System.out.println(calculadora.divisao(num1, num2));
      System.out.println(calculadora.soma(num1, num2));
       System.out.println(calculadora.multiplicacao(num1, num2));
       
}
}
