public class BagArray<T> implements BagInterface<T> {

    private T[] bag;
    private int numberOfEntries;
    private final static int DEFAULT_CAPACITY = 25;

    public BagArray(int capacity){
        this.numberOfEntries = 0;
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[capacity];
        bag = tempBag;
    }

    public BagArray(){
        this(DEFAULT_CAPACITY);
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
       if (isEmpty()) {
           return false;
       }

        for (int i = 0; i < bag.length; i++) {
            if (anEntry == bag[i]) {
                bag[i] = null;
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
       for (int i = 0; i < bag.length; i++) {
           bag[i] = null;
       }
    }

    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        if (isEmpty()) {
            return counter;
        }
        for (T t : bag) {
            if (t == anEntry)
                counter++;
        }
        return counter;
    }

    public boolean contains(T anEntry) {
        boolean result = false;
        
        if (isEmpty()) {
            return result;
        }

        for (T t : bag) {
            if (t == anEntry) {
                result = true;
            }
        }

        return result;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries];

        for (int i = 0; i < result.length; i++) {
            result[i] = bag[i];
        }

        return result;
    }

    private boolean isArrayFull(){
        if (numberOfEntries == bag.length - 1) {
            return true;
        }
        return false;
    }
}
