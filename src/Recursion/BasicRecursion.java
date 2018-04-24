package Recursion;

public class BasicRecursion {
    public void tailRecursion(int N){
        if(N==0) return;
        System.out.println("N="+N);
        tailRecursion(N-1);
    }

    public void headRecursion(int N){
        if(N==0) return;
        headRecursion(N-1);
        System.out.println("N="+N);
    }
}
