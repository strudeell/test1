import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1, val2;
        char operand;
        char calculateOperator = 'c';
        double result = 0;
        do{
            if (calculateOperator == 'c') {
                System.out.print("val1 = ");
                val1 = scanner.nextDouble();
            } else{
                val1 = result;
            }

            System.out.print("operand = ");
            operand = scanner.next().charAt(0);
            System.out.print("val2 = ");
            val2 = scanner.nextDouble();
            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " +operand+" "+ val2 + " = " + result);
            calculateOperator = scanner.next().charAt(0);
    } while (calculateOperator!='s');
    }

    public static double calculate(double val1, double val2, char operand) {
        return switch (operand){
            case '+' -> val1+val2;
            case '-' -> val1-val2;
            case '*' -> val1*val2;
            case '/' -> val1/val2;
            default -> {
                System.out.println("Wrong operand");
                yield 0;
            }
        };
    }
}
