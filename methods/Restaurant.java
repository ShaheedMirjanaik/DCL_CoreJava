public class Restaurant {
    
    int birayani = 450;
    int kebab = 200;
    int coke = 99;

    void order(){
        int deal = 500;
        System.out.println("| ^^^^^^^^^^^^^^^^^^^^^^^^ |");
        System.out.println("| Today's deal is: "+ deal+" |");
        System.out.println("| ----------------------- |");
    }

    void order(int biryaniQty){
        System.out.println("| ^^^^^^^^^^^^^^^^^^^^^^^^ |");
        System.out.println("| Biryani X "+biryaniQty+" : "+(biryaniQty*birayani)+" |");
        System.out.println("| Total: "+ (biryaniQty*birayani)+" |");
        System.out.println("| ----------------------- |");
    }

    void order(int biryaniQty, int kebabQty){
        System.out.println("| ^^^^^^^^^^^^^^^^^^^^^^^^ |");
        System.out.println("| Biryani X "+biryaniQty+" : "+(biryaniQty*birayani)+" |");
        System.out.println("| Kebab X "+kebabQty+" : "+(kebabQty*kebab)+" |");
        System.out.println("| Total: "+ ((biryaniQty*birayani)+(kebabQty*kebab))+" |");
        System.out.println("| ----------------------- |");
    }

    void order(int biryaniQty, int kebabQty, int cokeQty){
        System.out.println("| ^^^^^^^^^^^^^^^^^^^^^^^^ |");
        System.out.println("| Biryani X "+biryaniQty+" : "+(biryaniQty*birayani)+" |");
        System.out.println("| Kebab X "+kebabQty+" : "+(kebabQty*kebab)+" |");
        System.out.println("| coke X "+cokeQty+" : "+(cokeQty*coke)+" |");
        System.out.println("| Total: "+ ((biryaniQty*birayani)+(kebabQty*kebab)+(cokeQty*coke))+" |");
        System.out.println("| ----------------------- |");
    }
}
