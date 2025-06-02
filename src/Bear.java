public abstract class Bear {
    protected int battery;

    public Bear() {
        this.battery = 100;
    }

    public void talk () {
        System.out.println("I Love You");
    }


    public int loosingBattery () {
        if(battery > 0) {
            battery --;
        }
        return battery;
    }

    public abstract void general ();
}
