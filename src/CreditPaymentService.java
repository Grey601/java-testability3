public class CreditPaymentService {
    public double calculate(int creditAmount, int years, double interestRate) {
        int months = years * 12;
        double percentPerMonth = interestRate/100/12;
        double paymentPerMonth = creditAmount*((percentPerMonth/(Math.pow((1+percentPerMonth), months)-1))+percentPerMonth);
        return Math.round(paymentPerMonth);
    }
}