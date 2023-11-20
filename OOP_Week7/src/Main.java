import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        AddNumbers a = new AddNumbers();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            b = sc.nextInt();
            System.out.print("Enter second number: ");
            c = sc.nextInt();
        }  catch (InputMismatchException e) {
        System.out.println("Entered number should be an integer");
        }
        System.out.println(a.arithmeticOperations(b,c));

    }
}
