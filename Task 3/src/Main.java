import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrimeNumber generator = new PrimeNumber();

        System.out.print("Enter the start number: ");
        int startNum = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the end number: ");
        int endNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Prime numbers between " + startNum + " and " + endNum + ":");
        generator.printPrimeNumbers(startNum, endNum);
    }
}
