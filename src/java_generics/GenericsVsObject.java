package java_generics;

public interface GenericsVsObject {

    static void demo() {
        //primitivesOverloadingTest();
        //objectBasedTest();
        primitivesOverloadingTest();
    }

    static void primitivesOverloadingTest() {
        int i = (int)getterObject(15); //runtime success
    }

    static void objectBasedTest() {
        int i = getter(10);

        /* runtime error because of unsafe type casting*/
        boolean b = (boolean)getterObject(15);
    }

    static void genericsBasedTest() {
        int i = getterGenerics(10); //ok
        //boolean b = getterGenerics(15); //compile error
    }

    //primitive methods overloading
    static int getter(int value) {
        return value + 10;
    }

    static boolean getter(boolean value) {
        return !value;
    }

    //Object class based method
    static Object getterObject(Object value) {
        return value;
    }

    //Generics
    static <T> T getterGenerics(T value) {
        return value;
    }
}
