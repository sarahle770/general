import java.util.Arrays;

/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class ReversArray {
    public static void main(String[] args) {
        int[] element = new int[]{ 1, -3, 4, 7, 2 };
        System.out.println (Arrays.toString (element));
        System.out.println (element.length);
        System.out.println ("***********************");
        for (int i = element.length - 1; i >= 0; i--) {
            System.out.print ("," + element[i]);
        }
    }
}
