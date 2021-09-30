package runner;

import service.FirstTaskFunctions;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        FirstTaskFunctions firstTaskFunctions = new FirstTaskFunctions();
        System.out.println("Input numbers from 1 to 10 to check parts of Task_1");
        int menu = new Scanner(System.in).nextInt();
        switch (menu) {
            case (1): {
                firstTaskFunctions.firstTaskResults();
                break;
            }
            case (2): {
                firstTaskFunctions.secondTaskResults();
                break;
            }
            case (3): {
                firstTaskFunctions.thirdTaskResults();
                break;
            }
            case (4): {
                firstTaskFunctions.fourthTaskResults();
                break;
            }
            case (5): {
                firstTaskFunctions.fifthTaskResults();
                break;
            }
            case (6): {
                firstTaskFunctions.sixthTaskResults();
                break;
            }
            case (7): {
                firstTaskFunctions.seventhTaskResults();
                break;
            }
            case (8): {
                firstTaskFunctions.eighthTaskResults();
                break;
            }
            case (9): {
                firstTaskFunctions.ninthTaskResults();
                break;
            }
            case (10): {
                firstTaskFunctions.tenthTaskResults();
                break;
            }
            default:
                System.out.println("Incorrect menu input.");
            }
    }
}
