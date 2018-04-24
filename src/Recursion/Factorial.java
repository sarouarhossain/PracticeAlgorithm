package Recursion;

public class Factorial {
    public int factorial(int N){
        if(N==1) return 1;
        return N*factorial(N-1);
    }

    public int betterFactorial(int accumulator, int N){
        if(N==1) return accumulator;
        return betterFactorial(accumulator*N,N-1);
    }

    public int callBetterFactorial(int N){
        return betterFactorial(1,N);
    }
}
