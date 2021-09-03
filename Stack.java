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
}
