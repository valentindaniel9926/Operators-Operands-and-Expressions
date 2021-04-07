package com.company;

public class Main {

    public static void main(String[] args) {
	int result = 1+2;
	int previousResult =result;
        System.out.println("The value of 1+2 is : "  + result);
        result =result-1;
        System.out.println("3-1:  " + result);
        System.out.println("previousResult = " + previousResult);

        result = result*10;
        System.out.println("The new value of result is 2 *10 "  + result);

        result = result/5;
        System.out.println("20/5= " + result);
        result =result %3;
        System.out.println("4%3 = "  + result);
        result++;
        System.out.println("1+1= " + result);

        result--;
        System.out.println("2-1 = "  + result);
        result+= 2;
        System.out.println("2+3 = " + result);
        result *=10;
        System.out.println("3*10 = " + result);

        result /=3;
        System.out.println("30/3 = " + result);

        result-=4;
        System.out.println("10-4=  " + result);

        boolean isAlien = false;
        if(isAlien ==true){
            System.out.println("It is not an alien!");
    }
        int topScore=80;
        if(topScore <100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore<100){
            System.out.println("GREATER THAN SECOND TOP SCORE AND LESS THAN 100");
        }

        int newValue= 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = isCar? true:false;
        if(wasCar){
            System.out.println("WASCar is true");
        }
}
}