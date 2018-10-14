package rotatingArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumValueOfSumRotatingArray {
    public static void maxValue(int[] arr){
        int sumOfElements = Arrays.stream(arr).sum();
        int currentValue = 0;
        for(int i = 0; i < arr.length; i++){
            currentValue += arr[i]*i;
        }

        int maxValue = currentValue;
        for(int i =0; i < arr.length; i++){
            currentValue -= sumOfElements - arr.length * arr[i];
            if(currentValue > maxValue)
                maxValue = currentValue;
        }

        System.out.println(sumOfElements);
        System.out.println(maxValue);
    }
    public static void main(String[] a){
        int[] arr = {8, 3, 1, 2};
        maxValue(arr);
    }
}
