import java.util.Scanner;

public class Intermediate {

    public static void main(String[] args) {
        getDigitWord();
    }

    public static void getDigitWord() {

        System.out.println("Enter a number between one and ten:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] words = new String[]{"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        if (num < 1 || num > 10) {
            System.out.println("Not in the range.");
        }
        System.out.println(words[num - 1]);
    }
}
     
