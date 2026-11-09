//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ruleta ruleta=new Ruleta();
        Banca banca=new Banca(50000);
        Jugador[] jugadores=new Jugador[12];

        for (int i=0;i<4;i++){
            JugadorMartingala martingala = new JugadorMartingala(i,1000,banca,ruleta);
            jugadores[i]=martingala;
        }

        for (int i=4;i<8;i++){
            JugadorNum numero=new JugadorNum(i,1000,banca,ruleta);
            jugadores[i]=numero;
        }

        for (int i=8;i<12;i++){
            JugadorParImpar parImpar = new JugadorParImpar(i,1000,banca,ruleta);
            jugadores[i]=parImpar;
        }
        for (int i=0;i< jugadores.length;i++){
            jugadores[i].start();
        }

        while (banca.isBancaActiva()){
            ruleta.generarNumero();


        }
    }
}