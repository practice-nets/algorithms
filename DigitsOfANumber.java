import java.util.Scanner;

public class DigitsOfANumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        String digits = "";
        int sum = 0;
        int rev = 0;
        int count = 0;

        do {
            digits += (num%10);
            sum += (num%10);
            rev *=10;
            rev += (num%10);
            num /=10;
            count++;
        } while (num > 0);

        char[] charArray = digits.toCharArray();

        System.out.print("The digits of the Integer: ");
        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]+", ");
        }
        System.out.println("\b\b ");
        System.out.println("The Reverse of The Number: "+rev);
        System.out.println("The sum of Digits: "+sum);
        System.out.println("Digit count: "+count);

    }
}
