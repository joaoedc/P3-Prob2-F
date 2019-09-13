
package P2_Prob3_2;

public class RetiradaNoLocal {
    
    private static RetiradaNoLocal instance;
    
    private RetiradaNoLocal() {
        
    }
    
    public static RetiradaNoLocal getInstance() {
        if (instance == null) {
            instance = new RetiradaNoLocal();
        }
        return instance;
    }
    
    private double calculaRetiradaNoLocal() {    
        return 0.00;
    }
}
