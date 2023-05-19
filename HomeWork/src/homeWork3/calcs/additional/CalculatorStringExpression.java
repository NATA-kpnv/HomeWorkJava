package homeWork3.calcs.additional;

import homeWork3.calcs.simple.CalculatorWithMathCopy;

import java.util.ArrayList;


public class CalculatorStringExpression {
    private String expression;
    private CalculatorWithMathCopy calculator;

    public CalculatorStringExpression(String expression) {
        this.expression = expression.replaceAll("\\s+", "");
        this.calculator = new CalculatorWithMathCopy();
    }

    public double getResult() {
        double result = 0.00;
        ArrayList<String> arrayList = new ArrayList<>();
        double subresult = 0.00;
        String strTemp = new String();
        int countDot = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    if (countDot > 1) {
                        throw new IllegalArgumentException("Secon dot in digit is in  index" + i);
                    }
                    if (expression.charAt(i) == '.') {
                        countDot++;
                    }
                    strTemp += expression.charAt(i);
                    i++;
                }
                countDot = 0;
                i--;
                arrayList.add(strTemp);
                strTemp = "";
            } else if (isOperator(c)) {
                if (isMathOperator(c)) {
                    int k = i + 1;
                    if (k == expression.length()) {
                        throw new IllegalArgumentException("Invalid symbol in index" + i);
                    } else {
                        char next = expression.charAt(k);
                        if (isMathOperator(next)) {
                            throw new IllegalArgumentException("Invalid symbol in index" + k);
                        }
                    }
                    k = 0;
                }
                strTemp += expression.charAt(i);
                arrayList.add(strTemp);
                strTemp = "";
            } else if (c == 'P') {
                if (expression.charAt(i++) == 'I') {
                    arrayList.add(String.valueOf(Math.PI));
                    i++;
                }
            } else if (c == 'E') {
                arrayList.add(String.valueOf(Math.E));
            } else {
                throw new IllegalArgumentException("Invalid symbol in index" + i);
            }
        }

        ArrayList<Integer> indexBracket = new ArrayList<>();

        for (int i = 0; i < arrayList.size();) {
            String item = arrayList.get(i);
            if (item.equals("(") ) {
                indexBracket.add(i);
                i++;
            } else if (item.equals(")")) {
                int indexArrayList = indexBracket.get(indexBracket.size() - 1);
                if (indexBracket.isEmpty() || ! (arrayList.get(indexArrayList).equals("(")) ){
                    throw new IllegalArgumentException("Invalid turn of bracket in index" + i);
                }
                else {
                    int start = indexBracket.get(indexBracket.size() - 1);
                    int finish = i;
                    indexBracket.remove(indexBracket.size() - 1);
                    ArrayList<String> temp = new ArrayList<>(arrayList.subList(start + 1, finish));
                    subresult = 0.00;
                    subresult = calculate(temp);
                    arrayList.set(start, Double.toString(subresult));
                    arrayList.subList(start + 1, finish+1).clear();
                    i=start + 1;
                }
            }
            else { i++;};
        }

        subresult = 0.00;
        subresult = calculate(arrayList);


        return subresult;
    }

    /**
     * Рассчет математических операций
     * @param arrayList
     * @return
     */
    private double calculate(ArrayList<String> arrayList) {
        double result = 0.00;
        double subresult = 0.00;
        double returnRresult = 0.00;
        int start = 0;
        int finish = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            String item = arrayList.get(i);
            if (item.equals("|")) {
                start = i;
                finish = 0;
                for (int k = i+1; k < arrayList.size(); k++) {
                    if (arrayList.get(k).equals("|")){
                        finish = k;
                        break;
                    }
                }
                if (finish > start ) {
                    if(start + 2 < finish){
                        ArrayList<String> temp = new ArrayList<>(arrayList.subList(start + 1, finish));
                        subresult = 0.00;
                        subresult = calculate(temp);
                        arrayList.set(start+1, Double.toString(subresult));
                        arrayList.subList(start + 2, finish).clear();
                        i = start-1;

                    }
                    else {
                        double a =  Double.valueOf(arrayList.get(start +1));
                        double resultat = calculator.absolute(a);
                        String strResultat = Double.toString(resultat);
                        arrayList.set(start, strResultat);
                        arrayList.subList(start + 1, finish + 1).clear();
                        i = start +1;

                    }
                }
                else{
                    throw new IllegalArgumentException("Invalid modul");
                }
            }
        }

        for (int i = 0; i < arrayList.size(); ) {
            String item = arrayList.get(i);
            if (item.equals("^")) {
                int index1 = i-1;
                int index2 = i+1;
                double a =  Double.valueOf(arrayList.get(index1));
                double b =  Double.valueOf(arrayList.get(index2));
                double resultat = calculator.power(a,b);
                String strResultat = Double.toString(resultat);
                arrayList.set(index1, strResultat);
                arrayList.remove(i);
                arrayList.remove(i);

            }else i++;
        }

        for (int i = 0; i < arrayList.size(); ) {
            String item = arrayList.get(i);
            double resultat = 0.00;
            if (item.equals("/") || item.equals("*")) {
                int index1 = i-1;
                int index2 = i+1;
                double a =  Double.valueOf(arrayList.get(index1));
                double b =  Double.valueOf(arrayList.get(index2));
                if (item.equals("/")){
                     resultat = calculator.divide(a, b);
                }
                else{
                      resultat = calculator.multiply(a, b);
                }
                String strResultat = Double.toString(resultat);
                arrayList.set(index1, strResultat);
                arrayList.remove(i);
                arrayList.remove(i);

            } else i++;
        }



        for (int i = 0; i < arrayList.size(); ) {
            int newstart = i;
            String item = arrayList.get(i);
            double resultat = 0.00;
            if (item.equals("-") || item.equals("+")) {
                int index1 = i-1;
                int index2 = i+1;
                double a =  Double.valueOf(arrayList.get(index1));
                double b =  Double.valueOf(arrayList.get(index2));
                if (item.equals("-")){
                    resultat = calculator.subtraction(a, b);
                }
                else{
                    resultat = calculator.sum(a, b);
                }
                String strResultat = Double.toString(resultat);
                arrayList.set(index1, strResultat);
                arrayList.remove(i);
                arrayList.remove(i);

            }else i++;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            String item = arrayList.get(i);
            if (!item.equals(" ") || !item.equals("")) {
                returnRresult =  Double.valueOf(arrayList.get(i));
                break;
                }
        }

        return returnRresult;
    }

    /**
     * Проверка, является ли символ математическим оператором или модулем или скобками
     *
     * @param c символ из строки
     * @return
     */
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '|' || c == '(' || c == ')');
    }

    /**
     * Проверка, является ли символ математическим оператором
     *
     * @param c символ из строки
     * @return
     */
    private static boolean isMathOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }


}
