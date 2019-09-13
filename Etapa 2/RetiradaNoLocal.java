
package P2_Prob3_2;

public class RetiradaNoLocal implements Strategy {
    
    private static RetiradaNoLocal instance;
    
    private RetiradaNoLocal() {        
    }
    
    public static RetiradaNoLocal getInstance() {
        if (instance == null) {
            instance = new RetiradaNoLocal();
        }
        return instance;
    }

    @Override
    public double calculoTipoEntrega(double peso, double quantidade) throws TipoEntregaInvalido {
        return 0.00;
    }
}
