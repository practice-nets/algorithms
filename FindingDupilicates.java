import java.util.Scanner;

public class FindingDupilicates {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] nums = {34, 56, 2, 34, 4, -99, 345, 34, 2, 34, 56, 2 };

        do {
            System.out.print("Enter a number to find duplicates: ");
            int find = scanner.nextInt();
            scanner.nextLine();

            int count = 0;
            String duplicates = "";
            for (int i = 0; i < nums.length; i++) {
                if (find == nums[i]) {
                    duplicates += (i+1) + ", ";
                    count++;
                }
            }

            if (count > 1){
                System.out.println("No.of duplicates: "+count);
                System.out.println("Duplicates found at : "+duplicates+"\b\b ");
            } else if (count == 1) System.out.println("No duplicates");
            else System.out.println("Invalid number!");

        } while (true);

    }
}
