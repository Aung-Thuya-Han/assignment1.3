import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuadraticEquation equation = new QuadraticEquation();

        System.out.print("Enter number a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number c: ");
        double c = Double.parseDouble(scanner.nextLine());

        equation.solve(a, b, c);
    }
}
