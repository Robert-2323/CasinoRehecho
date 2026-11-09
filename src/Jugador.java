public abstract class Jugador extends Thread {
     int id;
    int saldo;
    boolean saldoDisponible;
    int apuesta;
    boolean ganador;
     Banca banca;
     Ruleta ruleta;

    public Jugador(int id, int saldo,Banca banca,Ruleta ruleta) {}

    @Override
    public void run(){
        estrategia();
    }
    public boolean isSaldoDisponible(){
        if (saldo<0){
            return saldoDisponible=false;
        }else {
            return saldoDisponible=true;
        }

    }
    public int getApuesta(){
        return apuesta;
    }
    public void estrategia(){}


}
