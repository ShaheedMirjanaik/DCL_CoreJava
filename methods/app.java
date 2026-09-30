public class app {
    
    public static void main(String[] args) {
        TvOverloading tv = new TvOverloading();
        tv.display();
        tv.display(72);
        tv.display(55000);
        tv.display("Sony", 101);
        tv.display(8, "KBC");
    }
}
