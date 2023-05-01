package Bridgelabz.Testmax;

import java.util.Scanner;

public class TestMaximumUC <T> {
    public T x;
    public T y;
    public T z;
    public <T extends Comparable<T>> T TestMaximumUC4(T p, T q, T r) {

        T x=p;
        T y=q;
        T z=r;
        T max = p;

        if (q.compareTo(max) > 0)
            max = q;

        if (r.compareTo(max) > 0)
            max = r;

        return max;
    }
    Scanner sc = new Scanner(System.in);
    public void findmax(int n){
        if (n == 1) {
            System.out.println("Enter three integer");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int number3 = sc.nextInt();
            System.out.println("The maximum value is : " + TestMaximumUC4(number1, number2, number3));
        } else if (n == 2) {
            System.out.println("Enter three float");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            float num3 = sc.nextFloat();
            System.out.println("The maximum value is : " + TestMaximumUC4(num1, num2, num3));
        } else if (n == 3) {
            System.out.println("Enter three integer");
            String name1 = sc.next();
            String name2 = sc.next();
            String name3 = sc.next();
            System.out.println("The maximum value is : " + TestMaximumUC4(name1, name2, name3));

        }
    }

}


