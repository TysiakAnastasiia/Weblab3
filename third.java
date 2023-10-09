import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price;
        String productName;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву продукту: ");
        productName = scanner.nextLine();

        System.out.print("Введіть ціну продукту: ");
        price = scanner.nextInt();

        System.out.println("Ви внесли продукт \"" + productName + "\" з ціною " + price + " грн");

        // Закриття Scanner
        scanner.close();
    }
}
