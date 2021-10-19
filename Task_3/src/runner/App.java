package runner;


import entity.Array;
import logic.ArrayFunctions;
import service.JaggedArrayService;

public class App {
    public static void main(String[] args){
        Array array = new Array(ArrayFunctions.randomInit());
        array.minMaxValue();
        array.sortArr();
        array.binarySearch();
        array.getArrayNaturalCounts();
        array.getArrayDifferentCounts();
        array.getArrayFibonacciCounts();
        array.initArray();  //task1
        int[][] arr = new int[][]{ { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1, 1, 12, 13, 14, 17 }, { 1, 8, 2, 6, 4, 5, 0 },
                { 1, 1, 12, 13, 14, 17}, { 5, 4, 3, 2, 1, 13, 14, 15, 16, 17}, { 1, 1, 1, 0, 2, 0, 1, 12, 135666 }};
        int[][] rez1 = JaggedArrayService.sortingByIncreasingMaxEl(arr);
        int[][] rez2 = JaggedArrayService.sortingByIncreasingMinEl(arr);
        int[][] rez3 = JaggedArrayService.sortingBySumMatrixEl(arr);//task2

    }
}
