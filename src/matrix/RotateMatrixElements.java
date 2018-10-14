package matrix;

public class RotateMatrixElements {
    public static void main(String[] a) {
        int numberOfRows = 3;
        int numberOfColumn = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int firstRowIndex = 0;
        int lastRowIndex = numberOfRows -1;
        int firstColumnIndex = 0;
        int lastColumnIndex = numberOfColumn -1;

        while(firstRowIndex < lastRowIndex && firstColumnIndex < lastColumnIndex){

            // Top Row
            int previousValue = matrix[firstRowIndex + 1][firstColumnIndex];
            int nextValue = matrix[firstRowIndex][lastColumnIndex];
            for(int i = lastColumnIndex; i > firstColumnIndex; i--){
                matrix[firstRowIndex][i] = matrix[firstRowIndex][i-1];
            }
            matrix[firstRowIndex][firstColumnIndex] = previousValue;
            previousValue = nextValue;
            firstRowIndex++;

            // Rightmost column
            nextValue = matrix[lastRowIndex][lastColumnIndex];
            for(int i = lastRowIndex; i > firstRowIndex; i--){
                matrix[i][lastColumnIndex] = matrix[i-1][lastColumnIndex];
            }
            matrix[firstRowIndex][lastColumnIndex] = previousValue;
            previousValue = nextValue;
            lastColumnIndex--;

            // Bottom Row
            nextValue = matrix[lastRowIndex][firstColumnIndex];
            for(int i = firstColumnIndex; i < lastColumnIndex; i++){
                matrix[lastRowIndex][i] = matrix[lastRowIndex][i+1];
            }
            matrix[lastRowIndex][lastColumnIndex] = previousValue;
            previousValue = nextValue;
            if(lastRowIndex -1 < firstRowIndex)
                break;
            lastRowIndex--;

            // Leftmost column
            nextValue = matrix[firstRowIndex][firstColumnIndex];
            for(int i = 0; i < lastRowIndex; i++){
                matrix[i][firstColumnIndex] = matrix[i +1][firstColumnIndex];
            }
            matrix[lastRowIndex][firstColumnIndex] = previousValue;
            previousValue = nextValue;
            firstColumnIndex++;

        }

        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j < numberOfColumn; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
