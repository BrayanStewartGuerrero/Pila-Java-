public class NodoPilaG <A> {
    private A informacion;
    private NodoPilaG <A>  siguiente;

    public NodoPilaG (A informacion, NodoPilaG siguiente){
        this.informacion = informacion;
        this.siguiente = siguiente;
    }

    public A getInformacion() {
        return informacion;
    }

    public void setInformacion(A informacion) {
        this.informacion = informacion;
    }

    public NodoPilaG<A> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilaG<A> siguiente) {
        this.siguiente = siguiente;
    }
}

