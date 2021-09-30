package service;

import entity.Point;
import logic.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstTaskFunctions {
    Scanner scanner = new Scanner(System.in);

    public void firstTaskResults(){
        System.out.println("Input number:");
        int result = LastNumCount.lastNumberCount(scanner.nextInt());
        System.out.println("Last count of your number degree is " + result);
    }

    public void secondTaskResults(){
        System.out.println("Input year:");
        int year = scanner.nextInt();
        System.out.println("Input month:");
        int month = scanner.nextInt();
        int countOfDays = CountOfDays.countOfDays(year,month);
        if (countOfDays==0 || year < 0)
            System.out.println("Incorrect month or year");//плохо
        else
            System.out.println("Count of days in "+ year +" year and "+ month+" month is "+ countOfDays);
    }

    public void thirdTaskResults(){
        System.out.println("Input box(square) square:");
        int boxSquare = scanner.nextInt();
        ArrayList<Double> list = new ArrayList<>(SquareOfInscribedBox.squareOfInscribedBox(boxSquare));
        System.out.println("Square of inscribed box is: "+list.get(0));
        System.out.println("Described box bigger then inscribed box in "+list.get(1)+" times");
    }

    public void fourthTaskResults(){
        System.out.println("Input 4 int values:");
        ArrayList<Integer> list = new ArrayList<>(CountOfEvenNumbers.countOfEvenNumbers
                (scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.nextInt()));
        if (list.size()>=2)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public void fifthTaskResults(){
        System.out.println("Input your count:");
        boolean answer = IsCountPerfect.isCountPerfect(scanner.nextInt());
        System.out.println(answer);
    }

    public void sixthTaskResults(){
        System.out.println("Input count of seconds:");
        String answer = TimeOfDay.timeOfDay(scanner.nextInt());
        if (answer == null)
            System.out.println("Incorrect input.");
        else
            System.out.println(answer);
    }

    public void seventhTaskResults(){
        System.out.println("Input points coordinates");
        Point answer = NearestToOPoint.nearestToOPoint(new Point(scanner.nextInt(),
                scanner.nextInt()), new Point(scanner.nextInt(),scanner.nextInt()));
        System.out.println( answer.toString()+" nearest to O coordinate");
    }

    public void eighthTaskResults(){
        System.out.println("Input value of x:");
        int x = scanner.nextInt();
        int answer = FunctionValue.functionValue(x);
        if (answer == 0)
            System.out.println("((x*x*x)-6) cannot be equal to 0");
        else
            System.out.println("Function value in x = "+x + " is "+answer);
    }

    public void ninthTaskResults(){
        System.out.println("Input radius:");
        ArrayList<Double> answer= new ArrayList<>
                (CircumferenceAndCircleArea.circumferenceAndCircleArea(scanner.nextInt()));
        System.out.println("Circumference length is "+answer.get(0)+
                " and circle area is "+ answer.get(1));
    }

    public void tenthTaskResults(){
        System.out.println("Input function step:");
        int step = scanner.nextInt();
        System.out.println("Input start and end border:");
        int startBorder= scanner.nextInt();
        int endBorder = scanner.nextInt();
        ArrayList<Double> answer = new ArrayList<>
                (FunctionValuesTable.functionValuesTable(step,startBorder,endBorder));
        for (int i = 0; i < answer.size(); i++){
            if (i%2==0 )
                System.out.print(" x = "+answer.get(i));
            else
                System.out.println(" y = "+answer.get(i));
        }
    }
}
