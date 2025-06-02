public class CrankyBear extends Bear {

    public CrankyBear() {
        super();
    }


    public void general () {
        boolean sadSong = false;

        while (loosingBattery() != 0) {
            if (loosingBattery() >= 50) {
                talk();
            } else {
                if(!sadSong) {
                    sadSong = true;
                    System.out.println("Sad song \nBattery 000");
                }
            }
        }
    }
}
