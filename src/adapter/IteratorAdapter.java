package adapter;

import java.util.*;

/**
 * Created by Alex on 16/9/14 下午12:04.
 */
public class IteratorAdapter implements java.util.Iterator {
    Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override public Object next() {
        return enumeration.nextElement();
    }

    @Override public void remove() {
        throw new UnsupportedOperationException();
    }
}
