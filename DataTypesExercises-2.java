import java.util.Scanner;

class DataTypesExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");

        double inch = scanner.nextDouble();
        double meter = inch*0.0254;

        System.out.println(inch + " inch is " + meter + " meters");
    }
}
