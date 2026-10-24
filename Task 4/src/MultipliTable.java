import java.util.Scanner;

public class MultipliTable {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int points;

        do {
            points = 0;

            for (int question = 1; question <= 10; question++) {
                int firstFactor = (int) (Math.random() * 10) + 1;
                int secondFactor = (int) (Math.random() * 10) + 1;

                System.out.print(question + ". What is " + firstFactor + " * " + secondFactor + "? ");
                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == firstFactor * secondFactor) {
                    System.out.println("Correct!");
                    points++;
                }
                else {
                    int correctAnswer = firstFactor * secondFactor;
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            }

            System.out.println("You scored " + points + " out of 10.");

            if (points < 10) {
                System.out.println("Let us try another set of questions.");
            }
        } while (points < 10);

        System.out.println("Congratulations! You have mastered the multiplication tables.");
    }
}
