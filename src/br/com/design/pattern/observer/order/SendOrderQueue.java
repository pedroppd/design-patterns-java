package br.com.design.pattern.observer.order;

public class SendOrderQueue implements OrderRepository {

    @Override
    public void execute(Order order) {
        System.out.println("Sending order to queue");
    }
}
