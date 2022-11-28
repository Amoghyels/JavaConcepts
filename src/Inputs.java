import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("What is your Favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You like"+food);




    }
}
