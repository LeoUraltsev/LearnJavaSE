package tasksWithCodewars.CataTreaning;

/**
 * Given an array of integers your solution should find the smallest integer.
 * <p>
 * For example:
 * <p>
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{1, -2, 4, -32}));
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}
