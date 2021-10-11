package logic;

import entity.Ball;
import entity.Basket;
import entity.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLogic implements AppFunctions{
    private Basket basket = new Basket();
    private Scanner scanner = new Scanner(System.in);

    private void showBasketBalls(){
        ArrayList <Ball> balls = basket.getBalls();
        System.out.println("All balls in basket");
        for (int i = 0; i<balls.size();i++){
            System.out.println(balls.get(i).toString());
        }
    }

    @Override
    public void addBall() {
        Ball ball = new Ball();
        if ( !(ball.getWeight()==0.0)&&!(ball.getColor()==null))
        basket.getBalls().add(ball);
    }

    @Override
    public void removeBall() {
        ArrayList <Ball> balls = basket.getBalls();
        System.out.println("All balls in basket");
        int countOfBalls=0;
        for (int i = 0; i<balls.size();i++){
            System.out.println(balls.get(i).toString());
            countOfBalls++;
        }
        System.out.println("Enter number of ball you want to delete");
        int number = scanner.nextInt();
        if ((number<0)||(number>countOfBalls)){
            System.out.println("No such ball in basket");
        }
        else {
            balls.remove(number);
            basket.setBalls(balls);
        }
    }

    @Override
    public void searchForBall() {
        ArrayList<Ball> ballsForSearch = new ArrayList<>();
        ArrayList<Ball> balls = basket.getBalls();
        showBasketBalls();
        System.out.println("Input weight value of ball you search for with ,");
        double weight = scanner.nextDouble();
        for (int i = 0; i<balls.size();i++){
            if (balls.get(i).getWeight()==weight)
                ballsForSearch.add(balls.get(i));
        }
        if (ballsForSearch.size()==0){
            System.out.println("There are no such balls in basket");
        }
        else {
            for (int i = 0; i<ballsForSearch.size();i++){
                System.out.println(ballsForSearch.get(i).toString());
            }
        }
    }

    @Override
    public void showAllBalls() {
        showBasketBalls();
    }

    @Override
    public void weightOfAllBalls() {
        ArrayList <Ball> balls = basket.getBalls();
        showBasketBalls();
        double sum = 0;
        for (int i = 0; i<balls.size();i++){
            sum+=balls.get(i).getWeight();
        }
        System.out.println("Weight of all balls in basket is "+sum);
    }

    @Override
    public void countOfColoredBalls() {
        ArrayList<Ball> balls = basket.getBalls();
        System.out.println("Choose color of balls you want to count");
        System.out.println("1-BLUE");
        System.out.println("2-RED");
        System.out.println("3-BLACK");
        int count = 0;
        int menu = new Scanner(System.in).nextInt();
        switch (menu) {
            case (1): {
                for (int i = 0; i < balls.size(); i++) {
                    if (balls.get(i).getColor() == Colors.BLUE)
                        count++;
                }
                System.out.println("Count of blue balls is " + count);
                break;
            }
            case (2): {
                for (int i = 0; i < balls.size(); i++) {
                    if (balls.get(i).getColor() == Colors.RED)
                        count++;
                }
                System.out.println("Count of red balls is " + count);
                break;
            }
            case (3): {
                for (int i = 0; i < balls.size(); i++) {
                    if (balls.get(i).getColor() == Colors.BLACK)
                        count++;
                }
                System.out.println("Count of black balls is " + count);
                break;
            }
            default: {
                System.out.println("Incorrect menu input");
                break;
            }
        }
    }
}
