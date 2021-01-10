/**
 * This file is a part of Exerecising project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Name {
    private static String firstName;
    public static String lastName;
    public static String middleName;

    public Name(String firstName, String lastName, String middleName) {
        Name.firstName = firstName;
        Name.lastName = lastName;
        Name.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Name.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Name.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        Name.middleName = middleName;
    }


    public static void main(String[] args) {
        Name name = new Name ("Sarah", "Cynamon", "Ruchama");

        System.out
                .println ("Name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Middle name: " + middleName);
    }
}
