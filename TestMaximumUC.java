package Bridgelabz.Testmax;

public class TestMaximumUC {
    public void compareString(String a, String b, String c) {
        int num1=a.compareTo(b);//20
        int num2=b.compareTo(c);//15
        int num3=c.compareTo(a);//10
        int max=num1;
        if(num2>max && num2>num3){
            System.out.println("String " + b +" is the biggest");
        } else if (num3>max) {
            System.out.println("String " + c +" is the biggest");
        }
        else {
            System.out.println("String " + a +" is the biggest");
        }
    }


}