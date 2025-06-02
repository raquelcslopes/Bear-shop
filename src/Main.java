public class Main {
    public static void main(String[] args) {
        Bear crankyBear = new CrankyBear();
        Bear drunkBear = new BeerBear();

        Shop shop1 = new Shop("Shop Bear",100);
        Shop shop2 = new Shop("Bear Shopping", 100);

        if(shop1.letsCreateBear() > shop2.letsCreateBear()) {
            System.out.println(shop1.name + " wins");
        } else {
            System.out.println(shop2.name + " wins");
        }
    }
}

