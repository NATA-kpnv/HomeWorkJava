package controlTest2;
import controlTest2.api.*;
import controlTest2.models.*;
import controlTest2.pizzasMainMenu.*;

import java.util.ArrayList;
import java.util.List;

public class PizzeriaSmakata implements Pizzeria {
    public Menu menu;
    public List<Ticket> tickets;

    public PizzeriaSmakata() {
        this.tickets = new ArrayList<>();
    }

    @Override
    public Menu createMenu() {
        Menu menu = new Menu();
        Pizza margherita = new Margherita();
        Pizza pepperoni = new Pepperoni();
        Pizza chefsPizza = new Pizza("ШефПицца", 50);
        menu.addPizza(margherita, 40);
        menu.addPizza(pepperoni, 60);
        menu.addPizza(chefsPizza, 60);
        this.menu = menu;
        return menu;
    }

    @Override
    public void getMenu() {
        menu.getMenu();
    }

    private int getNextOrderNumber() {
        int maxNumber = 0;
        if (tickets== null){
            return maxNumber;
        }
        for (Ticket ticket : tickets) {
            int number = ticket.getNumber();
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber + 1;
    }
    @Override
    public Ticket createOrder() {
        int number = getNextOrderNumber();
        Order order = new Order(number);
        Ticket ticket = new Ticket(order);
        tickets.add(ticket);
        return ticket;
    }

    @Override
    public String getOrderStatus(Ticket ticket) {
        List<String> stages = ticket.getOrder().getStages();
        StringBuilder stringBuilder = new StringBuilder();
        for (String stage : stages) {
            stringBuilder.append(stage).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public List<String> issueOrder(Ticket ticket) {
        if(ticket.getOrder().isReady()){
            List<String> pizzasName = ticket.getOrder().getPizzasName();
            pizzasName.add(0,  ticket.getOrder().getName() + " готов:");
            return pizzasName;
        }
        List<String> notReady = new ArrayList<>();
        notReady.add("Не готов" + ticket.getOrder().getName());
        return notReady;
    }


}
