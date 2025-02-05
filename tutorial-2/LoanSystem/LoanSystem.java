import java.util.Scanner;

class LoanCalculator {
    public double calculateLoan(double principal, double interestRate) {
        return principal + (principal * interestRate / 100);
    }
    public double calculateLoan(double principal, double interestRate, int loanTenure) {
        double monthlyRate = interestRate / 100 / 12;
        int numberOfPayments = loanTenure * 12;
        double monthlyPayment = (principal * monthlyRate) /
                                (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
        double totalRepayment = monthlyPayment * numberOfPayments;
        return totalRepayment;
    }

    public double calculateLoan(double principal, double interestRate, int loanTenure, double processingFees) {
        double monthlyRate = interestRate / 100 / 12;
        int numberOfPayments = loanTenure * 12;
        double monthlyPayment = (principal * monthlyRate) /
                                (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
        double totalRepayment = (monthlyPayment * numberOfPayments) + processingFees;
        return totalRepayment;
    }

    public void displayLoanDetails(double principal, double interestRate) {
        double totalRepayment = calculateLoan(principal, interestRate);
        System.out.println("Personal Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Total Repayment: " + totalRepayment);
    }

    public void displayLoanDetails(double principal, double interestRate, int loanTenure) {
        double totalRepayment = calculateLoan(principal, interestRate, loanTenure);
        System.out.println("Home Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Tenure: " + loanTenure + " years");
        System.out.println("Total Repayment: " + totalRepayment);
    }
    
    public void displayLoanDetails(double principal, double interestRate, int loanTenure, double processingFees) {
        double totalRepayment = calculateLoan(principal, interestRate, loanTenure, processingFees);
        System.out.println("Car Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Tenure: " + loanTenure + " years");
        System.out.println("Processing Fees: " + processingFees);
        System.out.println("Total Repayment: " + totalRepayment);
    }
}

public class LoanSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanCalculator loanCalculator = new LoanCalculator();

        System.out.println("Choose loan type:");
        System.out.println("1. Personal Loan");
        System.out.println("2. Home Loan");
        System.out.println("3. Car Loan");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Principal Amount for Personal Loan: ");
                double personalLoanPrincipal = scanner.nextDouble();
                System.out.println("Enter Interest Rate for Personal Loan: ");
                double personalLoanInterestRate = scanner.nextDouble();
                loanCalculator.displayLoanDetails(personalLoanPrincipal, personalLoanInterestRate);
                break;

            case 2:
                System.out.println("Enter Principal Amount for Home Loan: ");
                double homeLoanPrincipal = scanner.nextDouble();
                System.out.println("Enter Interest Rate for Home Loan: ");
                double homeLoanInterestRate = scanner.nextDouble();
                System.out.println("Enter Loan Tenure (in years) for Home Loan: ");
                int homeLoanTenure = scanner.nextInt();
                loanCalculator.displayLoanDetails(homeLoanPrincipal, homeLoanInterestRate, homeLoanTenure);
                break;

            case 3:
                System.out.println("Enter Principal Amount for Car Loan: ");
                double carLoanPrincipal = scanner.nextDouble();
                System.out.println("Enter Interest Rate for Car Loan: ");
                double carLoanInterestRate = scanner.nextDouble();
                System.out.println("Enter Loan Tenure (in years) for Car Loan: ");
                int carLoanTenure = scanner.nextInt();
                System.out.println("Enter Processing Fees for Car Loan: ");
                double carLoanProcessingFees = scanner.nextDouble();
                loanCalculator.displayLoanDetails(carLoanPrincipal, carLoanInterestRate, carLoanTenure, carLoanProcessingFees);
                break;

            default:
                System.out.println("Invalid choice. Exiting.");
                break;
        }

        scanner.close();
    }
}
