import java.util.Arrays;

/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Meet2DArrays {
    public static void main(String[] args) {
        String[][] myArr = new String[10][10];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = "[" + i + "|" + j + "]";
                System.out.println(Arrays.deepToString (myArr));
            }
        }

    }

}
