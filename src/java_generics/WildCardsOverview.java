package java_generics;

public interface WildCardsOverview {

    static void demo() {
        //objectBoundingProblem();
        //unboundedWildCard();
        wildcardCaptureTest();
    }

    static void wildcardCaptureTest() {
        BasketGenerics<String> basket = new BasketGenerics<>(
                "Hello", "Hola", "Hey"
        );
        System.out.println(basket);
        unboundedWildcardSource(basket, 0, 1);
        System.out.println(basket);
    }

    static void unboundedWildCard() {
        BasketGenerics<Object> basket = new BasketGenerics<>(10);
        unboundedWildcardPrinter(basket);
        BasketGenerics<String> basket2 = new BasketGenerics<>("10");
        unboundedWildcardPrinter(basket2);
    }

    static void objectBoundingProblem() {
        BasketGenerics<Object> basket = new BasketGenerics<>(10);
        objectBoundedPrinter(basket);
        BasketGenerics<String> basket2 = new BasketGenerics<>("10");
        //objectBoundedPrinter(basket2); //compile error
    }

    static void objectBoundedPrinter(BasketGenerics<Object> value) {
        System.out.println(value);
    }

    static void unboundedWildcardPrinter(BasketGenerics<?> value) {
        System.out.println(value.hashCode());
    }

    static void upperBoundedWildcardTest(BasketGenerics<? extends Number> value) {
        //value.setStaff(10); //compile error
        Number number = value.get(0);
        System.out.println(value.get(0));
    }

    static void lowerBoundedWildcardTest(BasketGenerics<? super Number> value) {
        value.set(0, 10);
        //Number number = value.getStaff(); //compile error
        System.out.println(value.get(0));
    }

    static <T extends Number> void genericsAleternativeToWildcartdTest(BasketGenerics<T> value, T newValue) {
        value.set(0, newValue);
        T temp = value.get(0);
        System.out.println(value.get(0));
    }

    //WildCards capture
    static void unboundedWildcardSource(BasketGenerics<?> value, int from, int to) {
        //value.set(to, (?)new Object()); //compile error
        //value.set(to, value.get(from)); //compile error
        captureSwapper(value, from, to);
    }

    static <T> void captureSwapper(BasketGenerics<T> value, int from, int to) {
        T copy = value.get(to);
        value.set(to, value.get(from));
        value.set(from, copy);
    }
}
