package Recursion;

public class TowerOfHanoi {
    public void solveHanoi(int N, char from, char middle, char to){
       // System.out.println(N+" "+from+" "+middle+" "+to);
        if(N==1){
            System.out.println("Plate 1 from "+from+" to "+to);
            return;
        }

        solveHanoi(N-1,from, to, middle);
        System.out.println("Plate "+N+" from "+from+" to "+to);
        solveHanoi(N-1,middle,from,to);
    }
}
