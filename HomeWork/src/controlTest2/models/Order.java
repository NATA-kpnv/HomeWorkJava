package controlTest2.models;

import controlTest2.api.OrderStage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private int number;
  //  private List<Pizza> pizzas;

    private Map<Pizza, Integer> pizzas;
    private List<OrderStage> orderStages;
    private List<String> stages;

    private boolean isReady;


    public Order(int number, Map<Pizza, Integer> pizzas) {
        this.number = number;
        this.pizzas = pizzas;
        this.orderStages = new ArrayList<>();
        this.stages = new ArrayList<>();
        this.isReady = false;
    }

    public Order(int number) {
        this.number = number;
        this.pizzas = new HashMap<>();
        this.orderStages = new ArrayList<>();
        this.stages = new ArrayList<>();
        this.isReady = false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        number = number;
    }

    public Map<Pizza, Integer> getPizzas() {
        return pizzas;
    }

    public List<String> getPizzasName() {
        List<String> pizzaNames = new ArrayList<>();
        for (Pizza pizza : pizzas.keySet()) {
            pizzaNames.add(pizza.getName());
        }
        return pizzaNames;
    }

    public void setPizzas(Map<Pizza, Integer> pizzas) {
        this.pizzas = pizzas;
    }


    public void addPizza(Pizza pizza, int quantity) {
        pizzas.put(pizza, quantity);
    }

    public boolean isReady() {
      return isReady;
    }

    public List<String> getStages() {
        return stages;
    }

    OrderStage<LocalDateTime, String> createStage = new OrderStage<>() {
        @Override
        public String execute(LocalDateTime time, String text) {
            if (time == null) {
                time = LocalDateTime.now();
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String timeStr  = time.format(formatter);
            String str = text + " " + timeStr;
            return str;
        }
    };

    public String getName() {
        return "Заказ №" + number;
    }
    public void orderStart() {
        String stageString = createStage.execute(LocalDateTime.now(),  getName() + " принят");
        stages.add(stageString);
    }

    public void orderFinish() {
        isReady  = true;
        String stageString = createStage.execute(LocalDateTime.now(), getName() + " готов");
        stages.add(stageString);
    }

    public void orderCooking() {
        String stageString = createStage.execute(LocalDateTime.now(), getName() + " Готовиться пицца");
        stages.add(stageString);
    }

    public void orderPasking() {
        String stageString = createStage.execute(LocalDateTime.now(), getName() + " пакуется");
        stages.add(stageString);
    }

}
