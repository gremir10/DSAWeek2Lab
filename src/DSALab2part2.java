//Team members: Miranda and Damian
/*Write a program that determines if a number is a prime number or not.
 */
import java.util.Scanner;

public class DSALab2part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean flag = false;

        if (number <= 1) {
            System.out.println("Not Prime");
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println(number + " is prime");
        } else
            System.out.println(number + " is not prime"); {

        }
    }
}

