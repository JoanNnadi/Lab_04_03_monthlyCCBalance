//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" Enter your monthly credit card balance");

        double initialBalance = 5000; // declare the variables
        double yearlyInterestRate = 0.17;
        double monthlyInterestRate = yearlyInterestRate / 12; // value for each month
        double firstMonth = 0;
        double secondMonth = 0;

        double firstMonthInterest = initialBalance * yearlyInterestRate;
        double balanceAfterFirstMonth = initialBalance + firstMonthInterest;

        System.out.println(" your first month interest is: " + firstMonthInterest);
        System.out.println("your interest after first month is: " + balanceAfterFirstMonth);

        double secondMonthInterest = balanceAfterFirstMonth * monthlyInterestRate;
        double balanceAfterSecondMonth = balanceAfterFirstMonth + secondMonthInterest;

        System.out.println("your credit card interest after two months is: " + secondMonthInterest);




    }
}