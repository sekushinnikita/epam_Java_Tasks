package util;

import entity.Colors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BallValuesInput {

    Scanner scanner = new Scanner(System.in);

    public double inputWeight(){
        try{
            System.out.println("Input weight value using ,");
            double weight = scanner.nextDouble();
            if(!isWeightCorrect(weight)) {
                System.out.println("Your weight value <= 0 or");
                throw new InputMismatchException();
            }
            return weight;
        }
        catch (InputMismatchException e){
            System.out.println("Only numbers in weight value");
            return 0.0;
        }
    }

    private boolean isWeightCorrect(double weight){
        return weight >= 0;
    }

    public Colors inputColor(){
        try{
            System.out.println("Input color value");
            String color = scanner.next();
            color = color.toUpperCase();
            if (!(color.chars().allMatch(Character::isLetter)))
                throw new InputMismatchException();
            if (!isColorCorrect(color)) {
                System.out.println("Your color is not at list of colors or");
                throw new InputMismatchException();
            }
            return Colors.valueOf(color);
        }catch(InputMismatchException e){
            System.out.println("Color value can't have any numbers");
            return null;
        }
    }

    private boolean isColorCorrect(String color){
        try {
            Enum.valueOf(Colors.class, color);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
