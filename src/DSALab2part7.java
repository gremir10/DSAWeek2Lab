//team members: Miranda and Damian
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


/*Modify the previous program so everything seen in the console window
(including all twenty random questions and user's answers) are also saved
into a file named output.txt.*/
public class DSALab2part7 {

    static boolean checkanswer(int answer, int correctAnswer) {
        if (answer == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    //method for logging to file, use just like System.out.println
    public static void log(String message) {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter("output.txt", true), true);
            out.write(message);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
            System.out.println("A: " + a);
            System.out.println("B: " + b);

            log("A: " + a + "\n");
            log("B: " + b + "\n");

            int operation = 1 + rand.nextInt((4 - 1) + 1);
            System.out.println("Operation: " + operation);
            log("Operation: " + operation + "\n");

            if (operation == 1) {
                System.out.println("Enter the result of the expression a+b");
                log("Enter the result of the expression a+b\n" );
                answer = scanner.nextInt();
                int correctAnswer = a + b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 2) {
                System.out.println("Enter the result of the expression a*b");
                log("Enter the result of the expression a*b\n");
                answer = scanner.nextInt();
                int correctAnswer = a * b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 3) {
                System.out.println("Enter the result of the expression a-b");
                log("Enter the result of the expression a-b\n");
                answer = scanner.nextInt();
                int correctAnswer = a - b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            } else if (operation == 4) {
                System.out.println("Enter the result of the expression a/b");
                log("Enter the result of the expression a/b\n");
                answer = scanner.nextInt();
                int correctAnswer = a / b;
                if (checkanswer(answer, correctAnswer)) {
                    rightAnswers++;
                }
            }
        }
        System.out.println("You got: ");
        log("You got: ");
        System.out.println(rightAnswers);
        log(String.valueOf(rightAnswers));
        scanner.close();
    }

}