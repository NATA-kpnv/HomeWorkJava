package HomwWork1;

public class Task5 {
    public static void main(String[] args) {
        boolean weekday = true; // рабочий день
        boolean vacation = false; // отпуск
        if (!sleepIn(weekday, vacation)) {
            System.out.println("Пора идти на работу");
        } else {
            System.out.println("Можем спать дальше");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && vacation) {
            return true;
        }
        return false;
    }
}
