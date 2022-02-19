package br.com.design.pattern.state.situation;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class BudgetSituation {

    public BigDecimal calculateExtraDiscount(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void approve(Orcamento orcamento) {
        throw new IllegalArgumentException("Cannot update budget situation to approved");
    }

    public void reprove(Orcamento orcamento) {
        throw new IllegalArgumentException("Cannot update budget situation to reprove");
    }

    public void finish(Orcamento orcamento) {
        throw new IllegalArgumentException("Cannot update budget situation to finish");
    }

    public void underAnalysis(Orcamento orcamento) {
        throw new IllegalArgumentException("Cannot update budget situation to under analysis");
    }

}
