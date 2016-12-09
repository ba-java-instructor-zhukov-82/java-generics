package java_generics;

public interface BsketsTest {

    static void demo() {
        //objectBasedBasketTest();
        genericsBasedBasketTest();
    }

    static void objectBasedBasketTest() {
        BasketObjects basket = new BasketObjects(3.14);
        final float PI = (float)basket.getStaff();
    }

    static void genericsBasedBasketTest() {
        BasketGenerics<Float> basket = new BasketGenerics<>(3.14f);
        final float PI = basket.get(0); //ok
        //final byte value = basket.getStaff(); //compile error
    }
}
