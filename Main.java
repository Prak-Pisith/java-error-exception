import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = scanner.nextInt();
            int result = divideByZero(num);
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catched ArithmeticException");
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Catched ArithmeticException");
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Closed");
            scanner.close();
        }
    }

    public static int divideByZero(int num) {
        if (num == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return 10 / num;
    }
}

