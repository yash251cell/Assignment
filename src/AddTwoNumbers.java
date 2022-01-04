import java.util.Scanner;
//Program for the addition of two numbers
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //Input number1
        int num2 = scanner.nextInt();//Input number2
        int sum = num1+num2;
        System.out.println(sum);
    }
}
