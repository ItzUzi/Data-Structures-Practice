public class BagArray<T> implements BagInterface<T> {

    private T[] bag;
    private int numberOfEntries;
    private final static int DEFAULT_CAPACITY = 25;
    private boolean integrityOk = false;
    private final static int MAX_CAPACITY = 10000;

    public BagArray(int capacity){
        this.numberOfEntries = 0;
        if (capacity <= MAX_CAPACITY) {
            integrityOk = true;
            @SuppressWarnings("unchecked")
            T[] tempBag = (T[])new Object[capacity];
            bag = tempBag;
        }else
            throw new IllegalStateException("Attempt to create a bag" + 
                    " whose capacity exceeds allowed maximum.");
    }
    public BagArray(){
        this(DEFAULT_CAPACITY);
    }

    private void checkIntegrity(){
        if(!integrityOk)
            throw new SecurityException("Integrity is not ok");
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
        checkIntegrity();
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

        if (!isEmpty()) {
            numberOfEntries--;
            T temp = bag[numberOfEntries];
            bag[numberOfEntries] = null;
            return temp;
        }

        return null;
    }

    public boolean remove(T anEntry) {
       if (isEmpty()) {
           return false;
       }
        for (int i = 0; i < bag.length; i++) {
            if (anEntry.equals(bag[i])) {
                removeEntry(i);
                return true;
            }
        }
        return false;
    }

    private T removeEntry(int givenIndex){
        T result = null;
        result = bag[givenIndex];
        numberOfEntries--;
        bag[givenIndex] = bag[numberOfEntries];
        bag[numberOfEntries] = null;
        return result;
    }

    public void clear() {
        while(!isEmpty())
            remove();
    }

    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        if (isEmpty()) {
            return counter;
        }
        for (T t : bag) {
            if (anEntry.equals(t))
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
            if (anEntry.equals(t)) {
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
        if (numberOfEntries == bag.length) {
            return true;
        }
        return false;
    }
}
