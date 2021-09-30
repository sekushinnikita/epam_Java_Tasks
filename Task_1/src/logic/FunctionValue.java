package logic;

public class FunctionValue {

    public static int functionValue(int x){
        if (((x*x*x)-6)==0)
            return 0;
        if (x>=3)
            return -(x*x)+3*x+9;
        else
            return 1/((x*x*x)-6);
    }
}
