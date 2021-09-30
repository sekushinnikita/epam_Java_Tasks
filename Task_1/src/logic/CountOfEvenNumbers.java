package logic;

import java.util.ArrayList;

public class CountOfEvenNumbers {

    public static ArrayList<Integer> countOfEvenNumbers(Integer a,Integer b,Integer c,Integer d){
        ArrayList<Integer> countOfEvenNumbers = new ArrayList<>();
        if (a%2==0)
            countOfEvenNumbers.add(a);
        if (b%2==0)
            countOfEvenNumbers.add(b);
        if (c%2==0)
            countOfEvenNumbers.add(c);
        if (d%2==0)
            countOfEvenNumbers.add(d);
        return countOfEvenNumbers;
    }
}
