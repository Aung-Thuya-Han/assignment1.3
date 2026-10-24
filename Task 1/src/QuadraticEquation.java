public class QuadraticEquation {

    public void solve(double a, double b, double c) {

        double insideSquareRoot = (b * b) - (4 * a * c);

        if (insideSquareRoot < 0) {
            System.out.println("No real roots");
        }
        else if (insideSquareRoot == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        }
        else {
            double plusRoot = (-b + Math.sqrt(insideSquareRoot)) / (2 * a);
            double minusRoot = (-b - Math.sqrt(insideSquareRoot)) / (2 * a);

            System.out.println("The first root is " + plusRoot);
            System.out.println("The second root is " + minusRoot);
        }
    }
}
