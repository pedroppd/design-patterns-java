package br.com.design.pattern.observer.order;

import br.com.design.pattern.strategy.Orcamento;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime date;
    private Orcamento orcamento;

    public Order(String client, LocalDateTime date, Orcamento orcamento) {
        this.client = client;
        this.date = date;
        this.orcamento = orcamento;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
