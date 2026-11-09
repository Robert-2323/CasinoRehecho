public class Ruleta {
    static int numeroGenerado;

    public Ruleta(){}

    public synchronized void generarNumero(){
        numeroGenerado=(int)(Math.random()*37);
    }
    public synchronized int getNumeroGenerado(){
        return numeroGenerado;
    }
}
