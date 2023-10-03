package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArrayIterationUsingInterface {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole(); // Вызов метода задания массива через консоль
        System.out.println();

        IArraysOperation forOperation = new ForOperation(); // Создаем объект, который реализует интерфейс, изпользую цикл for
        System.out.println("All elements of array: " + forOperation.printElementsOfArray(container));
        System.out.println("Every second elements of array: " + forOperation.printEverySecondElem(container));
        System.out.println("An array in reverse order: " + forOperation.printArrInReverseOrder(container));
        System.out.println();

        IArraysOperation whileOperation = new WhileOperation(); // Создаем объект, который реализует интерфейс, изпользую цикл while
        System.out.println("All elements of array: " + whileOperation.printElementsOfArray(container));
        System.out.println("Every second elements of array: " + whileOperation.printEverySecondElem(container));
        System.out.println("An array in reverse order: " + whileOperation.printArrInReverseOrder(container));
        System.out.println();

        IArraysOperation forEachOperation = new ForEachOperation(); // Создаем объект, который реализует интерфейс, изпользую цикл foreach
        System.out.println("All elements of array: " + forEachOperation.printElementsOfArray(container));
        System.out.println("Every second elements of array: " + forEachOperation.printEverySecondElem(container));
        System.out.println("An array in reverse order: " + forEachOperation.printArrInReverseOrder(container));
        System.out.println();

        IArraysOperation doWhileOperation = new DoWhileOperation(); // Создаем объект, который реализует интерфейс, изпользую цикл do...while
        System.out.println("All elements of array: " + doWhileOperation.printElementsOfArray(container));
        System.out.println("Every second elements of array: " + doWhileOperation.printEverySecondElem(container));
        System.out.println("An array in reverse order: " + doWhileOperation.printArrInReverseOrder(container));
        System.out.println();
    }
}
