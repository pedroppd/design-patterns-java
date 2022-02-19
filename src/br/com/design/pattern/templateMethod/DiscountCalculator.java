package br.com.design.pattern.templateMethod;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculator(Orcamento orcamento){
        Discount discount = new DiscountToBudgetMoreWithFiveItems(
                            new DiscountToBudgetWithValueGreatestThenFiveHundred(
                            new NoDiscount()
                            ));
       return discount.calculator(orcamento);
    }
}
