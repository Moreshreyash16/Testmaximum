package Bridgelabz.Testmax;

public class TestMaximumUC {
    public void compareFloat(float a,float b,float c){
        float max=a;
        if (b>max && b>c ) {
            max = b;
        }
        else if(c>max){
            max=c;
        }
        System.out.println("the maximum number is " + max);
    }
}
