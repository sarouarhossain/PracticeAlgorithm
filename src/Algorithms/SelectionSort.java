package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class SelectionSort {
    public static ReturnData doSelectionSort(int[] arrayToSort){
        int counter =0;

        for(int lastUnsortedIndex = arrayToSort.length - 1 ; lastUnsortedIndex > 0;
            lastUnsortedIndex--){

            int largestIndex = 0;
            for(int i =0; i< lastUnsortedIndex ; i++){
                if(arrayToSort[i] > arrayToSort[largestIndex]){
                    largestIndex = i;
                    counter ++;
                }
            }
            counter++;
            arrayToSort = CommonUtils.swap (arrayToSort, largestIndex, lastUnsortedIndex);
        }
        return new ReturnData (arrayToSort,counter);
    }
}
