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
public class NodoPila {
    private int informacion;
    private NodoPila siguiente;

    public NodoPila (int informacion, NodoPila siguiente){
        this.informacion = informacion;
        this.siguiente = siguiente;
    }

    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}