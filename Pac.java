package P2_Prob3_2;

public class Pac implements EntregaInterface {

    private static Pac instance;

    Pac() {

    }

    public static Pac getInstance() {
        if (instance == null) {
            instance = new Pac();
        }
        return instance;
    }

    @Override
    public double entrega(double peso) throws TipoEntregaInvalido {
        if (peso <= 1000) {
            return 10;
        } else if (peso < 2000) {
            return 15;
        } else if (peso < 3000) {
            return 20;
        } else if (peso < 5000) {
            return 30;
        } else {
            throw new TipoEntregaInvalido("Tipo de entrega não suportado");
        }
    }
}
