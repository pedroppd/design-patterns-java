package br.com.design.pattern.state;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public abstract class Discount {

    public Discount next;

    public Discount(Discount next){
        this.next = next;
    }

    public BigDecimal calculator(Orcamento orcamento) {
        if(shouldApply(orcamento)) {
            return performCalculation(orcamento);
        }

        return this.next.calculator(orcamento);
    }

    public abstract BigDecimal performCalculation(Orcamento orcamento);

    public abstract boolean shouldApply(Orcamento orcamento);

}
