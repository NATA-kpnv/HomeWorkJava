package controlTest2.pizzasMainMenu;
import controlTest2.models.*;

public class Pepperoni extends Pizza {
    public Pepperoni() {
        super("Пицца Пепперони", 30);
        addIngredient(Ingredient.DOUGH, 200);
        addIngredient(Ingredient.TOMATO_SAUCE, 100);
        addIngredient(Ingredient.MOZZARELLA, 150);
        addIngredient(Ingredient.PEPPERONI, 100);
        addStage("Приготовление теста");
        addStage("Добавление томатного соуса");
        addStage("Посыпка моцареллой");
        addStage("Добавление пепперони");
        addStage("Выпекание в духовке");
    }
}
