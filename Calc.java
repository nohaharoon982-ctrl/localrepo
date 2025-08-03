package noha;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press y to enter data");
        char ch = input.next().trim().charAt(0);
        int c = 0;
        while (ch == 'y') {
            System.out.println("enter the operator");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println(" enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    c = num1 + num2;
                }
                if (op == '-') {
                    c = num1 - num2;
                }
                if (op == '*') {
                    c = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        c = num1 / num2;
                    }

                }
                if (op == '%') {
                    c = num1 % num2;
                }
                System.out.println(c);
                System.out.println("press y to enter more data");
                ch = input.next().trim().charAt(0);
            } else {
                System.out.println("wrong input");

            }
        }
    }
}
