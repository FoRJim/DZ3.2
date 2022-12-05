public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        double weight = 75;// масса
        double height = 1.85; // рост
        double umt = index.calculate(weight, height);
        System.out.println("Индекс массы тела: " + umt);
    }
}