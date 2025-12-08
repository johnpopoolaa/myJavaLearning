// some new java features

// creating a sealed class to choose the classes that can extend it
sealed class Alien permits A,B {

}
// the classes must either be sealed, non-sealed, or final
non-sealed class A extends Alien {

}

non-sealed class B extends Alien{

}

// the record class already creates most of the primary constructors and you can access them directly without specifying again
record C(int sn, String name) {

}

public class newFeats {
    public static void main(String a[])
    {
        // Local Variable Type Inference
        var num = 1; // you can use 'var' to declare a variable and the type would be assigned to the variable at compile-time
        String var = "thisVar"; // var can also be used as a variable name
        var nums = new int[10]; // also works with arrays
        var obj = new Alien(); // it can be used to create an object of a class too
        System.out.println(num + " " + var);

        C obj1 = new C(14, "John");
        System.out.println(obj1);
    }
}
