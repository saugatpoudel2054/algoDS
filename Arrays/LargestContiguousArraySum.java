/*
* Here we try to find the sub array in an array which has the maximum sum
* for example in [-1,2,3,-5,3,1]
* the max sum is 5 which is the sum of the sub array [2,3]
*/

public class LargestContiguousArraySum {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, -4, 4, -1 - 2, 1, 5, -3 };
        int result = getMaxSum(arr);

        System.out.println(result);
    }

    public static int getMaxSum(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax, currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

}
