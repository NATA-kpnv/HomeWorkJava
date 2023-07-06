package controlTest2.models;
import java.time.LocalDateTime;

public class Ticket {

    private Order order;
    private LocalDateTime time;

    public Ticket(Order  order) {
        this.order = order;
        this.time = LocalDateTime.now();
    }
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getNumber(){
        return order.getNumber();
    }
}
