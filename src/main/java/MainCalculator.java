import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int result;

        System.out.println("Write a number from 1 to 4: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(add(a, b));

                break;
            case 2:
                System.out.println(sub(a, b));
                break;
            case 3:
                System.out.println(multiply(a, b));
                break;
            case 4:
                System.out.println(divide(a, b));
                break;
        }
        System.out.println();
        sc.close();


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Number cannot be divided by 0");
        }
        return a / b;
    }
}
