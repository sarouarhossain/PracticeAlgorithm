package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class BubbleSort {
    public static ReturnData doBubbleSort(int[] arrayToSort){
        int counter =0;

        for(int unsortedPartionIndex = arrayToSort.length - 1; unsortedPartionIndex > 0;
                unsortedPartionIndex--){
            for (int i = 1; i<= unsortedPartionIndex; i++){
                counter++;
                if(arrayToSort[i-1] > arrayToSort[i]){
                    arrayToSort = CommonUtils.swap (arrayToSort,i-1, i);
                }
            }
        }

        return new ReturnData (arrayToSort, counter);
    }
}
