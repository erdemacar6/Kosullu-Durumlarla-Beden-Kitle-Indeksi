import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilo : ");
        int kilo = scanner.nextInt();

        System.out.print("Boy (Örnek : 1.78) : ");
        double boy = scanner.nextDouble();

        double bki = (boy / (kilo * kilo));

        if (bki < 18.5) {
            System.out.println("Zayıf");
        }
        else if (bki > 18.5 && bki < 25) {
            System.out.println("Normal");
        }
        else if (bki > 25 && bki < 30) {
            System.out.println("Kilolu");
        }
        else {
            System.out.println("Obez");
        }


    }
}
//erdemacar6