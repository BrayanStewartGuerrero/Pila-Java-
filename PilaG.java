/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Brayan Guerrero
 * @param <A>
 */
public class PilaG <A> {
    private NodoPilaG <A> cima;
    
    public PilaG(){cima = null;}
    
    public boolean pilaVacia(){
        return cima == null;
    }
    
    public void apilar(int dato){
        NodoPilaG aux = new NodoPilaG(dato,cima);
        cima = aux;
    }
    
    public A desapilar(){
        A dato = null;
        if(cima != null){
            dato = cima.getInformacion();
            cima = cima.getSiguiente();
        }
        else{
            System.out.println("La pila esta vacia");
        }
        
        return dato;
    }
    
    public void imprimirPila(){
        NodoPilaG aux = cima;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
}
