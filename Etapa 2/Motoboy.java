package P2_Prob3_2;

public class Motoboy implements EntregaInterface {

    private static Motoboy instance;

    public Motoboy() {
    }

    public static Motoboy getInstance() {
        if (instance == null) {
            instance = new Motoboy();
        }
        return instance;
    }

    @Override
    public double entrega(double peso, int quantidade) throws TipoEntregaInvalido {
        if (peso < 25000 && quantidade < 30) {
            return 7;
        } else {
            throw new TipoEntregaInvalido("Quantidade ou peso incompativeis");
        }
    }

}
