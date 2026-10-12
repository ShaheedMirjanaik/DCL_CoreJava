package Encapsulation.TypeCasting;

public class Office {

    public static void main(String[] args) {
        Helper help = new Helper();
        help.work(new Developer());
        help.work(new HR());
        help.work(new Tester());
    }
}
//---------------------------------------------------------------------------------
class Employee{
    String company = "Google";
}
//---------------------------------------------------------------------------------
class Developer extends Employee{
    int devSalary = 200000;
}
//---------------------------------------------------------------------------------
class HR extends Employee{
    int hrSalary = 150000;
}
//---------------------------------------------------------------------------------
class Tester extends Employee{
    int testSalary = 100000;
}
//---------------------------------------------------------------------------------
class Helper{
    void work(Employee e){

        if(e instanceof Developer){
            Developer dev = (Developer) e;
            System.out.println("Hired the developer.");
            System.out.println("Salary of the developer is: "+dev.devSalary);
            System.out.println("Company : "+dev.company);
            System.out.println("------------------------------------------");
        }
        else if(e instanceof HR){
            HR h = (HR) e;
            System.out.println("Hired the developer.");
            System.out.println("Salary of the developer is: "+h.hrSalary);
            System.out.println("Company : "+h.company);
            System.out.println("------------------------------------------");
        }
        else if(e instanceof Tester){
            Tester t = (Tester) e;
            System.out.println("Hired the developer.");
            System.out.println("Salary of the developer is: "+t.testSalary);
            System.out.println("Company : "+t.company);
            System.out.println("---------------------------------------------");
        }
    }
}
//---------------------------------------------------------------------------------