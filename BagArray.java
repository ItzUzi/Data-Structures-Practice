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
        for (T t : bag) {
            if(t == null)
                return true;
        }
        return false;
    }

    public boolean add(T newEntry) {
        return false;
    }

    public T remove() {
        return null;
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
    
}
