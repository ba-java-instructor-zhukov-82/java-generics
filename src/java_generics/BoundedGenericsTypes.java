package java_generics;

public interface BoundedGenericsTypes {

    static void demo() {

        boundedGenericTypeTest();
    }

    static void boundedGenericTypeTest() {
        printBoundedNumber(10);
        printBoundedNumber(10L);
        printBoundedNumber(10.1f);
        printBoundedNumber(10.1);
        //printBoundedNumber("10"); //compile error
    }

    static <N extends Number> void printBoundedNumber(N number) {
        System.out.println(number);
    }
}
