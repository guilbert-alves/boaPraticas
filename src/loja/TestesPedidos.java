package loja;

import loja.orcamento.Orcamento;
import loja.pedido.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "Rodrigo Santos";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBancoDeDados(), new EnviarEmailPedido()));
        handler.execute(gerador);
     }
}
