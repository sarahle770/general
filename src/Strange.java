/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Strange {
    public static void main(String[] args) {
        first ();
        third ();
        second ();
        third ();
    }

    public static void first() {
        System.out.println ("Inside first methode.");
    }
    public static void second() {
        System.out.println ("Inside second methode.");
        first ();
    }
    public static void third() {
        System.out.println ("Inside third methode.");
        second ();
    }
}
