package java_generics;

import java.util.Arrays;

public class BasketGenerics<E> {

    private Object[] staff;

    {
        staff = new Object[0];
    }

    public E get(int index) {
        return (E)staff[index];
    }

    public void set(int index, E newValue) {
        this.staff[index] = newValue;
    }

    public BasketGenerics(E... newElements) {
        staff = Arrays.copyOf(staff, staff.length + newElements.length);
        for(int i = staff.length - newElements.length, j = 0; i < staff.length; ++i, ++j)
            staff[i] = newElements[j];
    }

    public void add(E... newElements) {
        staff = Arrays.copyOf(staff, staff.length + newElements.length);
        for(int i = staff.length - newElements.length, j = 0; i < staff.length; ++i, ++j)
            staff[i] = newElements[j];
    }

    @Override
    public String toString() {
        return Arrays.toString(staff);
    }
}
