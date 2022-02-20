package br.com.design.pattern.observer.situation;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class Approved extends BudgetSituation {

    public BigDecimal calculateExtraDiscount(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.02"));
    }

    public void finish(Orcamento orcamento) {
        orcamento.setSituation(new Finished());
    }
}
