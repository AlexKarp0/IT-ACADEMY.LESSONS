package by.academy.homework5;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator {
    private  T[][] array;
    private int rowIndex;
    private int colIndex;

    public CustomIterator() {
        super();
    }

    public CustomIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array == null || (array[rowIndex].length <= colIndex)) {
            return false;
        }

        return array[rowIndex] [colIndex]!= null;
    }


    @Override
    public T next() {
        T retValue = array[rowIndex][colIndex];
        if (colIndex + 1 == array[0].length){
            rowIndex++;
            colIndex = 0;

        } else  colIndex++;
        return retValue;
    }
}
