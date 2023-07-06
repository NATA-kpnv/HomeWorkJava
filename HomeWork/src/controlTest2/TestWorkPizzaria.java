package controlTest2;
import controlTest2.api.*;
import controlTest2.models.*;
import controlTest2.pizzasMainMenu.*;
import controlTest2.api.*;
import controlTest2.models.*;
import controlTest2.pizzasMainMenu.*;
import java.util.ArrayList;
import java.util.List;

public class TestWorkPizzaria {
    public static void main(String[] args) {
        PizzeriaSmakata smakata = new PizzeriaSmakata();

        Menu menuSmakata = smakata.createMenu();

        smakata.getMenu();

        Ticket ticket1 = smakata.createOrder();
        ticket1.getOrder().addPizza(new Margherita(), 5);
        ticket1.getOrder().addPizza(new Pepperoni(), 10);
        ticket1.getOrder().orderStart();



        Ticket ticket2 = smakata.createOrder();
        ticket2.getOrder().addPizza(new Margherita(), 5);
        Pizza cheff = menuSmakata.getPizzaByName("ШефПицца");
        ticket2.getOrder().addPizza(cheff, 5);


        ticket1.getOrder().orderCooking();
        ticket1.getTime();
        List<String> result1 = smakata.issueOrder(ticket1);

        for (String pizzaName : result1) {
            System.out.println(pizzaName);
        }
        List<String> stages1 =  ticket1.getOrder().getStages();
        for (String stage1 : stages1) {
            System.out.println(stage1);
        }



        ticket2.getOrder().orderStart();
        ticket2.getOrder().orderCooking();
        ticket2.getTime();
        ticket2.getOrder().orderFinish();
        List<String> stages2 =  ticket2.getOrder().getStages();
        for (String stage2 : stages2) {
            System.out.println(stage2);
        }
        List<String> result2 = smakata.issueOrder(ticket2);
        for (String pizzaName : result2) {
            System.out.println(pizzaName);
        }

    }



}
