public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport mortgageReport = new MortgageReport(calculator);

        mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule(years);
    }
}