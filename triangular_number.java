package JAVA.HW1_Java;

import java.util.Scanner;

public class triangular_number {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        boolean flag = iScanner.hasNextInt();
        if (flag) {
            int n = iScanner.nextInt();
            iScanner.close();
            int tn = n * (n + 1) / 2;
            System.out.printf("Для n: %d треугольным числом является: %d\n", n, tn);
        } else {
            System.out.println("Введено значение, отличное от натурального числа");
        }

    }
}
