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
}
