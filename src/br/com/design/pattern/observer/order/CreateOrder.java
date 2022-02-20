package br.com.design.pattern.observer.order;

import br.com.design.pattern.strategy.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class CreateOrder {

    public static void main(String[] args) {
        Orcamento o1 = new Orcamento(new BigDecimal("23"), 3);
        Order order = new Order("João", LocalDateTime.now(), o1);
        OrderHandler handler = new OrderHandler(Arrays.asList(new SendEmailOrder(), new SendOrderQueue()));
        handler.executa(order);
    }
}
