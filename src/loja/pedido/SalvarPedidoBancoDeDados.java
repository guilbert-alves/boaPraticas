package loja.pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido{

    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
