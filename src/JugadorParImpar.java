public class JugadorParImpar extends Jugador{


    int apuestaInicial=10;


    public JugadorParImpar(int id, int saldo,Banca banca,Ruleta ruleta) {
        super(id, saldo, banca,ruleta);
        this.apuesta=apuestaInicial;
    }

    @Override
    public void estrategia(){
        if(!isSaldoDisponible()){
            System.out.println("EL JUGADOR SE HA QUEDADO SIN SALDO");
        }
        else {
            saldo-=getApuesta();
            int numApuesta=(int)(Math.random()*2);

            if (ruleta.getNumeroGenerado()%2==numApuesta){
                banca.bancaPierde(apuesta*36);
                saldo+=apuesta*2;
                System.out.println("El jugador numero "+id+" ha ganado");
            }else {
                banca.bancaGana(apuesta);
                System.out.println("El jugador numero "+id+" ha perdido");
            }
        }

    }
}
