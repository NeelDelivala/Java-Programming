import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("\nArithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("\nRelational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        boolean condition1 = num1 > 10;
        boolean condition2 = num2 < 50;

        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + !condition1);

        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2: " + (num1 & num2));
        System.out.println("num1 | num2: " + (num1 | num2));
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
        System.out.println("~num1: " + (~num1));  
        System.out.println("num1 << 2: " + (num1 << 2));  
        System.out.println("num1 >> 2: " + (num1 >> 2));  

        int temp = 10;
        temp += 5; 
        temp -= 3; 
        temp *= 2; 
        temp /= 4; 
        temp %= 3; 

        System.out.println("\nAssignment Operators:");
        System.out.println("temp after various assignments: " + temp);

        System.out.println("\nUnary Operators:");
        System.out.println("num1++: " + num1++); 
        System.out.println("++num1: " + ++num1); 
        System.out.println("num2--: " + num2--); 
        System.out.println("--num2: " + --num2); 

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of num1 and num2: " + max);

        scanner.close();
    }
}
