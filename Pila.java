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
public class Pila {
    private NodoPila cima;
    
    public Pila(){cima = null;}
    
    //METODOS GETTER AND SETTER DE PILA 
    //Y SU RESPECTIVO METODO QUE DICE QUE ESTÁ O NO VACIA LA PILA
    public boolean pilaVacia(){
        return cima == null;
    }
    
    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    //METODOS DE APILAR Y DESAPILAR 
    public void apilar(int dato){
        NodoPila aux = new NodoPila(dato,cima);
        cima = aux;
    }
    
    public int desapilar(){
        int dato = 0;
        if(cima != null){
            dato = cima.getInformacion();
            cima = cima.getSiguiente();
        }
        else{
            System.out.println("La pila esta vacia");
        }
        
        return dato;
    }
    
    //METODOS PARA RECORRER E IMPRIMIR LA PILA
    public void recorrido(){
        NodoPila aux = cima;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
    
    public void imprimirPila(){
        NodoPila aux = cima;
        while(aux != null){
            System.out.println(aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }

    //METODOS DE REPETIR Y REPETIR RECURSIVO
    public void repetir (Pila p, int n){
        Pila p2 = new Pila();
        
        while(!p.pilaVacia()){
            int elemento = p.desapilar();
            for(int i = 0; i < n; i++){
                p2.apilar(elemento);
            }
        }
        while(!p2.pilaVacia()){
            p.apilar(p2.desapilar());
        }
    }

    public void repetirRecursivo(Pila p, int n){
        int elemento;
        if (!pilaVacia()){
            elemento = p.desapilar();
            repetirRecursivo(p,n);
            for(int i = 0; i<n; i++){
                p.apilar(elemento);
            }
        }
    }
    
    //METODOS DE REORGANIZAR Y REORGANIZAR RECURSIVO
    public Pila reorganizar(NodoPila cima, int dato){
        Pila p = new Pila();
        Pila aux = new Pila();
        while(cima != null){
            if(cima.getInformacion() != dato) aux.apilar(cima.getInformacion());
            cima = cima.getSiguiente();
        }
        while(!aux.pilaVacia()){
            p.apilar(aux.desapilar());
        }
        p.apilar(dato);
        return p;
    }
    
    public void reorganizar(Pila p, int dato){
        int elemento;
        if(!p.pilaVacia()){
            elemento = p.desapilar();
            if(elemento != dato){
                reorganizar(p,dato);
                p.apilar(elemento);
            }
        }
    }
    
    public void reorganizarRecursivo(Pila p, int dato){
        reorganizar(p,dato);
        p.apilar(dato);
    }
    
    //METODOS DE SUMAR Y SUMAR RECURSIVO
    public Pila sumar(Pila p){
        Pila p2 = new Pila();
        int suma = p.sumarNodos();
        while(!p.pilaVacia()){
            if(p.cima.getInformacion() == suma){
                p2.apilar(0);
                p2.apilar(p.desapilar());
            }
            else p2.apilar(p.desapilar());
        }
        return p2;
    }
    
    public Integer sumarRecursivo(NodoPila aux, int suma){
        int resultado;
        if(aux != null){
            resultado = sumarRecursivo(aux.getSiguiente(), suma+aux.getInformacion());
            if(aux.getInformacion()==resultado){
                aux.setSiguiente(new NodoPila(0, aux.getSiguiente()));
            }
        }
        else{
            resultado = suma;
        }
        return resultado;
    }
    
    //METODOS EXTRA 
    //Metodo que retorna el tamaño de la pila
    public Integer tamañoPila(){
        int tamaño = 0;
        NodoPila aux = cima;
        while(aux != null){
            aux = aux.getSiguiente();
            tamaño++;
        }
        return tamaño;
    }
    
    //Metodo que retorna si existe o no el dato dentro de la pila
    public boolean buscarNodo(int dato){
        boolean respuesta = false;
        NodoPila aux = cima;
        while(aux != null){
            if(aux.getInformacion() == dato){
                respuesta = true;
                break;
            }
            aux = aux.getSiguiente();
        }
        return respuesta;
    }
    
    //Metodo para vaciar la pila
    public void vaciarPila(){
        int x = 0;
        while(!pilaVacia()){
            x = desapilar();
        }
    }
    
    //Metodo que returna la suma de los valores de cada nodo de una pila
    public Integer sumarNodos(){
        int suma = 0;
        NodoPila aux = cima;
        while(aux != null){
            suma += aux.getInformacion();
            aux = aux.getSiguiente();
        }
        return suma;
    }
}
