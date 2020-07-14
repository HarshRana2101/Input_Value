import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=scanner.nextLine();

        System.out.println("Your name is "+name);
        scanner.close();
    }
}
