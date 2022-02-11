package br.com.design.pattern.chainOfResponsability;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public abstract class Discount {

    public Discount next;

    public Discount(Discount next){
        this.next = next;
    }

    public abstract BigDecimal calculator(Orcamento orcamento);
}
