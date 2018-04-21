import Algorithms.InsertionSort;

/**
 * Created by sarou on 4/21/2018.
 */
public class Test {
    public static void main(String []args){
        System.out.println ("Hello");
        int[] testData = {20, 35, -15, 7, 55, 1, -22, 1};
        int[] result = InsertionSort.doInsertionSort (testData);

        for (int x: result){
            System.out.println (x);
        }
    }
}
