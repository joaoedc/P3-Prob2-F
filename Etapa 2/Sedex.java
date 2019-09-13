package P2_Prob3_2;

public class Sedex implements EntregaInterface {

    private static Sedex instance;

    public Sedex() {
    }

    public static Sedex getInstance() {
        if (instance == null) {
            instance = new Sedex();
        }
        return instance;
    }

    @Override
    public double entrega(double peso, int quantidade) throws TipoEntregaInvalido {
        if (peso <= 500) {
            return 12.50;
        } else if (peso <= 750) {
            return 20;
        } else if (peso <= 1200) {
            return 30;
        } else if (peso <= 2000) {
            return 45;
        } else {
            return 45 + (((int) Math.ceil((peso - 2000) / 100.0)) * 1.50);
        }
    }
}
