package PresentationAssignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int dividend ; int divisor; int quotient; int remainder;
        Scanner sc = new Scanner(System.in);
        dividend = sc.nextInt();
        divisor = sc.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient is: "+ quotient);
        System.out.println("Remainder is: "+ remainder);
        sc.close();
    }
}
