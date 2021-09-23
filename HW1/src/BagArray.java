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

        checkIntegrity();
        T result = removeEntry(numberOfEntries-1);
        return result;
    }

    public boolean remove(T anEntry) {
        checkIntegrity();
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    private int getIndexOf(T anEntry){
        for (int i = 0; i < bag.length; i++) {
            if (anEntry.equals(bag[i])) {
                return i;
            }
        }
        return -1;
    }

    private T removeEntry(int givenIndex){
        T result = null;

        if (!isEmpty() && givenIndex >= 0) {
        result = bag[givenIndex];
        numberOfEntries--;
        bag[givenIndex] = bag[numberOfEntries];
        bag[numberOfEntries] = null;
        }
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

    @Override
    public T[] union(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T[] intersection(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public T[] difference(BagInterface<T> bag) {
        // TODO Auto-generated method stub
        return null;
    }
}
