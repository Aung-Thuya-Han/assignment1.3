public class Binary {

    public int convert(String binaryNumber) {
        int decimalNumber = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            char bit = binaryNumber.charAt(i);
            decimalNumber = decimalNumber * 2;

            if (bit == '1') {
                decimalNumber = decimalNumber + 1;
            }
        }

        return decimalNumber;
    }
}
