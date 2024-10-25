package datastructure.list;

import java.util.Arrays;

/**
 * <제네릭 명명 관례>
 * E - Element
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 */

public class ArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public ArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E)elementData[index]; //O(1)
    }

    @Override
    public E set(int index, Object element) {
        E oldValue = get(index);
        elementData[index] = element; //O(1)

        return oldValue;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        System.out.println("elementData1 = " + Arrays.toString(elementData));
        elementData[size] = null;
        System.out.println("elementData2 = " + Arrays.toString(elementData));
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) { // O(n)
            if (o.equals(elementData[i])) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }


}
