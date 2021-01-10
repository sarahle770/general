import java.util.Arrays;

/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class OddArray {
    // Write code that creates an array named odds and stores all odd numbers between -6 and 38 into it using a for
    // loop. Make the array's size exactly large enough to store the numbers.
    public static void main(String[] args) {
        int[] odds = new int[22];
        for (int i = 0; i < 22; i++) {
            odds[i] = i * 2 - 5;
            System.out.println (Arrays.toString (odds));
        }
    }
}
