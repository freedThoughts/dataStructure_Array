package problemSet_1;

/**
 * Created by Prakash on 07-10-2018.
 *
 * Given an array F with size n. Assume the array content F[i] indicates the file number.
 * We want to merge all the files into single file.
 */
public class MergeAllFilesInOneInLogNComplexity {
    int mergeAllFilesInOne(int[] arr) {
        int numberOfCycle = 1;
        while (numberOfCycle < arr.length) {
            int i = 0;
            int j = i + numberOfCycle;
            while (j < arr.length) {
                mergeAndStoreAtFirstFileLocation(i, j);
                i = j + numberOfCycle;
                j = i + numberOfCycle;
            }
            numberOfCycle *= 2;
        }
        return arr[0];
    }

    void mergeAndStoreAtFirstFileLocation(int i, int j){}

}
