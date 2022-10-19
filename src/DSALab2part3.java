//team members: Miranda and Damian
/*Write a function that returns the nth prime number.
Example:
Entering a 1 should return the first prime number (2)
Entering a 2 should return the second prime number (3)*/
import java.util.Scanner;

public class DSALab2part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: "); //reading an integer from the user
        int n = sc.nextInt();
        int num = 1, count = 0, i;
        while (count < n) {
            num = num + 1; for (i = 2; i <= num; i++) {
                if (num % i == 0) { break; }
            } if (i == num) { count = count + 1; }
        } //prints the nth prime number
        System.out.println("The " + n + "th prime number is: " + num); }
}
