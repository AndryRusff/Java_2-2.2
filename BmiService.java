public class BmiService {
    public double calculate(int height, int weight) {
        double BMI = weight / Math.pow(height , 2);
        return BMI;
    }
}
