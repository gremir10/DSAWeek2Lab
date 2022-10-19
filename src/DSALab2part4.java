//team members: Miranda and Damian
/*Write a program that asks the user to enter a string
(think of it as a sentence, without any punctuations such as commas and
periods). Then your program should reverse the words in the given
 string, and display it back to the user.*/
import java.util.Scanner;

public class DSALab2part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");

        String sentence = scanner.nextLine();

        StringBuilder input = new StringBuilder();

        //append string to Stringbuilder input
        input.append(sentence);

        //reverse StringBuilder input
        input.reverse();

        //print reversed string
        System.out.println(input);

    }
}
