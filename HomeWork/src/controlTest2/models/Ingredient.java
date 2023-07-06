package controlTest2.models;

public enum Ingredient {
    FLOUR("Мука"),
    WATER("Вода"),
    EGGS("Яйца"),
    CHEESE("Сыр"),
    TOMATOES("Помидоры"),
    MUSHROOMS("Шампиньоны"),
    HAM("Ветчина"),

    DOUGH("Тесто"),
    TOMATO_SAUCE("Томатный соус"),
    MOZZARELLA("Моцарелла"),
    PEPPERONI("Пепперони"),
    BELL_PEPPERS("Болгарский перец"),
    ONIONS("Лук"),
    OLIVES("Оливки");

    private String name;

    Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
