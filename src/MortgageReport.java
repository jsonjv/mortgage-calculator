import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }

    public void printPaymentSchedule(byte years) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");

        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(currency.format(balance));
        }
    }
}
