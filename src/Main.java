public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        int years = 1;
        double interestRate = 9.99;
        double paymentPerMonth = service.calculate(creditAmount, years, interestRate);
        System.out.println("Сумма кредита: " + creditAmount + " рублей");
        System.out.println("Срок кредита: " + years + " лет/год(а)");
        System.out.println("Ежемесячный платёж: " + paymentPerMonth + " рублей");
        System.out.println("Процентная ставка: " + interestRate + "%");

        years = 2;
        paymentPerMonth = service.calculate(creditAmount, years, interestRate);
        System.out.println(" ");
        System.out.println("Сумма кредита: " + creditAmount + " рублей");
        System.out.println("Срок кредита: " + years + " лет/год(а)");
        System.out.println("Ежемесячный платёж: " + paymentPerMonth + " рублей");
        System.out.println("Процентная ставка: " + interestRate + "%");

        years = 3;
        paymentPerMonth = service.calculate(creditAmount, years, interestRate);
        System.out.println(" ");
        System.out.println("Сумма кредита: " + creditAmount + " рублей");
        System.out.println("Срок кредита: " + years + " лет/год(а)");
        System.out.println("Ежемесячный платёж: " + paymentPerMonth + " рублей");
        System.out.println("Процентная ставка: " + interestRate + "%");
    }
}