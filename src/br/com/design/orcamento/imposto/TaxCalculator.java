package br.com.design.orcamento.imposto;

import br.com.design.orcamento.model.Orcamento;

import java.math.BigDecimal;

public class TaxCalculator {

    public TaxCalculator(){

    }

    public BigDecimal calculator(Orcamento orcamento, ITax tax){
        return tax.calculator(orcamento);
    }
}
