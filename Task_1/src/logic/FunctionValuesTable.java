package logic;

import java.util.ArrayList;

public class FunctionValuesTable {

    public static ArrayList<Double> functionValuesTable(int step, int startBorder, int endBorder){
        ArrayList<Double> values = new ArrayList<>();
        for (double i = startBorder; i< endBorder; i+= step){
         values.add(i);
         values.add(Math.tan(i));
        }
        return values;
    }
}
