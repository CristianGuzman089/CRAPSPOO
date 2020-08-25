package craps;

public class Partida {

    private Dado dado1;
    private Dado dado2;

    public int getGanar() {
        return ganar;
    }

    public int getPerder() {
        return perder;
    }

    public int getCraps() {
        return craps;
    }

    public int getPrimerTiro() {
        return primerTiro;
    }
    public void setPrimerTiro(int primerTiro){
        this.primerTiro = primerTiro;
    }

    private final int ganar;
    private final int perder;
    private final int craps;

    private int primerTiro;

    public Partida() {
        dado1 = new Dado();
        dado2 = new Dado();

        ganar = 1;
        perder = 2;
        craps = 3;
    }

    public void lanzarDado() {
        dado1.lanzarDado();
        dado2.lanzarDado();
    }

    public String valorLanzada() {
        return Integer.toString(dado1.getValor() + dado2.getValor());
    }

    public int resultado() {
        int punto = Integer.parseInt(valorLanzada());
        if (primerTiro==0) {
            if ((punto == 7) || (punto == 11)) {
                return ganar;
            } else if ((punto == 2) || (punto == 3) || (punto == 12)) {
                return perder;
            } else {
                primerTiro = punto;
                return craps;
            }
        }else{
            if(punto==primerTiro){
                return ganar;
            }else if(punto==7){
                return perder;
            }else{
                return craps;
            }
        }
    }

}
