import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Interest Rate: ");
        float interestRate = (scanner.nextFloat() / 100) / 12;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        int numberOfPayments = period * 12;

        double calculation = Math.pow(1 + interestRate, numberOfPayments);
        double mortgage = principal * ((interestRate * calculation) / (calculation - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}