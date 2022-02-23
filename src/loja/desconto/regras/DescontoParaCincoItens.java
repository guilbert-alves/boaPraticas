package loja.desconto.regras;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaCincoItens extends Desconto{

    public DescontoParaCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
