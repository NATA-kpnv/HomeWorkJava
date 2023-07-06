package controlTest2.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
    private String name;
    private int size;
    private Map<Ingredient, Integer> ingredients;
    private List<String> stages;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
        this.ingredients = new HashMap<>();
        this.stages = new ArrayList<>();
    }

    public Pizza(String name, int size, Map<Ingredient, Integer> ingredients, List<String> stages) {
        this.name = name;
        this.size = size;
        this.ingredients = ingredients;
        this.stages = stages;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public List<String> getStages() {
        return stages;
    }

    public void addIngredient(Ingredient ingredient, int quantity) {
        ingredients.put(ingredient, quantity);
    }

    public void addStage(String stage) {
        stages.add(stage);
    }


    public void getRecipe() {
        // Вывод списка ингредиентов
        System.out.println("Ингредиенты:");
        for (Map.Entry<Ingredient, Integer> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(ingredient.getName() + " - " + quantity + " гр");
        }

        // Вывод этапов готовки
        System.out.println("Рецепт:");
        for (String stage : stages) {
            System.out.println(stage);
        }
    }

    @Override
    public String toString() {
        return "Пицца:" + name + '-' + size + "(см)";
    }
}
