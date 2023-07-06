package controlTest2.api;
import controlTest2.models.*;

import java.util.List;

public interface Pizzeria {
    Menu createMenu();
    void getMenu();

    Ticket createOrder();
    String getOrderStatus(Ticket ticket);
    List<String> issueOrder(Ticket ticket);
}
