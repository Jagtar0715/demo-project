public class arrays {
    public static void main(String[] args) {
        int row = 2; int column = 3;
        int matrix [] [] = { { 1, 4 , 9 } , { 11,4,3}};
        printMatrix(matrix);

        int transpose [][] = new int [column] [row];
         for (int i = 0 ; i<row ; i++){
             for ( int j = 0 ; j< column ; j++) {
                 transpose [j][i] = matrix [ i] [j];

             }
           System.out.println(transpose);

         }
printMatrix(transpose);
    }
    public static void printMatrix(int matrix [][]) {
        System.out.println("matrix is : ");
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
