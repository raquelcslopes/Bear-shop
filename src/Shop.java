public class Shop {
    String name;
    int maxProduction;

    public Shop(String name, int maxProduction) {
        this.name = name;
        this.maxProduction=maxProduction;
    }

    public int letsCreateBear () {
        int randomNumber = (int) (Math.random()*maxProduction);
        int numberOfProductions = 0;

        if(randomNumber % 5 == 0) {
            System.out.println("We created " + randomNumber + " Cranky Bears");
            numberOfProductions = randomNumber;
        } else if(randomNumber % 2 ==0) {
            System.out.println("We created " + randomNumber + " Simple Bears");
            numberOfProductions = randomNumber;
        } else {
            System.out.println("We created " + randomNumber + " Drunk Bears");
            numberOfProductions = randomNumber;
        }
        return numberOfProductions;
    }
}
