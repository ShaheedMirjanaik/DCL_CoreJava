package Encapsulation.TypeCasting;

public class Hotel {
    public static void main(String[] args) {
        
    }
}

class Food{

}

class Idly extends Food{
    int idlyPrice = 50;
}

class Vada extends Food{
    int vadaPrice = 40;
}

class Dosa extends Food{
    int dosaPrice = 100;
} 

class App{
    public Food order(int choice){
        if(choice == 1){
            Idly i = new Idly();
            return i;
        }
        else if(choice == 2){
            Vada v = new Vada();
        }
        else if(choice == 3){
            Dosa d = new Dosa();
        }
        else{
            return null;
        }
    }
}
