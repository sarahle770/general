/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Arrays {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        int[] y = x;
        y[2] = 3;
        System.out.println (java.util.Arrays.toString (y));
    }
}