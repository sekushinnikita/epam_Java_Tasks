package logic;

public class CountOfDays {

    private static boolean isYearLeap(int year){
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    return true;
                }
                else return false;
            }
            else return true;
        }
        else return false;
    }

    public static int countOfDays(int year, int month){
       if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
           return 31;
       else if (month==4 || month==6 || month==9 || month==11)
           return 30;
       else if (month==2){
           if (isYearLeap(year)== true )
               return 29;
           else
               return 28;
       }
       else  return 0;
    }

}
