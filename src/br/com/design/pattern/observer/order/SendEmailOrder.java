package br.com.design.pattern.observer.order;

public class SendEmailOrder implements OrderRepository {

    @Override
    public void execute(Order order) {
        System.out.println("Sending email to order from :" + order.getClient());
    }
}
