package logic;

import entity.Array;

import java.nio.charset.Charset;
import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctions {
    private static final Scanner scanner = new Scanner(System.in);

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int devEl = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < devEl) {
                i++;
            }

            while (array[j] > devEl) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortByInsert(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static int binarySearch(int[] array, int item) {
        int position;
        int comparisonCount = 1;
        int first = 0;
        int last = array.length - 1;
        position = (first + last) / 2;
        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++position + " in array");
            System.out.println("Count of comparisons " + comparisonCount);
            return position;
        } else {
            System.out.println("There is no such element in array. " +
                    "Count of comparisons " + comparisonCount);
            return 0;
        }
    }

    public static int minValue(int[] i) {
        int min = i[0];
        for (int j = 1; j < i.length; j++) {
            if (i[j] < min) {
                min = i[j];
            }
        }
        System.out.println("Min value of array: " + min);
        return min;
    }

    public static int maxValue(int[] i) {

        int max = i[0];
        for (int j = 1; j < i.length; j++) {
            if (i[j] > max) {
                max = i[j];
            }
        }
        System.out.println("Max value of array: " + max);
        return max;
    }

    public static int[] countAndValuesOfNatNumbers(int[] i) {
        int[] result = new int[i.length];
        int count = 0;
        for (int j = 0; j < i.length; j++) {
            boolean flag = true;
            for (int k = 2; k < i[j] - 1; k++) {
                if (i[j] % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = i[j];
                count++;
            }
        }
        return result;
    }

    public static int[] countAndValuesOfFibonacciNumbers(int[] i) {
        int[] result = new int[i.length];
        int count = 0;
        for (int j = 0; j < i.length; j++) {
            if (isCountFibonacci(i[j])) {
                result[count] = i[j];
                count++;
            }
        }
        return result;
    }

    private static boolean isCountFibonacci(long num) {
        double tmp = 5 * num * num - 4;
        double tmp1 = 5 * num * num + 4;
        double sq = (long) Math.sqrt(tmp);
        double sq1 = (long) Math.sqrt(tmp1);
        return sq * sq == tmp || sq1 * sq1 == tmp1;
    }

    public static int[] countOfDifferentNumbers() {
        int[] result = new int[1000];
        int count = 0;
        for (int j = 100; j < 1000; j++) {
            int temp = j;
            int a = temp % 10;
            temp = temp / 10;
            int b = temp % 10;
            temp = temp / 10;
            int c = temp % 10;
            if (a != b && a != c && b != c) {
                result[count] = j;
                count++;
            }
        }
        return result;
    }

    public static int[] consoleInit() {
        System.out.println("Input count of elements: ");
        int count = scanner.nextInt();
        int[] arr = new int[count - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] fileInit() throws IOException {
        try {
            String relativelyPath=System.getProperty("user.dir");
            String PATH = relativelyPath.concat("\\fileInit.txt");
            if(Files.notExists(Path.of(PATH))) {
                Files.createFile(Path.of(PATH));
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            String sCurrentLine;
            String s = null;
            List<String> contentOfTheFile = Files.readAllLines(Path.of(PATH),
                    Charset.defaultCharset());
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                if (s!=null)
                contentOfTheFile.add(s);
                s = sCurrentLine;
            }
            int[] init = new int[100];
            for (int i = 0;i<contentOfTheFile.size();i++){
                String[] reg1 = contentOfTheFile.get(i).split(" ");
                for (int j = 0; j<reg1.length;j++){
                    init[j]= Integer.parseInt(reg1[j]);
                }
            }
            return init;
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    public static int[] randomInit(){
        System.out.println("Input count of elements: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[i]);
        }
        return array;
    }
}


