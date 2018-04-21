package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class CommonUtils{
    public static int[] swap(int[] arrayToSwap, int indexFrom, int indexTo){
        int temp = arrayToSwap[indexTo];
        arrayToSwap[indexTo] = arrayToSwap[indexFrom];
        arrayToSwap[indexFrom] = temp;

        return arrayToSwap;
    }

}
