package logic;

import java.util.ArrayList;

public class CircumferenceAndCircleArea {
    public static ArrayList<Double> circumferenceAndCircleArea(int radius){
        ArrayList<Double> cirAndAr= new ArrayList<>();
        cirAndAr.add(2*Math.PI*radius);
        cirAndAr.add(Math.PI*radius*radius);
        return cirAndAr;
    }
}
