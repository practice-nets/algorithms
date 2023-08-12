import java.util.Scanner;

public class FindingDuplicates2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        loop:
        do {
            System.out.print("Enter a text: ");
            String text = scanner.nextLine().toUpperCase().strip();

            if(text.length() == 0){
                System.out.println("Invalid text");
                continue loop;
            }

            char[] charArray = text.toCharArray();
            int count = 0;

            loop2:
            for (int i = 0; i < charArray.length; i++) {
                count = 0;
                for (int j = 0; j < charArray.length; j++) {
                    if(charArray[i] == charArray[j]) {
                        if(charArray[i] == ' ') {
                            continue;
                        } else if (i < j) {
                            continue loop2;
                        }
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(charArray[i]+" : "+count);
                }
            }
        
        } while(true);

    }
}
