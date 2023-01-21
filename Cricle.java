package CricleCalculate;

import java.util.Scanner;

public class Cricle {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius");
        r = scanner.nextDouble();
        double area = pi *r *r;

        System.out.println("Area of Circle = "+ area);

    }

}
