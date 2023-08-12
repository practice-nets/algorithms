import java.util.Scanner;

public class EnterMarks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] marks = new int[0];
        int newMark = 0;

        do {
            System.out.print("Enter marks...(Press -1 to Exit) : ");
            newMark = scanner.nextInt();
            scanner.nextLine();

            if(newMark != -1) {
                int[] temp = new int[marks.length+1];

                for (int i = 0; i < marks.length; i++) {
                    temp[i] = marks[i];
                }

                temp[temp.length-1] = newMark;
                marks = temp;
            }

        } while (newMark != -1);

        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+", ");
        }
        System.out.println("\b\b ");

    }
}
