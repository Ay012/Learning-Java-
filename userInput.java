import java.util.Scanner;

public class userInput {
    public static void main (String... args) {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome "+name+" to JAVA");
        System.out.print("Enter number A: ");
        int A = input.nextInt();
        System.out.print("Enter number B: ");
        int B = input.nextInt();
        int sum = A+B;
        System.out.println("Sum of both numbers is: "+sum);
    }
}
