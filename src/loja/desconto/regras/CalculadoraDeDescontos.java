package loja.desconto.regras;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaCincoItens(new DescontoValorAcimaDeQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
