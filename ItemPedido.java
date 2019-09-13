package P2_Prob3_2;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Nenhum produto informado");
        } else {
            this.produto = produto;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade do pedido invalido");
        } else {
            this.quantidade = quantidade;
        }    
    }

    public double getValorItem() {
        return this.produto.getValor() * this.quantidade;
    }

}
