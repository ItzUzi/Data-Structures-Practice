public class BagArray<T> implements BagInterface<T> {

    private T[] bag;
    private int numberOfEntries;
    private final int DEFAULT_CAPACITY = 25;

    public BagArray(int capacity){
        this.numberOfEntries = 0;
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[capacity];
        bag = tempBag;
    }

    public BagArray(){
        this.numberOfEntries = 0;
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[DEFAULT_CAPACITY];
        bag = tempBag;
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        if(bag.length == 0)
            return true;

        for (T t : bag) {
            if(t != null)
                return false;
        }
        return true;
    }

    public boolean add(T newEntry) {
        boolean result = true;
        if(isArrayFull()){
            result = false;
        }else{
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    public T remove() {

        if (isEmpty()) {
            return null;
        }else{
            numberOfEntries--;
            T temp = bag[numberOfEntries];
            bag[numberOfEntries] = null;
            return temp;
        }
    }

    public boolean remove(T anEntry) {
        return false;
    }

    public void clear() {
        
    }

    public boolean getFrequencyOf(T anEntry) {
        return false;
    }

    public boolean contains(T anEntry) {
        return false;
    }

    public T[] toArray() {
        return null;
    }

    private boolean isArrayFull(){
        return false;
    }
    
}
