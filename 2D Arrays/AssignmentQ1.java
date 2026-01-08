public class AssignmentQ1 {

    public static int printQuantity(int matrix[][] , int key) {
        int count = 0;

        for(int row=0 ; row<matrix.length ; row++) {
            for(int col=0 ; col<matrix[0].length ; col++) {
                if (matrix[row][col] == key) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        //Question 1 :Print the number of 7’s that are in the 2d array.

        int matrix[][] = {{4,7,8} , {8,8,7}};
        int key = 7;

        System.out.println(printQuantity(matrix, key));
    }
}
