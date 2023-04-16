package org.example.javathecompletereference.methodsandclasses.argumentpassing;

// Objects are passed through their references.
public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }

    // As you can see, in this case, the actions inside meth( ) have affected the object used as an
    //argument
}
