package matrix;

public class InplaceRotateSquareMatrixBy90Degrees {
    public static void main(String[] a){
        int matrixSize = 5;
        int[][] matrix = {{1,2, 3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        //{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}; //{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//
        //new int[matrixSize][matrixSize];
        int startIndex = 0;
        int lastIndex;
        while(startIndex < matrixSize/2) {
            lastIndex = matrixSize -1 -startIndex;
/*            for(int i = startIndex; i < lastIndex; i++) {
                int temp = matrix[startIndex][i];
                matrix[startIndex][i] = matrix[i][lastIndex];
                matrix[i][lastIndex] = matrix[lastIndex][matrixSize -1 - i];
                matrix[lastIndex][matrixSize -1 - i] = matrix[matrixSize -1 - i][startIndex];
                matrix[matrixSize -1 - i][startIndex] = temp;
            }*/

            for(int i = 0; i < lastIndex - startIndex; i++){
                int temp = matrix[startIndex][startIndex+i];
                matrix[startIndex][startIndex+i] = matrix[startIndex + i][lastIndex];
                matrix[startIndex + i][lastIndex] = matrix[lastIndex][lastIndex - i];
                matrix[lastIndex][lastIndex-i] = matrix[lastIndex - i][startIndex];
                matrix[lastIndex - i][startIndex] = temp;
            }
            startIndex++;
        }

        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
