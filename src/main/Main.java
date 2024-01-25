package main;
import week2.Week2;

public class Main {
    public static void main(String[] blah) {
//        System.out.println("Hello World!");
        week2Exercise();
    }

    public static void week2Exercise() {
        Week2 myWeek2 = new Week2();
        System.out.println("\nInstance Of Operator Exercise\n");
        myWeek2.instanceOfOperator();
        System.out.println("\nConditional Operator Exercise 1\n");
        myWeek2.conditionalOperator1();
        System.out.println("\nConditional Operator Exercise 2\n");
        myWeek2.conditionalOperator2();
    }
}