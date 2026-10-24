import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Binary converter = new Binary();

        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = converter.convert(binaryNumber);

        System.out.println("The decimal equivalent is " + decimalNumber);

    }
}
