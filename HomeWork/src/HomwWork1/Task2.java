package HomwWork1;

public class Task2 {
    static int a;
    static int b;
    static int c;
    public static void setValues() {
        a = 8;
        b = 2;
        c = 5;
    }

    public static void main(String[] args) {
//2.1 5 + 2 / 8
        setValues();
        int result1 = c + b / a; //  5 +0 = 5
        System.out.println("Результат выражения-2.1 5 + 2 / 8 = " + result1);
//2.2 (5 + 2) / 8
        setValues();
        int result2 = (c + b) / a; // 7/8=0
        System.out.println("Результат выражения-2.2 (5 + 2) / 8 = " + result2);
//2.3 (5 + 2++) / 8
        setValues();
        int result3 = (c + b++) / a;// 7/8 = 0 (вначале скобки, потом постинкремент)
        System.out.println("Результат выражения-2.3 (5 + 2++) / 8 = " + result3);
//2.4 (5 + 2++) / --8
        setValues();
        int result4 = (c + b++) / --a; // 7/7 = 1
        System.out.println("Результат выражения-2.4 (5 + 2++) / --8 = " + result4);
//2.5 (5 * 2 >> 2++) / --8
        setValues();
        int result5 = (c * b >> b++) / --a; //  (00001010>>2 = 10 = 2)  ->  2/7 = 0
        System.out.println("Результат выражения-2.5 (5 * 2 >> 2++) / --8 = " + result5);

//2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        setValues();
        int result6 = (c + 7 > 20 ? 68 : 22 * b >> b++) / --a; // тернарный оператор (22 * 2>> 2++)/--8 = 11/ 7 = 1
        System.out.println("Результат выражения-2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + result6);

//2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
//        //(68 >= 68) в оригинальной записи подчеркивает как ошибку
//        setValues();
//        int result7 = ( c + 7 > 20 ? 68 >= 68 : 22 * b >> b++ / --a; //
//        System.out.println("Результат выражения-2.7 ((5 * 2 >> 2++) / --8 = " + result7);

//2.8 6 - 2 > 3 && 12 * 12 <= 119
        setValues();
        boolean result8 = 6 - a > 3 && 12 * 12 <= 119; //false
        System.out.println("Результат выражения-2.8 (6 - 2 > 3 && 12 * 12 <= 119) / --8 = " + result8);

//true && false
        setValues();
        boolean result9 = true && false; //false
        System.out.println("Результат выражения true && false = " + result9);

    }

}
