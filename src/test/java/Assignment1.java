import java.util.Scanner;

public class Assignment1 {

    private double num1;
    private double num2;

   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("(+) Addition (-) Subtraction (*) Multiplication (/) Division");
        System.out.println();
        System.out.println();

        System.out.print("First number: ");
        double num1 = scanner.nextDouble() * 1.0;
        System.out.println();

        System.out.print("Enter Operation: ");
        String operation = scanner.next();
        System.out.println();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble() * 1.0;
        System.out.println();

        if(operation.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
        }else if(operation.equals("-")){
            System.out.println(num1 + " - " + num2 + " = " +  subtract(num1,num2));
        }else if(operation.equals("*")){
            System.out.println(num1 + " * " + num2 + " = " +  multiply(num1,num2));
        }else if(operation.equals("/")){
            System.out.println(num1 + " / " + num2 + " = " +  divide(num1,num2));
        }else {
            System.out.println("Wrong operation input!");
        }

    }


    public static double add(double first, double second) {
        double result;
        result = first + second;
        return result;
    }
    public static double subtract(double first, double second) {
        double result;
        result = first - second;
        return result;
    }
    public static double multiply(double first, double second) {
        double result;
        result = first * second;
        return result;
    }
    public static double divide(double first, double second) {
        double result;
        result = first / second;
        return result;
    }


}


