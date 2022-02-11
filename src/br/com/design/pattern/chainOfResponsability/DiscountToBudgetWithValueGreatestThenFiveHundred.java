package br.com.design.pattern.chainOfResponsability;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class DiscountToBudgetWithValueGreatestThenFiveHundred extends Discount{

    public DiscountToBudgetWithValueGreatestThenFiveHundred(Discount discount){
        super(discount);
    }

    public BigDecimal calculator(Orcamento orcamento){
        if(orcamento.getValue().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValue().multiply(new BigDecimal("0.1"));
        }
        return this.next.calculator(orcamento);
    }

    }
