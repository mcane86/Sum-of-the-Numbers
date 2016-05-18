package com.michaelcane;

import java.util.Scanner;

public class SumOfNumbers {

    Scanner input = new Scanner(System.in);

    public int promptUserForInt(String msg) {
        promptUser(msg);
        return input.nextInt();
    }

    public String promptUser(String msg) {
        return msg;
    }

    public int doSums() {
        int userNumber = promptUserForInt("Please give me a number between 1 and 100.");
        int firstNumber = 1;
        int newTotal =0;
        while(firstNumber <= userNumber) {
            newTotal += firstNumber;
            firstNumber++;
        }
        return newTotal;
    }
}
