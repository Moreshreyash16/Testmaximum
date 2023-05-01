package Bridgelabz.Testmax;

import java.util.Scanner;

public class TestMaximumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestMaximumUC tm = new TestMaximumUC();
        System.out.println("Enter three Strings");
        String name1 = sc.next();
        String name2 = sc.next();
        String name3 = sc.next();
        tm.compareString(name1,name2,name3);
    }
}

