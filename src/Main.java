import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            if (name.matches("[a-zA-Zа-яА-Я]+")) {
                break;
            } else {
                System.out.println("Неподходящий формат ввода. " +
                        "Попробуйте ещё раз");
            }
        }
        System.out.println("Hello" + " " + name);

        Random random = new Random();
        char firstLetter = name.charAt(0);
        int length = name.length();
        int randomNumber = random.nextInt(100);
        char[] symbols = {'@', '#', '$', '%', '&'};
        char randomSymbol = symbols[random.nextInt(symbols.length)];

        String codeName = firstLetter + String.valueOf(length) + randomSymbol + randomNumber;

        System.out.printf("Your code name is " + codeName);
        scanner.close();
    }
}
