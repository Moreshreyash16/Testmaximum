package Bridgelabz.Testmax;

import java.util.Scanner;

public class TestMaximumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestMaximumUC tm = new TestMaximumUC();
        while (true) {
            System.out.println("Enter number \n 1 for int \n 2 for float \n 3 for String \n 4 to stop");
            int n = sc.nextInt();
            if(n==1 || n==2 || n==3 ) {
                tm.findmax(n);
            }
            else{
                break;
            }
        }
    }
}
