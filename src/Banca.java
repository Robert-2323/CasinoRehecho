public class Banca {
    private int saldo;
    private boolean bancaActiva=true;


    public Banca(int saldo){
        this.saldo=saldo;
    }

    public boolean isBancaActiva(){
        try {
            if (bancaActiva && saldo > 0) {
                return true;
            } else {
                return false;
            }
        }catch (InterruptedException e){

        }

    }

    public synchronized void bancaGana(int premio){
        saldo+=premio;
    }

    public synchronized void bancaPierde(int perdida){
        if (perdida>saldo){
            System.out.println("La banca no tiene dinero");
            bancaActiva=false;
        }else {
            saldo-=perdida;
        }
    }




}
