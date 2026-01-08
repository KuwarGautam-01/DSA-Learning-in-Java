public class AssignmentQ3 {

    public static int[][] transposeOfMatrix(int matrix[][]) {

        // //Good Approach // VOID function
        // for(int j=0 ; j<matrix[0].length ; j++) {
        //     for(int i=0 ; i<matrix.length ; i++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Prev one was Good but For Interview Purpose Use Below One
        int rows = matrix.length;
        int cols = matrix[0].length;

        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
    public static void main(String[] args) {
        //Question 3 :Write a program to Find Transpose of a Matrix.
        // What is Transpose ? Transpose of a matrix is the process ofswapping the rows to columns. 
        // For a 2x3 matrix  , Matrix    a11    a12    a13
        //                               a21    a22    a23

        // Transposed Matrix.        a11    a21    
        //                           a12    a22    
        //                           a13    a23

        int matrix[][] = {{1 , 2 , 3} , {4 , 5 , 6}};

        int result[][] = transposeOfMatrix(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
