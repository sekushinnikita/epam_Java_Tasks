package logic;
import java.util.ArrayList;

public class SquareOfInscribedBox {

    public static ArrayList<Double> squareOfInscribedBox(int describedSquare){
        double hypotenuse = Math.sqrt(describedSquare);
        Double square1 = hypotenuse*hypotenuse;
        Double square2 = (hypotenuse/Math.sqrt(2))*(hypotenuse/Math.sqrt(2));
        ArrayList <Double> squareAndDifference = new ArrayList<>();
        squareAndDifference.add(square2);
        squareAndDifference.add(square1/square2);
        return squareAndDifference;
    }
}
