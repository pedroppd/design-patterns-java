package br.com.design.pattern.strategy;

import java.math.BigDecimal;

public class TaxCalculator {

    public TaxCalculator(){

    }

    public BigDecimal calculator(Orcamento orcamento, ITax tax){
        return tax.calculator(orcamento);
    }
}
