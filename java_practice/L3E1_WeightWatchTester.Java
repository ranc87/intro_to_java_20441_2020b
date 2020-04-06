public class WeightWatchTester {
    public static void main(String[] args) {
        WeightWatch yoni = new WeightWatch(10, 1.2);
        WeightWatch yossi = new WeightWatch(95, 1.50);
        WeightWatch nurit = new WeightWatch(60, 1.60);
        WeightWatch yael = new WeightWatch(55, 1.65);

        System.out.print("Hey yoni, ");
        yoni.BMIChecker();
        System.out.print("Hey yossi, ");
        yossi.BMIChecker();
        System.out.print("Hey nurit, ");
        nurit.BMIChecker();
        System.out.print("Hey yael, ");
        yael.BMIChecker();
    }
}
