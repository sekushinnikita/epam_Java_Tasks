package runner;

import logic.AppLogic;

import java.util.Scanner;

public class Application {

    public static void main(String[] args)throws NullPointerException{
        AppLogic appLogic = new AppLogic();
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input operation code");
            System.out.println("1-add ball");
            System.out.println("2-count of your color balls");
            System.out.println("3-remove ball");
            System.out.println("4-search for ball");
            System.out.println("5-weight of all balls");
            System.out.println("6-show all balls");
            System.out.println("7-exit");
            menu = scanner.nextInt();
            switch (menu) {
                case (1): {
                    appLogic.addBall();
                    break;
                }
                case (2): {
                    appLogic.countOfColoredBalls();
                    break;
                }
                case (3): {
                    appLogic.removeBall();
                    break;
                }
                case (4): {
                    appLogic.searchForBall();
                    break;
                }
                case (5): {
                    appLogic.weightOfAllBalls();
                    break;
                }
                case (6): {
                    appLogic.showAllBalls();
                    break;
                }
                case (7): {
                    break;
                }
                default:{
                    System.out.println("Incorrect menu input. Try again");
                    break;
                }
            }
        } while (menu!=7);
    }
}
