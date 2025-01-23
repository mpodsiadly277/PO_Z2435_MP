import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java\nWhats your name?");
        Scanner input = new Scanner(System.in);
        String imie = input.nextLine();
        System.out.println("Welcome " + imie + "!");
        System.out.println("Ile masz lat?");
        int wiek = (input.nextInt());
        System.out.println("Czesc " + imie + ", masz " + wiek + " lat!");
    }
}