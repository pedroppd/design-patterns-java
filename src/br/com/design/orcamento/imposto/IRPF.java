package br.com.design.orcamento.imposto;

import br.com.design.orcamento.model.Orcamento;

import java.math.BigDecimal;

public class IRPF implements ITax {
    @Override
    public BigDecimal calculator(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.4"));
    }
}
