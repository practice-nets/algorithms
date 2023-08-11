import java.util.Scanner;

public class LinearSearch2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        String[] names = {"Kamal", "Nimal", "Samal", "Thamal", "Piyal", "Chamal"};

        loop:
        do {
            System.out.print("Enter name to search: ");
            String search = scanner.nextLine();

            for (int i = 0; i < names.length; i++) {
                if(names[i].equalsIgnoreCase(search)) {
                    System.out.println("Index is "+(i+1));
                    continue loop;
                }
            }

            System.out.println("Not found!");

        } while (true);

    }
}
