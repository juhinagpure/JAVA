import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = scanner.next();
       
        
        int answer = performOperation(a, b, operation);
        System.out.println("answer is: " + answer);
    }

    public static int performOperation(int a, int b, String operation)
    {
        int answer = 0;
        if (operation.equals("+")) {
            answer = a + b;
        }
        else if (operation.equals("-")) {
            answer = a - b;
        }
        else if (operation.equals("*")) {
            answer = a * b;
        }
        else if (operation.equals("%")) {
            answer = a % b;
        }
        else if (operation.equals("/")) {
            answer = a / b;
        }
        else {
            System.out.println("Wrong operation");
        }
        return answer;
    }
}