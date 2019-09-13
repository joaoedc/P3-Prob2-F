package P2_Prob3_2;


import P2_Prob3_2.EntregaInterface;
import P2_Prob3_2.TipoEntregaInvalido;

public class Contexto {

    private EntregaInterface entrega;

    public Contexto(EntregaInterface entrega) {
        this.entrega = entrega;
    }

    public Double selecionaEntrega(double peso) throws TipoEntregaInvalido {
        return entrega.entrega(peso);
    }

}
