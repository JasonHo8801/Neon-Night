package adt;

/**
 *
 * Author: Ju Wen
 */
public class ArrayList<T> implements ListInterface<T> {
    T[] list;
    int capacity;
    int entryIndex = 0;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int setCapacity) {
        capacity = setCapacity;
        list = (T[]) new Object[setCapacity];
    }

    @Override
    public boolean addEntry(T entry) {
        if(isListFull()){
            expandCapacity();
        }
           
        list[entryIndex] = entry;
        entryIndex++;
        System.out.println("Entry " + entry + " is successfully added.");
        return true;
    
    }

    @Override
    public boolean addEntry(int position, T entry) {
        if(isListFull()){
            expandCapacity();
        }
        
        if(position >= 1 && position <= entryIndex + 1){
            createSpace(position);
            list[position - 1] = entry;
            System.out.println("Entry " + entry + " is successfully added to position " + position);
            entryIndex++;
            return true;
        }
        else{
            System.out.println("Invalid position. The entry is not successfully added");
            return false;
        }    
    }

    @Override
    public T retrieve(int position) {
        T result = null;
        
        if(position <= capacity){
            return list[position - 1];
        }
        else{
            return result;
        }
    }

    @Override
    public boolean removeEntry(int position) {
        if(!isListEmpty()){
            if(position >= 1 && position <= entryIndex){
                System.out.println(list[position - 1] + " is deleted");
                deleteSpace(position);
                entryIndex--;
                return true;
            }
            else{
                System.out.println("Invalid position. Nothing is deleted");
                return false;
            }
        }
        else{
            System.out.println("The list is empty. Cannot remove anything"); 
            return false;
        }
    }

    @Override
    public boolean switchEntry(int firstPosition, int secondPosition) {
        if(isListEmpty()){
            System.out.println("The list is empty, switch cannot be performed.");
            return false;
        }
        else if(entryIndex == 1){
            System.out.println("There is only one entry in the list, switch cannot be performed.");
            return false;
        }
        else if(firstPosition == secondPosition){
            System.out.println("The positions given cannot be the same, switch cannot be performed.");
            return false;
        }
        else if(firstPosition >= 1 && firstPosition <= entryIndex && secondPosition >= 1 && secondPosition <= entryIndex){
            T holdEntry = list[firstPosition - 1];
        
            list[firstPosition - 1] = list[secondPosition - 1];
            list[secondPosition - 1] = holdEntry;

            System.out.println("Entries are successfully switched");
            return true;
        }
        else{
            System.out.println("Invalid position given, switch cannot be performed.");
            return false;
        }
      
    }

    @Override
    public boolean isListFull() {
        return entryIndex == capacity;
    }
    
    @Override
    public boolean isListEmpty() {
        return entryIndex == 0;
    }

    @Override
    public void clearList() {
        for (int i = 0; i < capacity; i++) {
            list[i] = null;
        }
        entryIndex = 0;
        System.out.println("The list is cleared");
    }

    @Override
    public void printList() {
        for (int i = 0; i < capacity; i++) {
            if(list[i] == null){
                System.out.println((i + 1) + ". ");
            }
            else{
                System.out.println((i + 1) + ". " + list[i]);
            }        
        }
    } 
    
    private void createSpace(int shiftedPosition){
        for (int i = entryIndex; i > shiftedPosition - 1; i--) {
            list[i] = list[i - 1];
        }
    }
    
    private void deleteSpace(int removedPosition){
        for (int i = removedPosition - 1; i < entryIndex - 1; i++) {
            list[i] = list[i + 1];
        }
        for (int i = entryIndex - 1; i < capacity; i++) {
            list[i] = null;
        }
    }
    
    private void expandCapacity(){   //add 5 more capacity for the list 
       
        T[] newList = (T[]) new Object[capacity + 5];
        
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        } 
        list = newList;
        capacity += 5;
    }    
}
