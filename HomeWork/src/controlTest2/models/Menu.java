package controlTest2.models;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private Map<Pizza, Double> menu;

    public Menu() {
        this.menu = new HashMap<>();
    }

    public void addPizza(Pizza pizza,  double price) {
        menu.put(pizza, price);
    }


    public Pizza getPizzaByName(String name) {
        for (Map.Entry<Pizza, Double> entry : menu.entrySet()) {
            Pizza pizza = entry.getKey();
            if (pizza.getName().equals(name)) {
                return pizza;
            }
        }
        return null; // Return null if the pizza is not found
    }

    public void getMenu() {
        for (Map.Entry<Pizza, Double> entry : menu.entrySet()) {
            Pizza pizza = entry.getKey();
            Double info = entry.getValue();
            String output = pizza.toString() +  ", Цена - " + info;
            System.out.println(output);
        }
    }


}
