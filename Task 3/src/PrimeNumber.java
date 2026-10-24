public class PrimeNumber {

    public void printPrimeNumbers(int start, int end) {
        for (int number = start; number <= end; number++) {
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            }

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
