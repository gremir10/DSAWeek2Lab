//team members: Miranda and Damian
/*Write a program that randomly generates two integers between 1 and 15 (inclusively),
let's call them a and b. Then it randomly generates a number between 1 and 4, called operation.
If the value of operation is 1, then prompt the user to enter the result of the expression a+b
If the value of operation is 2, then prompt the user to enter the result of the expression a*b
If the value of operation is 3, then prompt the user to enter the result of the expression a-b
If the value of operation is 4, then prompt the user to enter the result of the expression a/b*/
import java.util.Scanner;
import java.util.Random;

public class DSALab2part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int a = 1 + rand.nextInt((15 - 1) + 1);
        int b = 1 + rand.nextInt((15 - 1) + 1);
        System.out.println(a);
        System.out.println(b);

        int operation = 1 + rand.nextInt((4 - 1) + 1);
        System.out.println(operation);

        if (operation == 1) {
            System.out.println("Enter the result of the expression a+b");
            scanner.nextInt();
        } else if (operation == 2) {
            System.out.println("Enter the result of the expression a*b");
            scanner.nextInt();
        } else if (operation == 3) {
            System.out.println("Enter the result of the expression a-b");
            scanner.nextInt();
        } else if (operation == 4) {
            System.out.println("Enter the result of the expression a/b");
            scanner.nextInt();
        }
    }
}

