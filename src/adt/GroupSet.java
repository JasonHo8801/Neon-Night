/*
author : Jason
date   : 8/8/2021
 */
package adt;

import java.util.*;

public class GroupSet<T> implements SetInterface<T> {
    
    T[] setArray;
    int numberOfElements;
    private static final int DEFAULT_INITIAL_CAPACITY = 25;
    
    // constructor
    public GroupSet(int initialCapacity) {
        setArray = (T []) new Object[initialCapacity];
        numberOfElements = 0;
    }
    
    public GroupSet() {
        this(DEFAULT_INITIAL_CAPACITY);
    }
    
    // implmentation of abstract methods    
    public boolean add(T newElement) {             // add new element into the set
        if (isSetFull()) {
            enlargeSet();
        }
            
        int i = 0;
        while (i < setArray.length) {
            if (setArray[i] == newElement) {
                return false;
            }
            if (setArray[i] != null)
                i++;
            else {
                setArray[i] = newElement;
                return true;
            }
        }
        return false;
    }
    
//    boolean addIn(T element, Collection<?> c) {
//    
//    }
//    
//    boolean addAll(Collection<?> c) {
//    
//    }
    
    public void clear() {                           // clear all elements in the set
        int originalCapacity = setArray.length;
        T[] setArray = (T[]) new Object[originalCapacity];
    }
    
//    boolean contains(Object o);
//    boolean containsAll(Collection<?> c);
//    boolean remove(T anElement);
//    boolean removeAll(Collection<?> c);
//    boolean isEmpty();
    
    // implementation of utility methods
    private boolean isSetFull() {
        return numberOfElements == setArray.length;
    }
    
    private void enlargeSet() {    
        T[] newSet = (T[]) new Object[setArray.length * 2];       
        for (int i = 0 ; i < setArray.length ; i++) {
            newSet[i] = setArray[i];
        }
        setArray = newSet;
    }
    
}
