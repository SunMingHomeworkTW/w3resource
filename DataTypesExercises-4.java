import java.util.Scanner;

class DataTypesExercises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");

        long minutes = scanner.nextLong();
        long years=minutes/(60*24*365);
        int days=(int) (minutes/(60*24)%365);

        System.out.println(minutes+" minutes is approximately " + years + " years and "+days+" days");
    }
}
