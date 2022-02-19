package br.com.design.pattern.strategy;

import br.com.design.pattern.state.situation.Approved;
import br.com.design.pattern.state.situation.BudgetSituation;
import br.com.design.pattern.state.situation.UnderAnalysis;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal value;

    private int qtdItem;

    private BudgetSituation situation;

    public Orcamento(BigDecimal value, int qtdItem) {
        this.value = value;
        this.qtdItem = qtdItem;
        this.situation = new UnderAnalysis();
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int getQtdItem() {
        return this.qtdItem;
    }

    public void applyDiscountExtra() {
        BigDecimal extraValue = this.situation.calculateExtraDiscount(this);
        this.value = this.value.subtract(extraValue);
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public void aprove() {
        this.situation.approve(this);
    }

    public void reprove() {
        this.situation.reprove(this);
    }

    public void finish() {
        this.situation.finish(this);
    }
}
