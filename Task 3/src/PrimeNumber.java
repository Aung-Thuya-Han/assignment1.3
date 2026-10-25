public class PrimeNumber {

    public void printPrimeNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i < 2) {
                isPrime = false;
            }

            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
