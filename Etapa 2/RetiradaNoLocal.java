package P2_Prob3_2;

public class RetiradaNoLocal implements EntregaInterface {

    private static RetiradaNoLocal instance;

    RetiradaNoLocal() {
    }

    public static RetiradaNoLocal getInstance() {
        if (instance == null) {
            instance = new RetiradaNoLocal();
        }
        return instance;
    }

    @Override
    public double entrega(double peso, int quantidade) throws TipoEntregaInvalido {
        return 0.00;
    }
}
