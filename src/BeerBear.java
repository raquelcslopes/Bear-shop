public class BeerBear extends Bear {

    public BeerBear() {
        super();
    }

    @Override
    public void general() {
        int probability = (int) (Math.random() * 101);

        if (probability <= 20) {
            System.out.println("ZZZZ zzzz");
        } else {
            talk();
        }
    }
}
