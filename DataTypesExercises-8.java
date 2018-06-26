import java.util.Scanner;

class DataTypesExercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double number = scanner.nextDouble();

        System.out.printf("Square: %.2f\n", number * number);
        System.out.printf("Cube: %.2f\n", number * number * number);
        System.out.printf("Fourth power: %.2f\n", Math.pow(number, 4));
    }
}
