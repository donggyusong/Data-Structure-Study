package datastructure.arralist;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object object) {
        elementData[size] = object; //O(1)
        size++;
    }

    public Object get(int index) {
        return elementData[index]; //O(1)
    }

    public Object set(int index, Object element) {
        Object oldValue = elementData[index]; //O(1)
        elementData[index] = element; //O(1)

        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) { // O(n)
            if (o.equals(elementData[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }
}
