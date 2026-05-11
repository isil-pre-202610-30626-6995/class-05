import java.util.ArrayList;

public class Calculator {
    
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int countDigits(int number) {
        number = Math.abs(number);

        int count = 0;

        do { 
            number /= 10;
            count++;
        } while (number != 0);

        return count;
    }

    public static ArrayList<Integer> getDigits(int number) {
        number = Math.abs(number);
        ArrayList<Integer> digits = new ArrayList<>();

        do { 
            int digit = number % 10;
            digits.add(0,digit);

            number /= 10;


        } while (number != 0);

        return digits;
    }

    public static boolean isPalindromeNumber(int number) {

        int originalNumber = Math.abs(number);

        int temporal = originalNumber;

        int reversedNumber = 0;

        while (temporal != 0) {
            int digit = temporal % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temporal /= 10;
        }
        return originalNumber == reversedNumber;
    }

}
