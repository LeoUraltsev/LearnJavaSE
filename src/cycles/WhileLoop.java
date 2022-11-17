package cycles;

import java.util.Arrays;

/**
 * Цикл While в Java
 */
public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Задача №1: " + Arrays.toString(firstTask()));
        System.out.print("Задача №2: ");
        secondTask();
    }

    private static int[] firstTask() {
        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
        //1 2 3 4 5
        int numberOfDigit = 5;
        int[] result = new int[numberOfDigit];
        int count = 0;
        while (count < numberOfDigit){
            result[count] = count + 1;
            count++;
        }
        return result;
    }

    private static void secondTask() {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        int step = 7;
        int endOfSequence = 98;
        int result = 0;
        while (result < endOfSequence){
            result += step;
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
