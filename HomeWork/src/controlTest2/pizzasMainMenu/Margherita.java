package controlTest2.pizzasMainMenu;
import controlTest2.models.*;
public class Margherita extends Pizza{
      public Margherita() {
            super("Пицца Маргарита", 30);
            addIngredient(Ingredient.DOUGH, 200);
            addIngredient(Ingredient.TOMATO_SAUCE, 100);
            addIngredient(Ingredient.MOZZARELLA, 150);
            addStage("Приготовление теста");
            addStage("Добавление томатного соуса");
            addStage("Посыпка моцареллой");
            addStage("Выпекание в духовке");
        }
}
