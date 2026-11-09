public class JugadorMartingala extends Jugador{
    int apuestaInicial=10;

    public JugadorMartingala(int id,int saldo,Banca banca,Ruleta ruleta){
        super(id,saldo,banca,ruleta);
        this.apuesta=apuestaInicial;
    }

    @Override
    public void estrategia(){
        if(!isSaldoDisponible()){
            System.out.println("EL JUGADOR SE HA QUEDADO SIN SALDO");
        }
        else {
            saldo-=getApuesta();
            int numApuesta=(int)(Math.random()*37);

            if (ruleta.getNumeroGenerado()==numApuesta){
                banca.bancaPierde(apuesta*36);
                saldo+=apuesta*36;
                System.out.println("El jugador "+id+" ha ganado");
            }else {
                banca.bancaGana(apuesta);
                apuesta=apuesta*2;
            }
        }

    }
}
