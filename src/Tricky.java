/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Tricky {
    public static void main(String[] args) {
        message1 ();
        message2 ();
        System.out.println ("Done with main.");
    }
    private static void message1() {
        System.out.println ("This is message 1.");
    }
    private static void message2() {
        System.out.println ("This is message 2.");
        message1 ();
        System.out.println ("Done with message2.");
    }
}
