public class Stack<T> {
    
    private T[] stack;
    private final static int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    Stack(){
        this(DEFAULT_CAPACITY); 
    }

    Stack(int capacity){
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[capacity];
        stack = temp;
        numberOfEntries = 0;
    }

    public T pop(){
        if (isEmpty()) {
            return null;
        }

        numberOfEntries--;
        T results = stack[numberOfEntries];
        stack[numberOfEntries] = null;

        return results;
    }

    public boolean isEmpty(){
        boolean results = true;

        if (stack.length == 0)
            return results;

        for (T t : stack) {
            if (t != null) {
                results = false;
            }
        }
        return results;
    }

    public T peek(){

        if (isEmpty()) {
            return null;
        }

        T results = stack[numberOfEntries - 1];

        return results;
    }

    public T push(T anEntry){
        if (isFull()) {
            reSize();
        }

        stack[numberOfEntries] = anEntry;
        numberOfEntries++;

        return anEntry;
    }

    public int search(T desiredEntry){
        int counter = 1;
        int entryNumber = 0;
        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] == desiredEntry){
                entryNumber = counter;
                return entryNumber;
            }
            if (stack[i] != null) {
                counter++;
            }
        }
        // Returns 0 if OBJ is not in stack.
        return 0;
    }

    private boolean isFull(){

        boolean results = false;

        if (numberOfEntries == stack.length) {
            results = true;
        }

        return results;
    }

    private void reSize(){
        int tempLength = stack.length + 1;

        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[tempLength];

        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }

        stack = temp;
    }

}
