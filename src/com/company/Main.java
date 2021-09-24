package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("please enter your name");
    String empname = input.next();
    System.out.println("please enter the total number of hours that you have worked this week");
    double hrworked = input.nextDouble();
    System.out.println("please enter your hourly wage");
    double hourlywage = input.nextDouble();
    int paymenthournormal = (int) (hrworked * hourlywage);

    if (hrworked > 45){
        hrworked = hrworked - 45;
        hrworked = (int) (hourlywage + 1.5) * hrworked;
        paymenthournormal = (int) (hrworked + paymenthournormal);


    }
    }
}
