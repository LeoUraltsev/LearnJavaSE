package tasksWithCodewars.CataTreaning;

import java.util.Arrays;

/**
 * Создать функцию которая выводит масив первых n элементов, которые деляться на x
 * Предпологаем что n и x > 0
 */

public class CountByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println(Arrays.toString(countBy(2, 5)));
    }

    private static int[] countBy(int x, int n) {
        int count = 0;
        int number = 1;
        int[] array = new int[n];
        while (count < n){
            if(number % x == 0){
                array[count] = number;
                count++;
            }
            number++;
        }
        return array;
    }
}
