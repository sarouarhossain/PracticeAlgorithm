package Recursion;

import java.util.concurrent.ThreadLocalRandom;

public class HaoreAlgorithm {
    private int[] nums;

    public HaoreAlgorithm(int[] nums){
        this.nums = nums;
    }

    public int select(int k){
        return select(0,nums.length-1,k-1);
    }

    private int select(int firstIndex, int lastIndex, int k){
        int pivot = partition(firstIndex,lastIndex);

        if(pivot > k){
            select(firstIndex,pivot-1,k);
        } else if(pivot < k){
            select(pivot+1,lastIndex, k);
        }

        return nums[k];
    }

    private int partition(int firstIndex, int lastIndex){
        int pivot = ThreadLocalRandom.current().nextInt(firstIndex, lastIndex+1);

        swap(pivot,lastIndex);

        for (int i = firstIndex; i< lastIndex; i++){
            if(nums[i] > nums[lastIndex]){
                swap(firstIndex,i);
                firstIndex++;
            }
        }

        swap(firstIndex, lastIndex);

        return firstIndex;
    }

    private void swap(int from, int to){
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
    }
}
