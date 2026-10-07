package Encapsulation.Bank;

import java.util.Scanner;

public class BankApp {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        NewAcc a = new NewAcc();
        System.out.println("Enter the Account Number need to set: ");
        a.setAccNO(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the name need to set: ");
        a.setName(sc.nextLine());
        System.out.println("Account number of the user is: "+a.getAccNo());
        System.out.println("Name of the user is: "+a.getName());
        sc.close();
    }
}
