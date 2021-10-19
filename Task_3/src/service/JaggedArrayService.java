package service;

public class JaggedArrayService {
    
        public static int[][] sortingBySumMatrixEl(int[][] array) {
            int[] sum = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                sum[i] = 0;
                for(int j = 0; j < array[i].length; j++) {
                    sum[i] += array[i][j];
                }
            }
            return partOfBubbleSort(array, sum);
        }

        public static int[][] sortingByIncreasingMaxEl(int[][] array) {
            int[] max = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                max[i] = array[i][0];
                for(int j = 1; j < array[i].length; j++) {
                    if(array[i][j] > max[i]) {
                        max[i] = array[i][j];
                    }
                }
            }
            return partOfBubbleSort(array, max);
        }

        public static int[][] sortingByIncreasingMinEl(int[][] array) {
            int[] min = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                min[i] = array[i][0];
                for(int j = 1; j < array[i].length; j++) {
                    if(array[i][j] < min[i]) {
                        min[i] = array[i][j];
                    }
                }
            }
            return partOfBubbleSort(array, min);
        }

        private static int[][] partOfBubbleSort(int[][] resArr, int[] arr) {
            boolean isSorted = false;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < resArr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;

                        int[] temp = resArr[i];
                        resArr[i] = resArr[i+1];
                        resArr[i+1] = temp;

                        int t = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = t;
                    }
                }
            }
            return resArr;
        }
}
