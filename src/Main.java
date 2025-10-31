import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;

        while (true) {
            Scanner scanner = new Scanner(System.in);
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
    }
}
