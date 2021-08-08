/*
author : Jason
date   : 8/8/2021
*/
package adt;

import java.util.*;

public interface SetInterface<T>{
    boolean add(T newElement);
//    boolean addIn(T element, Collection<?> c);
//    boolean addAll(Collection<?> c);
    void clear();
//    boolean contains(Object o);
//    boolean containsAll(Collection<?> c);
//    boolean remove(T anElement);
//    boolean removeAll(Collection<?> c);
//    boolean isEmpty();
    
    //boolean checkSubset(SetInterface anotherSet);
    //void union(SetInterface anotherSet);
    //SetInterface intersection(SetInterface anotherSet);
}
