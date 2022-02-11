package br.com.design.pattern.strategy;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal value;

    private int qtdItem;


    public Orcamento(BigDecimal value, int qtdItem){
        this.value = value;
        this.qtdItem = qtdItem;
    }

    public BigDecimal getValue(){
        return this.value;
    }

    public int getQtdItem(){
        return this.qtdItem;
    }
}
