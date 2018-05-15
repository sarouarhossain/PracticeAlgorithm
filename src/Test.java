import Algorithms.*;
import Recursion.BasicRecursion;
import Recursion.EuclidianGCD;
import Recursion.Factorial;
import Recursion.HaoreAlgorithm;
import Recursion.TowerOfHanoi;

/**
 * Created by sarou on 4/21/2018.
 */
public class Test {
    public static void main(String []args){
        System.out.println ("Hello");
        int[] testData = {20, 35, -15, 7, 55, 1, -22, 1};
        int[] testData1 = {-22, -15, 1, 1, 7, 20, 35, 55};
        int[] testData2 = {55, 35, 20, 7, 1, 1, -15, -22};

        /* ReturnData checkBubble = BubbleSort.doBubbleSort (testData2);
        ReturnData checkSelection = SelectionSort.doSelectionSort (testData2);
        ReturnData checkInsertion = InsertionSort.doInsertionSort (testData2);
        ReturnData checkShell = ShellSort.doShellSort (testData2);

        checkBubble.showReturnData ();
        checkSelection.showReturnData ();
        checkInsertion.showReturnData ();
        checkShell.showReturnData (); */

        /*EuclidianGCD gcd = new EuclidianGCD();

        System.out.println(gcd.gcdRecursive(15,9));
        System.out.println(gcd.gcdIterative(15,9));*/

        /*TowerOfHanoi tower = new TowerOfHanoi();
        tower.solveHanoi(10,'F','M', 'T');*/

        int[] testArray = {1,5,4,8,-2,3};
        HaoreAlgorithm haoreAlgorithm = new HaoreAlgorithm(testArray);
        System.out.println(haoreAlgorithm.select(2));

    }
}
