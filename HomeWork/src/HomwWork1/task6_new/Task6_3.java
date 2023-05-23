package HomwWork1.task6_new;

public class Task6_3 implements ICommunicationPrinter{

    public String welcom(String name) {
   String message;
        switch (name) {
            case "Вася":
                message = "Привет! \t Я тебя так долго ждал";
                break;
            case "Анастасия":
                message = "Я тебя так долго ждал";
                break;
            default:
                message = "Добрый день, а вы кто?";
                break;
        }

       return  message;
    }
}
