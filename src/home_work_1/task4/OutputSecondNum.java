package home_work_1.task4;

import java.util.Scanner;

public class OutputSecondNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int numFirst = in.nextInt(); // вводим первое число
        System.out.print("Input the second number: ");
        int numSecond = in.nextInt(); // вводим второе число
        System.out.print("Input the third number: ");
        int numThird = in.nextInt(); // вводим третье число

        // проверяем истинность, что numFirst больше чем numSecond. Если это правда идем во внутренний if
        if (numFirst > numSecond) {
            //проверяем истинность, что numFirst меньше чем numThird
            if (numFirst < numThird) {
                /* в случае истинности предыдущего выражения (numFirst < numThird), выведем,
                   что numFirst второе по величине значение
                 */
                System.out.println("The number " + numFirst + " is the second largest number.");
            // если предыдущее выражение окажется ложью, будем проверять numSecond больше чем numThird
            } else if (numSecond > numThird) {
                //если истина, что (numSecond > numThird), то выведем, что numSecond второе по величине значение
                System.out.println("The number " + numSecond + " is the second largest number.");
            } else
                //иначе, если (numSecond > numThird) окажется ложью, то выведем, numThird второе по величине значение
                System.out.println("The number " + numThird + " is the second largest number.");
        /* если первое выражение (numFirst > numSecond) оказалось ложью, берем второе значение numSecond и стравнивниваем,
           является оно меньше чем numThird
         */
        } else if (numSecond < numThird) {
            // если выражение (numSecond < numThird) истиннное, то выведем, что numSecond второе по величине значение
            System.out.println("The number " + numSecond + " is the second largest number.");
        //иначе, если (numSecond < numThird) окажется ложью, т е numSecond окажется самым большим числом
        } else {
            //останется выяснить, число numThird будет меньше чем numFirst
            if (numThird < numFirst) {
                // если выражение (numThird < numFirst) будет истинным, выведем, что numFirst второе по величине значение
                System.out.println("The number " + numFirst + " is the second largest number.");
            // иначе, если выражение (numThird < numFirst) ложь, выведем, что numThird второе по величине значение
            } else {
                System.out.println("The number " + numThird + " is the second largest number.");
            }
        }
        in.close();
    }
}
