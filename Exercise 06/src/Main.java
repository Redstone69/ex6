//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/// hazem 2/23/2025

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = promptString("Enter your name: ");
        int age = promptInt("Enter your age: ");
        double cash = promptDouble("Enter your cash amount: ");

        Person person = new Person(name, age, cash);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge() + ", Cash: $" + person.getCash());
    }

    private static Scanner input = new Scanner(System.in);

    public static String promptString(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
        // everthing that is inputed is a string by defualt to my knowledge ¯\_(ツ)_/¯
    }

    public static int promptInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("not a  integer please try again");
            }
        }
    }

    public static double promptDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("not a double please try again");
            }
        }
    }

}