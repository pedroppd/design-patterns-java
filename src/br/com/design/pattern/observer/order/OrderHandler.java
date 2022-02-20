package br.com.design.pattern.observer.order;

import java.util.List;

public class OrderHandler {

  private List<OrderRepository> repositoties;

  public OrderHandler( List<OrderRepository> repositoties) {
    this.repositoties = repositoties;
  }

  public void executa(Order order) {
    this.repositoties.stream().forEach( x -> executa(order));
  }
}
