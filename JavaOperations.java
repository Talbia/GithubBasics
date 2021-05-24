import java.util.Scanner;
 
public class JavaOperations{

    public static void main(String args[])
 
 {
    int num1, num2, add, sub, mul;
    float div;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Two Numbers : \n");
    num1 = scanner.nextInt();
    num2 = scanner.nextInt();

    add = num1 + num2;
    sub = num1 - num2;
    mul = num1 * num2;
    div = (float) num1 / num2;

    System.out.println("Sum of two numbers = " + add);
    System.out.println("Subtraction of two numbers = " + sub);
    System.out.println("Multiplication of two numbers = " + mul);
    System.out.println("Division of two numbers = " + div);
  }

}