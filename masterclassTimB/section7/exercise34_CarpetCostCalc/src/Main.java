public class Main {
    public static void main(String[] args) {
        // the following is testing code:
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);

        Calculator calculator = new Calculator(floor, carpet);

        // should print out: total = 38.5
        System.out.println("Total= " + calculator.getTotalCost());

        // testing scenario #2
        Carpet anotherCarpet = new Carpet(1.5);
        Floor anotherFloor = new Floor(5.4, 4.5);

        Calculator anotherCalculator = new Calculator(anotherFloor, anotherCarpet);

        // should print out: total= 36.45
        System.out.println("Total= " + anotherCalculator.getTotalCost());

        // all testing scenarios are successful.
        // exercise completed.
    }
}