package br.com.design.orcamento;

import br.com.design.orcamento.imposto.INSS;
import br.com.design.orcamento.imposto.IRPF;
import br.com.design.orcamento.imposto.TaxCalculator;
import br.com.design.orcamento.model.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("50000"));
        TaxCalculator TaxCalculator = new TaxCalculator();
        BigDecimal inss = TaxCalculator.calculator(orcamento, new INSS());
        BigDecimal irpf =  TaxCalculator.calculator(orcamento, new IRPF());
        System.out.println(inss);
        System.out.println(irpf);
    }
}
