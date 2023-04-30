package Bridgelabz.Testmax;

import java.util.Scanner;

public class TestMaximumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestMaximumUC tm = new TestMaximumUC();
        System.out.println("Enter three numbers");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();
        tm.compareFloat(num1,num2,num3);
    }
}

