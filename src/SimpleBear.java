public class SimpleBear extends Bear {


    public SimpleBear() {
        super();

    }

    @Override
    public void general() {
        if (loosingBattery() == 0) {
            System.out.println("Battery 000");
        }
    }
}

