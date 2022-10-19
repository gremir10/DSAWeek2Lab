//team members: Miranda and Damian
/*The previous problem generates a random arithmetic question
and tests user's knowledge. In this problem you will ask the
user twenty such questions and keep track of how many correct
 answers were given. At the end output a message that displays
 that total. You may reuse that code.*/
import java.util.Random;
import java.util.Scanner;

public class DSALab2part6 {

    static boolean checkanswer(int answer, int correctAnswer) {
        if (answer == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int rightAnswers = 0;
        int answer = 0;

        for (int count = 0; count < 20; count++ ) {
            int a = 1 + rand.nextInt((15 - 1) + 1);
            int b = 1 + rand.nextInt((15 - 1) + 1);
            System.out.println(a);
            System.out.println(b);

            int operation = 1 + rand.nextInt((4 - 1) + 1);
            System.out.println(operation);

            if (operation == 1) {
                System.out.println("Enter the result of the expression a+b");
                answer = scanner.nextInt();
                int correctAnswer = a + b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 2) {
                System.out.println("Enter the result of the expression a*b");
                answer = scanner.nextInt();
                int correctAnswer = a * b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 3) {
                System.out.println("Enter the result of the expression a-b");
                answer = scanner.nextInt();
                int correctAnswer = a - b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 4) {
                System.out.println("Enter the result of the expression a/b");
                answer = scanner.nextInt();
                int correctAnswer = a / b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            }
        }
        System.out.println("You got: ");
        System.out.println(rightAnswers);
    }

}
