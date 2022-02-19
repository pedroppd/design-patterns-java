package br.com.design.pattern.state.situation;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class UnderAnalysis extends BudgetSituation {

    public BigDecimal calculateExtraDiscount(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.05"));
    }

    public void aprove(Orcamento orcamento) {
        orcamento.setSituation(new Approved());
    }

    public void reprove(Orcamento orcamento) {
        orcamento.setSituation(new Reproved());
    }


}
