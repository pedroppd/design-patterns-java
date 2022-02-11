package br.com.design.pattern.chainOfResponsability;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class DiscountToBudgetMoreWithFiveItems extends Discount{

    public DiscountToBudgetMoreWithFiveItems(Discount discount){
        super(discount);
    }

    public BigDecimal calculator(Orcamento orcamento){
        if(orcamento.getQtdItem() > 5){
            return orcamento.getValue().multiply(new BigDecimal("0.1"));
        }
        return this.next.calculator(orcamento);
    }

    }
