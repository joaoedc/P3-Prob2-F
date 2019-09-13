
package P2_Prob3_2;

public class Motoboy implements Strategy{

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
    public double calculoTipoEntrega(double peso, double quantidade) throws TipoEntregaInvalido {
        if (peso < 25000 && quantidade < 30) {
           return 7;
        } else {
            throw new TipoEntregaInvalido("Quantidade ou peso incompativeis");
        }
    }
    
}
