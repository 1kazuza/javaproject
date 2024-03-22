import java.util.Scanner;

public class name {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Olá " + name + "!");
    }
}