import java.util.Scanner;

public class LinearSearch1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] nums = {34, 22, 5, -76, 12, -06, 59, 7, 90,43};

        loop:
        do {
            System.out.print("Enter a number to search: ");
            int num = scanner.nextInt();

            //boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    System.out.println("Found at : "+(i+1));
                    //found = true;
                    continue loop;
                    //break;
                }
            }
            //if(!found)
            System.out.println("Not found!");

        } while (true);

    }
}