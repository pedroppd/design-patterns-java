package br.com.design.pattern.chainOfResponsability;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount(){
        super(null);
    }

    public BigDecimal calculator(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

}
