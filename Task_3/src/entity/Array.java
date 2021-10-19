package entity;

import logic.ArrayFunctions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public final class Array  {

    private int[] array;
    private final ArrayFunctions arrayFunctions = new ArrayFunctions();
    private final Scanner scanner = new Scanner(System.in);

    public Array(int[] i) {
        this.array = i;
    }

    public Array(String i) {
        String[] strArr = i.split(" ");
        int[] numArr = new int[strArr.length];
        for (int j = 0; j < strArr.length; j++) {
            numArr[j] = Integer.parseInt(strArr[j]);
        }
        this.array = numArr;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray(){
        for (int i = 0; i<array.length; i++){
            if (i%10==0 && i!=0)
                System.out.println();
            System.out.print(array[i]+" ");
            if (i == array.length-1)
                System.out.println();
        }
    }

    public int[] sortArr() {
        int menu;
        do {
            System.out.println("Choose sort type:");
            System.out.println("1-quickSort:");
            System.out.println("2-bubbleSort:");
            System.out.println("3-insertionSort:");
            System.out.println("4-exit:");
            menu = scanner.nextInt();
            switch (menu) {
                case (1): {
                    ArrayFunctions.quickSort(array,0,array.length-1);
                    printArray();
                    return array;
                }
                case (2): {
                    ArrayFunctions.bubbleSort(array);
                    printArray();
                    return array;
                }
                case (3): {
                    ArrayFunctions.sortByInsert(array);
                    printArray();
                    return array;
                }
                case (4): {
                    break;
                }
                default: {
                    System.out.println("Incorrect menu input. Try again");
                    break;
                }
            }
        } while (menu != 4);
        return null;
    }

    public int binarySearch() {
        System.out.println("You need to sort array before binary search: ");
        sortArr();
        System.out.println("Input value of element for binary search: ");
        int item = scanner.nextInt();
        return ArrayFunctions.binarySearch(array, item);
    }

    public int minMaxValue(){
        int menu;
        do {
            System.out.println("Choose operation:");
            System.out.println("1-min array Value:");
            System.out.println("2-max array Value:");
            System.out.println("3-exit:");
            menu = scanner.nextInt();
            switch (menu) {
                case (1): {
                    printArray();
                    return ArrayFunctions.minValue(array);
                }
                case (2): {
                    printArray();
                    return ArrayFunctions.maxValue(array);
                }
                case (3): {
                    break;
                }
                default: {
                    System.out.println("Incorrect menu input. Try again");
                    break;
                }
            }
        } while (menu != 3);
        return 0;
    }

    public int[] getArrayNaturalCounts(){
        printArray();
        System.out.println();
        int[] result;
        result = ArrayFunctions.countAndValuesOfNatNumbers(array);
        int count = 0;
        for (int i = 0;i<result.length;i++){
            if (result[i]!=0) {
                System.out.print(result[i]+" ");
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no natural counts in this array.");
        }
        return result;
    }

    public int[] getArrayFibonacciCounts(){
        printArray();
        System.out.println();
        int[] result;
        result = ArrayFunctions.countAndValuesOfFibonacciNumbers(array);
        int count = 0;
        for (int i = 0;i<result.length;i++){
            if (result[i]!=0) {
                System.out.print(result[i]+" ");
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no fibonacci counts in this array.");
        }
        return result;
    }

    public int[] getArrayDifferentCounts(){
        System.out.println();
        int[] result;
        result = ArrayFunctions.countOfDifferentNumbers();
        for (int i = 0;i<result.length;i++){
            if (result[i]!=0) {
                System.out.print(result[i]+" ");
            }
            if (i%100==0 && i!=0){
                System.out.println();
            }
        }
        return result;
    }

    public void initArray() {
        int menu;
        do {
            System.out.println("Choose type of init:");
            System.out.println("1-console init:");
            System.out.println("2-file init:");
            System.out.println("3-random init:");
            System.out.println("4-exit:");
            menu = scanner.nextInt();
            switch (menu) {
                case (1): {
                    array = ArrayFunctions.consoleInit();
                    break;
                }
                case (2): {
                    try {
                        array = ArrayFunctions.fileInit();
                    }catch (IOException e){
                        System.out.println();
                    }
                    break;
                }
                case (3): {
                    array = ArrayFunctions.randomInit();
                }
                case (4): {
                    break;
                }
                default: {
                    System.out.println("Incorrect menu input. Try again");
                    break;
                }
            }
        } while (menu != 4);
    }
}
