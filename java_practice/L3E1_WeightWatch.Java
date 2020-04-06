public class WeightWatch {
    private final int NUM_DIGITS = 2, TOO_THIN = 16, TOO_BIG = 40;
    private double _weight;
    private double _height;

    public WeightWatch(double weight, double height) {
        if (weight > 0)
            _weight = weight;
        if (height > 0)
            _height = height;
    }
    public double BMI() {
        return _weight / (_height * _height);
    }
    public void BMIChecker() {
        double bmi = BMI();
        bmi = Math.round(bmi * Math.pow(10, NUM_DIGITS)) / (Math.pow(10, NUM_DIGITS));
        System.out.print("your BMI - " + bmi);
        if (bmi < TOO_THIN)
            System.out.println(" ; Its too thin");
        else if (bmi > TOO_BIG)
            System.out.println(" ;  you should lose some weight");
        else
            System.out.println(" ;  you just right");
    }
}
