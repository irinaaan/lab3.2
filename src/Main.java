import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку с цифрами: ");
        String numbers = in.nextLine();
        System.out.println("Сумма цифр: " + checkNumbers(numbers));
    }

    public static int checkNumbers(String numbers) {
        int sum = 0;
        String a;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                a = numbers.substring(i, i+1);
                sum += Integer.parseInt(a);
            }
        }
        return sum;
    }
}