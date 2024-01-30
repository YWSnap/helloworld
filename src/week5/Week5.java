package week5;

//Class
public class Week5 {

    //Instance Variables
    private int a;
    private String name;
    private boolean status;
    private double width;
    private float rate;

    // Default Constructor
    public Week5(){
        super();
        System.out.println("\nConstructor Called");
    }


    //Method1
    public void method1() {

    }

    //Method2
    public void method2() {
        AnotherClass anotherClassObject = new AnotherClass();
        ThirdClass thirdClassObject = new ThirdClass();
        anotherClassObject.anotherClassMethod();
        thirdClassObject.thirdClassMethod();
    }
}

//Another Class
class AnotherClass {
    public void anotherClassMethod() {
        System.out.println("\nHello from Another Class's method!\n");
    }
}

//Third Class
class ThirdClass extends AnotherClass implements AnInterface{
    public void thirdClassMethod() {
        System.out.println("\nHello from Third Class's Method!\n");
    }
}

//Interface
interface AnInterface {
}
