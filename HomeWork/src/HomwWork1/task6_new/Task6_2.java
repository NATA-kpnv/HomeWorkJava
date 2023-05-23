package HomwWork1.task6_new;

import java.util.Objects;

public class Task6_2 implements ICommunicationPrinter {
    String result = "";
    @Override
    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            result = "Привет! \t Я тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            result = "Я тебя так долго ждал";
        } else {
            result = "Добрый день, а вы кто?";
        }
        return  result;
    }
}
