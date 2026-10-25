import java.util.Scanner;

public class MultipliTable {

    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        int points = 0;

        while (points < 10) {
            points = 0;

            for (int question = 1; question <= 10; question++) {
                int firstNum = (int) (Math.random() * 10) + 1;
                int secondNum = (int) (Math.random() * 10) + 1;

                System.out.print(question + ". What is " + firstNum + " * " + secondNum + "? ");


                int userAnswer = Integer.parseInt(scanner.nextLine());
                int correctAnswer = firstNum * secondNum;

                if (userAnswer == firstNum * secondNum) {
                    System.out.println("Correct!");
                    points++;

                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            }

            System.out.println("You scored " + points + " out of 10.");

            if (points < 10) {
                System.out.println("Let's try another set of questions.");
            } else if (points == 10) {
                break;
            }
        }

        System.out.println("Congratulations! You have mastered the multiplication tables.");
    }
}
