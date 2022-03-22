public class ArrayProblems {
    /*
     * Here we try to find the sub array in an array which has the maximum sum for
     * example in [-1,2,3,-5,3,1] the max sum is 5 which is the sum of the sub array
     * [2,3]
     */
    public static int getMaxSum(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax, currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    /*
     * Here in an array conainign natural number from 1 to n but 1 number is
     * missing. We find that missing number
     */
    public static int getMissingNumber(int[] arr) {
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int n = arr.length + 1;
        int formulaSum = (n * (n + 1)) / 2;

        return formulaSum - actualSum;
    }
}
