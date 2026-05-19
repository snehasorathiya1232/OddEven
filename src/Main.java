import java.util.Scanner;

public class Main {

    public static boolean isEven(int num) {

        return num % 2 == 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
}