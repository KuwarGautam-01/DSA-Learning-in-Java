public class AssignmentQ2 {

    public static int printSum(int nums[][]) {
        int col = 0;
        int sum = 0;

        while (col<nums[0].length) {
            sum += nums[1][col];
            col++;
        }

        return sum;
    }
    public static void main(String[] args) {
        // Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
        //Example : Input - int[][] 
        // nums = { {1,4,9},{11,4,3},{2,2,3} };
        // Output : 18

        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};

        System.out.println(printSum(nums));
    }
}
