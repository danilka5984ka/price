import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int price;
        System.out.println("Введите стоимость билета: ");
        price = num.nextInt();

        int mile = price / 20;
        System.out.println("Мили за купленный билет: " + mile);
    }


}
