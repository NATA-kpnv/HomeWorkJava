package homeWork2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        printRow(1,5);
        System.out.println();
        printRow(6,10);

    }

    /**
     * Печать строки в консоль с указанными столбцами
     * @param from столбец с которого начинается строка
     * @param to столбец которым заканчивается строка
     */
   public static void printRow(int from, int to){
      for(int i = 1; i<=10; i++){
            for(int j = from; j<= to; j++){
               System.out.print(j + " x " + i + " = " +(j * i) + "\t");
            }
           System.out.print("\n");
      }
   }
}
