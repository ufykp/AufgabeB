/**
 *String is a class, not a basic data type, so it should start with an uppercase letter
 *After declaring a variable as int, it needs to be added ';'
 * Void is a return type that indicates that the method will not return any values.
 * und there is no need for the void keyword here
 *A class needs to be modified with "accessible modifier" to indicate whether it can be accessed by other classes.
 * if we want other classes to use this Person class,
 * then we need to declare this class as public so that other classes can reference it.
 */
class Person {
    String name;
    int age;
    int height;

    public Person(String name ,int age ,int height){
        //A variable must have its type defined before use,
        //which must be a basic type or a reference type.Because age is an integer, we use int to modify age

        this.name = name;//If a local variable with the same name as a member variable is used,
        // then the 'this' keyword needs to be used to distinguish between member variables and local variables

        this.age = age;
        this.height = height;
    }//The curly braces should appear in pairs
}
