package br.com.design.pattern.strategy;

import java.math.BigDecimal;

public interface ITax {
    public BigDecimal calculator(Orcamento orcamento);
}
