/*Write a program that asks the user to enter a string. In addition
to the string the program should prompt the user to enter a single
letter. The program should then count the number of occurrences of that
letter and display that number.*/
import java.util.Scanner;

public class DSALab2part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Team members: Miranda and Damian
        System.out.println("Enter a string: ");
        String words  = scanner.next();
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(count);
    }
}
