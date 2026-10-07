package Encapsulation.Bank;

public class NewAcc {
    
    private int accNo;
    private String name;

    public int getAccNo(){
        return accNo;
    }

    public void setAccNO(int accNo){
        if(accNo > 0){
            this.accNo = accNo;
        }
        else{
            System.out.println("Invalid Account number.");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        
        this.name = name;
    }

}
