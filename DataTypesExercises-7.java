import java.util.Scanner;

class DataTypesExercises7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double meters = scanner.nextDouble();

        System.out.print("Input hour: ");
        double hour = scanner.nextDouble();

        System.out.print("Input minutes: ");
        double minutes = scanner.nextDouble();

        System.out.print("Input seconds: ");
        double seconds = scanner.nextDouble();

        double totalSeconds = (hour * 60 + minutes) * 60 + seconds;
        double mps = meters / totalSeconds;
        double kmph = (meters / 1000) / (totalSeconds / 3600);
        double mph = (meters / 1000 / 1.609) / (totalSeconds / 3600);

        System.out.println("Your speed in meters/second is " + (float) mps);
        System.out.println("Your speed in km/h is " + (float) kmph);
        System.out.println("Your speed in miles/h is " + (float) mph);
    }
}
