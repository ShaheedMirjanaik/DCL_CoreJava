package Overriding;

class Son extends Father{
    
    @Override 
    void bike(){
        System.out.println("Son's modified bike.");
    }

    @Override 
    void eating(){
        System.out.println("son is eating.");
    }

    void dance(){
        System.out.println("Son is dancing.");
    }
}
