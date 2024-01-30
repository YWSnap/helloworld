package main;
import week2.Week2;
import week5.Week5;

public class Main {
    public static void main(String[] blah) {
//        System.out.println("Hello World!");
//        week2Exercise();
        week5Exercise();
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

    public static void week5Exercise() {
        System.out.println("\nWeek 5 Exercise 2\n");
        Week5 myweek5 = new Week5();
        myweek5.method2();
    }
}