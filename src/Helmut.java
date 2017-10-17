import java.util.Scanner;

/**
 * Calculator
 * Helmut.java
 * Purpose: -
 *
 * @author Felix Bartling
 * @version 1.00 10/17/17
 * @since 10/17/2017
 */

public class Helmut {

    public static void main(String[] args) {

        System.out.println("Bitte gib Text ein:");

        Scanner keyboard = new Scanner(System.in);
        String eingabeText = keyboard.next();

        System.out.println(eingabeText);
    }
}
