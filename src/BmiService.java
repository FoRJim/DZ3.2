public class BmiService {
    public double calculate(double weight, double height) {
        double umt = (weight / (height * height));
        return umt;
    }
}
