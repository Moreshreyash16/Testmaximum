package Bridgelabz.Testmax;

import java.util.Scanner;

public class TestMaximumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestMaximumUC tm = new TestMaximumUC();
        System.out.println("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        tm.compareInt(num1,num2,num3);
    }
}
