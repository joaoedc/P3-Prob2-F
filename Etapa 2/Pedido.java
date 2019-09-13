package P2_Prob3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public final class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private EntregaInterface tipo;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero, String nomeCliente, String endereco, EntregaInterface tipo) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.setData(data);
        this.itens = new ArrayList<>(Arrays.asList());
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipo(EntregaInterface tipo) {
        this.tipo = tipo;
    }

    public void incluirItem(ItemPedido item) {
        itens.add(item);
    }

    public double getValorPedido() {
        double valor = 0;

        for (ItemPedido item : itens) {
            valor = valor + item.getValorItem();
        }

        return valor;
    }

    public double getValorEntrega() throws TipoEntregaInvalido {
        double valor = 0;
        int peso = 0;

        for (ItemPedido item : itens) {
            peso = peso + item.getProduto().getPeso() * item.getQuantidade();
        }

        Contexto contexto = new Contexto(tipo);
        valor = contexto.selecionaEntrega(peso, itens.size());

        return valor;
    }

    public double getValorTotal() throws TipoEntregaInvalido {
        return getValorPedido() + getValorEntrega();
    }

}
