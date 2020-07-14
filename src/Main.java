import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        int yearofBirth = scanner.nextInt();

        int age = 2020 - yearofBirth;

        System.out.println("Your name is " + name +
                " ,and you are " + age + " years old.");

        scanner.close();
    }
}
