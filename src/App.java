
public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(Calculator.generateRandomNumber(1, 5));

        System.out.println("Digits: " + Calculator.countDigits(5789));

        System.out.println(Calculator.getDigits(1259));

        System.err.println(Calculator.isPalindromeNumber(11));
    }
}
