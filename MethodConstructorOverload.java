//constructor overloading 
//method overloading

/**
 * casio
 */
public class MethodConstructorOverload {

    public static void main(String[] args) {
        cas obj = new cas(1.0, 2.0);
        // System.out.println(obj.i + obj.j);
        obj.cal(2.0);

    }

}

class cas {

    double i, j, result;

    public cas() { // constructor - no return type + same name as defined class
        System.out.println("no values were accepted into constructor");
        i = 1;
        j = 2;

    }

    public cas(int a, int b) { // constructor overloading
        System.out.println("integer values were accepted into constructor");
        i = a;
        j = b;
    }

    public cas(double a, double b) {
        System.out.println("double values were accepted into constructor");
        i = a + 1;
        j = b + 2;
    }

    public void cal() { // first method return type
        System.out.println("");
        System.out.println("no values accepted into method so well just print a message");

    }

    public void cal(int a) {
        System.out.println("");
        System.out.println("integer values were accepted into method hence add * multiplier");

        result = (i + j) * a;

        System.out.println(result);
    }

    public void cal(double a) {
        System.out.println("");
        System.out.println("double values were accepted into method hence add / a ");

        result = (i + j) / a;

        System.out.println("result : " + result);
    }

}
