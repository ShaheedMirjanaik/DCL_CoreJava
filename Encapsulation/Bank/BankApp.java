package Encapsulation.Bank;

public class BankApp {
    
    public static void main(String[] args) {
        NewAcc a = new NewAcc();
        a.setAccNO(101);
        a.setName("Shaheed");
        System.out.println("Account number of the user is: "+a.getAccNo());
        System.out.println("Name of the user is: "+a.getName());
    }
}
