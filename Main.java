package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find out my number");
    int number = (int)(Math.random()*100);

    while(true){
        System.out.println("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        int put_number = scanner.nextInt();
        if (put_number == number){
            System.out.println("You correctly entered number");
            break;
        } else if ( put_number < number){
            System.out.println("Your number is less than my number");
        } else System.out.println("Your number is too big");
    }
    }
}
