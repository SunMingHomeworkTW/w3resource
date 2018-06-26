import java.util.Scanner;

class DataTypesExercises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");

        int inputInt = scanner.nextInt();
        int sumOfDigits = 0;
        int temp=inputInt;
        while (temp>0){
            sumOfDigits+=temp%10;
            temp/=10;
        }

        System.out.println("The sum of all digits in " + inputInt + " is "+sumOfDigits);
    }
}
