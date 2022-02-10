package br.com.design.orcamento.imposto;

import br.com.design.orcamento.model.Orcamento;

import java.math.BigDecimal;

public interface ITax {
    public BigDecimal calculator(Orcamento orcamento);
}
