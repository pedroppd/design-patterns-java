package br.com.design.orcamento.model;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal value;

    public Orcamento(BigDecimal value){
        this.value = value;
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
