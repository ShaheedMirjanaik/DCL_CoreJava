class Cafe{

    public static void main(String[] args) {
        Restaurant cafe = new Restaurant();
        cafe.order();
        cafe.order(2);
        cafe.order(3, 2);
        cafe.order(2, 3, 5);
    }
}