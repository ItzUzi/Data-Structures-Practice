public class Stack<T> {
    
    private T[] stack;
    private final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    Stack(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[DEFAULT_CAPACITY];
        stack = temp;
        numberOfEntries = 0;
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

        T results = stack[numberOfEntries];
        stack[numberOfEntries] = null;
        numberOfEntries--;

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

        T results = stack[numberOfEntries];

        return results;
    }

    public T push(T anEntry){
        if (isFull()) {
            reSize();
        }

        return null;
    }

    private boolean isFull(){

        boolean results = false;

        if (numberOfEntries == stack.length - 1) {
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
