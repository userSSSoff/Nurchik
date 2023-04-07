import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        area area = new area();

        System.out.println("Введите ширину: ");
        area.shirinu = scanner.nextInt();

        System.out.println("Введите высоту ");
        area.vysotu = scanner.nextInt();

        System.out.println("ravny kancha");
        area.ravny = scanner.nextInt();
        area.triugolnik();
    }
}

