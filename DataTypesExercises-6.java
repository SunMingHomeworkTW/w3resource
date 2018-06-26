import java.util.Scanner;

class DataTypesExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Input height in inches: ");
        double height = scanner.nextDouble();

        double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

        System.out.println("Body Mass Index is " + bmi);
    }
}
