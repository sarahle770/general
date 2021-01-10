import java.awt.Point;

/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Reference {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        Point p1 = new Point (2, 2);
        Point p2 = new Point (2, 2);
        addToTwice (a, p1);
        System.out.println (a +" "+ b +" "+ p1.x +" " +p2.x);
        addToTwice (b, p2);
        System.out.println (a +" "+ b +" "+ p1.x +" "+ p2.x);

    }

    private static void addToTwice(int a, Point p1) {
        a = a + a;
        p1.x = a;
        System.out.println (a +" "+ p1.x);
    }
}
