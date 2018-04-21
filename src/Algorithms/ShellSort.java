package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class ShellSort {
    public static ReturnData doShellSort(int[] arrayToSort) {
        int counter =0;
        for(int gap = arrayToSort.length/2; gap > 0; gap/=2){
            for (int i = gap; i<arrayToSort.length; i++) {
                int j=i;
                int newElement = arrayToSort[i];
                while(j >= gap && arrayToSort[j-gap] > newElement){
                    arrayToSort[j] = arrayToSort[j-gap];
                    j-=gap;
                    counter++;
                }
                arrayToSort[j]=newElement;
                counter++;
            }
        }

        return new ReturnData (arrayToSort, counter);
    }
}
