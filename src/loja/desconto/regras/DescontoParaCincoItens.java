package loja.desconto.regras;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaCincoItens extends Desconto {

    public DescontoParaCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
