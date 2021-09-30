package logic;

import entity.Point;

public class NearestToOPoint {

    public static Point nearestToOPoint(Point point1, Point point2){
        double pointDistance1 = Math.sqrt(point1.geTXCoordinate()*point1.geTXCoordinate()
        + point1.geTYCoordinate()*point1.geTYCoordinate());
        double pointDistance2 = Math.sqrt(point2.geTXCoordinate()*point2.geTXCoordinate()
                + point2.geTYCoordinate()*point2.geTYCoordinate());
        if (pointDistance1 >= pointDistance2)
            return point1;
        else
            return point2;
    }
}
