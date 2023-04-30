package Bridgelabz.Testmax;

public class TestMaximumUC {
            public void compareInt(int a,int b,int c){
                int max=a;
                if (b>max && b>c ) {
                    max = b;
                }
                else if(c>max){
                    max=c;
                }
                System.out.println("the maximum number is " + max);
            }
}

