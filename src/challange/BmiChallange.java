package challange;


public class BmiChallange {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;

        // bmi = masa / (wzrost * wzrost)
        // wzrost w metrach

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + bmi);
        System.out.println("Całkowite BMI: " + (int)bmi);
    }
}
