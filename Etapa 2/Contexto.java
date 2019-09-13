package P2_Prob3_2;

public class Contexto {

    private EntregaInterface entrega;

    public Contexto(EntregaInterface entrega) {
        this.entrega = entrega;
    }

    public Double selecionaEntrega(double peso, int quantidade) throws TipoEntregaInvalido {
        return entrega.entrega(peso, quantidade);
    }

}
