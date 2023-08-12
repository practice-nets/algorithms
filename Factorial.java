import java.util.Scanner;

public class Factorial {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        long factorial = 1L;
        String multiplication = "";

        if (num == 0) System.out.println(num+"! = 1");
        else {
            for (int i = num; i > 0 ; i--) {
                factorial *= i;
                multiplication += i+" x ";
            }
            System.out.println(num+"! = "+multiplication+"\b\b= "+factorial);
        }    

    }
}
