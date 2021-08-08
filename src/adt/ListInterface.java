package adt;

/**
 *
 * @author User
 */
public interface ListInterface<T> {
    public boolean addEntry(T entry);
    
    public boolean addEntry(int position, T entry);
    
    public T retrieve(int position);
    
    public boolean removeEntry(int position);
    
    public boolean switchEntry(int firstPosition, int secondPosition);
    
    public boolean isListFull();
    
    public boolean isListEmpty();
    
    public void clearList();
    
    public void printList();
}
