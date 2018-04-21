package Algorithms;

/**
 * Created by sarou on 4/21/2018.
 */
public class ReturnData {
    public int[] sortedData;
    public int count;

    public ReturnData(int[] sortedData, int count){
        this.sortedData = sortedData;
        this.count = count;
    }

    public void showReturnData(){
        for (int data : sortedData){
            System.out.println (data);
        }

        System.out.println ("Show count no: "+ count);
    }

}
