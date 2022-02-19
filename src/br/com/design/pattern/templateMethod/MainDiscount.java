package br.com.design.pattern.templateMethod;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;

public class MainDiscount {

    public static void main(String[] args) {
        Orcamento o1 = new Orcamento(new BigDecimal("200"), 6);

        Orcamento o2 = new Orcamento(new BigDecimal("1000"), 1);

        DiscountCalculator calc = new DiscountCalculator();
        System.out.println(calc.calculator(o1));
        System.out.println(calc.calculator(o2));
    }
}
