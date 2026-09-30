public class TvOverloading {
    
    void display(){
        System.out.println("Swithching on the TV");
    }

    void display(int a){
        System.out.println("Size of the Tv is: "+a);
    }

    void display(double a){
        System.out.println("Cost of the TV is: "+a);
    }

    void display(String a,int b){
        System.out.println(b+" num Channel is "+a);
    }

    void display(int a, String b){
        System.out.println(b+" is broadcasting at time "+a);
    }
}
