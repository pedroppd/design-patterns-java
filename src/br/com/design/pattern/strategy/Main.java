package br.com.design.pattern.strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("50000"), 2);
        TaxCalculator TaxCalculator = new TaxCalculator();
        BigDecimal inss = TaxCalculator.calculator(orcamento, new INSS());
        BigDecimal irpf =  TaxCalculator.calculator(orcamento, new IRPF());
        System.out.println(inss);
        System.out.println(irpf);
    }
}
