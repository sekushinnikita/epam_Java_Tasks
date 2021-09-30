package logic;

public class LastNumCount {

    public static int lastNumberCount(int number){//для int
        return ((number%10)*(number%10))%10;
    }
}
