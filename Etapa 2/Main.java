package P2_Prob3_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Produto produtoPapelA4 = new Produto("Papel A4", 0.50, 1);
        Produto produtoFolhaVegetal = new Produto("Folha Vegetal", 1.50, 10);
        Produto produtoCaneta = new Produto("Caneta", 10, 750);

        ItemPedido item1 = new ItemPedido(produtoPapelA4, 10);
        ItemPedido item2 = new ItemPedido(produtoFolhaVegetal, 10);
        ItemPedido item3 = new ItemPedido(produtoCaneta, 10);

        Pedido pedido1 = new Pedido(1, "Lara", "Rua Transvylvania", new Sedex());
        pedido1.incluirItem(item1);
        pedido1.incluirItem(item2);
        pedido1.incluirItem(item3);

        Pedido pedido2 = new Pedido(1, "Jaimir", "Brasil", new Pac());
        pedido2.incluirItem(item1);
        pedido2.incluirItem(item2);
        pedido2.incluirItem(item3);

        Pedido pedido3 = new Pedido(1, "Sônia", "Europa", new RetiradaNoLocal());
        pedido3.incluirItem(item1);
        pedido3.incluirItem(item2);
        pedido3.incluirItem(item3);

        Pedido pedido4 = new Pedido(1, "Bill", "New York", new Motoboy());
        pedido4.incluirItem(item1);
        pedido4.incluirItem(item2);
        pedido4.incluirItem(item3);

        try {
            System.out.println("Valor Entrega local: " + pedido3.getValorEntrega());
            System.out.println("Valor Total local: " + pedido3.getValorTotal());

            System.out.println("Valor Entrega SEDEX: " + pedido1.getValorEntrega());
            System.out.println("Valor Total SEDEX: " + pedido1.getValorTotal());

            System.out.println("Valor Entrega PAC: " + pedido2.getValorEntrega());
            System.out.println("Valor Total PAC: " + pedido2.getValorTotal());

            System.out.println("Valor Entrega Motoboy: " + pedido4.getValorEntrega());
            System.out.println("Valor Total Motoboy: " + pedido4.getValorTotal());
        } catch (TipoEntregaInvalido ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
