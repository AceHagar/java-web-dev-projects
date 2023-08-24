package org.launchcode;

import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        Double length = input.nextDouble();
        System.out.println("What is the width of the rectangle? ");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }

}
