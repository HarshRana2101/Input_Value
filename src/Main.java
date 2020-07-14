import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name +
                        " ,and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Bith");
            }
        } else {
            System.out.println("unable to parse year of birth");
        }
        scanner.close();
    }
}
