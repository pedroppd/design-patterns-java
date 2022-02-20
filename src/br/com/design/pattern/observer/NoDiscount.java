package br.com.design.pattern.observer;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount(){
        super(null);
    }

    public BigDecimal calculator(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal performCalculation(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Orcamento orcamento) {
        return true;
    }

}
