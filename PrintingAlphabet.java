public class PrintingAlphabet {
    public static void main(String[] args) {
        char letter = 0;
        for (int i = 0; i < 26; i++) {
            letter = (char) (65+i);
            System.out.print(letter +", ");
        }
        System.out.println("\b\b ");
    }
}
