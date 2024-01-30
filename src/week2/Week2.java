package week2;

//This is a class. It is a Blueprint for creating objects.
public class Week2 {

    //   These are Instance Variables. They hold the state of an object(i.e. fields, variables, attributes, properties).
        private String name;
        private String email;
        private String phoneNumber;

    //    This is a constructor. It constructs the state(i.e. field, variables, attributes, properties) of the object.
    //
    //    If we don't have a constructor written,
    //    a default constructor (A default Constructor is invisible.) will be created in the background by Java.
    //    The default constructor will be created with default values for variables.
    //    such as null values for strings, 0 values for int, float, double..., false for boolean, etc.
    //
    //    Each time an object is created using a new() keyword, at least one constructor
    //    (it could be the default constructor) is invoked to assign initial values
    //
    //
    //    Rules for writing constructors are as follows:
    //
    //    The constructor(s) of a class must have the same name as the class name in which it resides.
    //    A constructor in Java can not be abstract, final, static, or Synchronized.
    //    Access modifiers can be used in constructor declaration to control its access
    //    i.e. which other class can call the constructor.
    //
    //    Like methods, a constructor also contains a collection of statements(i.e. instructions)
    //    that are executed at the time of Object creation.

    //    primarily there are three types of constructors in Java are mentioned below:
    //
    //    Default Constructor
    //    Parameterized Constructor
    //    Copy Constructor
    //
    //    1. Default Constructor
    //    A constructor that has no parameters is known as default the constructor.
    //    A default constructor is invisible. And if we write a constructor with no arguments,
    //    the compiler does not create a default constructor. It is taken out.
    //    It is being overloaded and called a parameterized constructor.
    //    The default constructor changed into the parameterized constructor.
    //    But Parameterized constructor can’t change the default constructor.
    //    Example:
    //    GFG() { System.out.println("Default constructor"); }
    //
    //    2. Parameterized Constructor in Java
    //    A constructor that has parameters is known as parameterized constructor.
    //    If we want to initialize fields of the class with our own values, then use a parameterized constructor.
    //    Example:
    //    Geek(String name, int id)
    //    {
    //        this.name = name;
    //        this.id = id;
    //    }
    //
    //    Geek geek1 = new Geek("Bob", 45); //this invokes the above parameterized constructor
    //
    //    3. Copy Constructor in Java
    //
    //    Geek(Geek obj2)
    //    {
    //        this.name = obj2.name;
    //        this.id = obj2.id;
    //    }
    //
    //    System.out.println("GeekName :" + geek2.name + " and GeekId :" + geek2.id); // invokes the copy constructor
    public Week2()
    {
        super();
        System.out.println("\nConstructor Called");
    }

    // This is a method. It sets the behavior of the object that gets created.
    public void instanceOfOperator() {
        Parent object1 = new Parent();
        Child object2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (object1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (object1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (object1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (object2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (object2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (object2 instanceof MyInterface));
    }

    // This is a method. It sets the behavior of the object that gets created.
    public void conditionalOperator1() {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }

    // This is a method. It sets the behavior of the object that gets created.
    public void conditionalOperator2() {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}

//This is a class. It is a Blueprint for creating objects.
class Parent {}

//This is a class. It is a Blueprint for creating objects.
class Child extends Parent implements MyInterface {}

//This is an Interface.
interface MyInterface {}
