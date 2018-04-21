package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class InsertionSort {
    public static int[] doInsertionSort(int[] arrayToSort){
        int sizeOfArray = arrayToSort.length;
        for (int unsortedIndex = 1; unsortedIndex < sizeOfArray; unsortedIndex++){
            int newElement = arrayToSort[unsortedIndex];

            int i;
            for(i = unsortedIndex; i>0 && arrayToSort[i-1] > newElement ; i--){
                arrayToSort[i]=arrayToSort[i-1];
            }

            arrayToSort[i]=newElement;
        }

        return arrayToSort;
    }
}
