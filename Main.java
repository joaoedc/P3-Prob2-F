/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicolas
 */
public class Main {

    public static void main(String[] args) {
        Produto produtoPapelA4 = new Produto("Papel A4", 0.50, 1);
        Produto produtoPapelao = new Produto("Papelão", 1, 100);
        Produto produtoFolhaVegetal = new Produto("Folha Vegetal", 1.50, 10);
        Produto produtoCartao = new Produto("Cartão", 4, 50);
        Produto produtoCaneta = new Produto("Caneta", 10, 750);

        ItemPedido item1 = new ItemPedido(produtoPapelA4, 10);
        ItemPedido item2 = new ItemPedido(produtoPapelao, 2);
        ItemPedido item3 = new ItemPedido(produtoFolhaVegetal, 10);
        ItemPedido item4 = new ItemPedido(produtoCartao, 5);
        ItemPedido item5 = new ItemPedido(produtoCaneta, 10);

        Pedido pedido = new Pedido(1, "Lara", "Rua Transvylvania");
        pedido.incluirItem(item1);
        pedido.incluirItem(item3);
        pedido.incluirItem(item5);

        try {
            pedido.setTipo(TipoEntrega.LOCAL);
            System.out.println("Valor Entrega local: " + pedido.getValorEntrega());
            System.out.println("Valor Total local: " + pedido.getValorTotal());

            pedido.setTipo(TipoEntrega.SEDEX);
            System.out.println("Valor Entrega SEDEX: " + pedido.getValorEntrega());
            System.out.println("Valor Total SEDEX: " + pedido.getValorTotal());

            pedido.setTipo(TipoEntrega.PAC);
            System.out.println("Valor Entrega PAC: " + pedido.getValorEntrega());
            System.out.println("Valor Total PAC: " + pedido.getValorTotal());
        } catch (TipoEntregaInvalido ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
