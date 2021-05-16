package Pilas;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Brayan Guerrero y Lina Silva
 */
public class Test {
    public static void main (String[]args){
        Pila pila = new Pila();
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(2);
        pila.apilar(-6);
        
        System.out.println("Pila Inicial");
        pila.imprimirPila();
        
        //Repetir y Repetir Recursivo
        System.out.println("------------------");
        System.out.println("Repetir");
        pila.repetir(pila, 2);
        pila.imprimirPila();
         
        //Desapilar y Reapilar la Pila
        pila.vaciarPila();
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(2);
        pila.apilar(-6);
        
        System.out.println("------------------");
        System.out.println("Repetir Recursivo");
        pila.repetirRecursivo(pila, 2);
        pila.imprimirPila();
        
        //Desapilar y Reapilar la Pila
        pila.vaciarPila();
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(2);
        pila.apilar(-6);
        
        //Reorganizar y Reorganizar Recursivo
        System.out.println("------------------");
        System.out.println("Reorganizar");
        pila.reorganizar(pila.getCima(), 4).imprimirPila();
        
        System.out.println("------------------");
        System.out.println("Reorganizar Recursivo");
        pila.reorganizarRecursivo(pila, 4);
        pila.imprimirPila();
        
        //Desapilar y Reapilar la Pila
        pila.vaciarPila();
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(2);
        pila.apilar(-6);
        
        //Sumar y Sumar Recursivo
        System.out.println("------------------");
        System.out.println("Sumar");
        pila.sumar(pila).imprimirPila();
        
        //Desapilar y Reapilar la Pila
        pila.vaciarPila();
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(2);
        pila.apilar(-6);
        
        System.out.println("------------------");
        System.out.println("Sumar Recursivo");
        pila.sumarRecursivo(pila.getCima(),0);
        pila.imprimirPila();
    }
}
