package br.com.design.pattern.state;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class DiscountToBudgetWithValueGreatestThenFiveHundred extends Discount {

    public DiscountToBudgetWithValueGreatestThenFiveHundred(Discount discount){
        super(discount);
    }

    public BigDecimal calculator(Orcamento orcamento) {
        if(shouldApply(orcamento)) {
            return performCalculation(orcamento);
        }
        return this.next.calculator(orcamento);
    }

    @Override
    public BigDecimal performCalculation(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Orcamento orcamento) {
        return orcamento.getValue().compareTo(new BigDecimal("500")) > 0;
    }

}
